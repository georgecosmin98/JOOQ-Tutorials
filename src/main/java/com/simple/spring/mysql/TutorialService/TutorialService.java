package com.simple.spring.mysql.TutorialService;

import com.simple.spring.mysql.jooq.Tables;
import com.simple.spring.mysql.jooq.tables.pojos.Tutorials;
import com.simple.spring.mysql.model.Tutorial;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class TutorialService {

    @Autowired
    DSLContext context;

    public List<Tutorials> getTutorials() {
        return context.selectFrom(Tables.TUTORIALS)
                .fetchInto(Tutorials.class);
    }

    public Tutorials findById(Long id) {
        return context.selectFrom(Tables.TUTORIALS)
                .where(Tables.TUTORIALS.ID.eq(id))
                .fetchInto(Tutorials.class).get(0);
    }

    public int save(String title, String description, boolean published) {
        return context.insertInto(Tables.TUTORIALS,Tables.TUTORIALS.TITLE,Tables.TUTORIALS.DESCRIPTION,Tables.TUTORIALS.PUBLISHED)
                .values(title, description, (byte)(published? 1:0)).execute();
    }

    public int update(long id, String title, String description, boolean published) {
        return context.update(Tables.TUTORIALS)
                .set(Tables.TUTORIALS.TITLE, title)
                .set(Tables.TUTORIALS.DESCRIPTION, description)
                .set(Tables.TUTORIALS.PUBLISHED, (byte) (published ? 1 : 0))
                .where(Tables.TUTORIALS.ID.eq(id)).execute();
    }

    public int update(Tutorials tutorial) {
        return context.update(Tables.TUTORIALS)
                .set(Tables.TUTORIALS.TITLE, tutorial.getTitle())
                .set(Tables.TUTORIALS.DESCRIPTION, tutorial.getDescription())
                .set(Tables.TUTORIALS.PUBLISHED, tutorial.getPublished())
                .where(Tables.TUTORIALS.ID.eq(tutorial.getId())).execute();
    }

    public int deleteById(Long id) {
        return context.delete(Tables.TUTORIALS)
                .where(Tables.TUTORIALS.ID.eq(id))
                .execute();
    }

    public List<Tutorials> findByPublished(boolean published) {
        return context.selectFrom(Tables.TUTORIALS)
                .where(Tables.TUTORIALS.PUBLISHED.eq((byte) (published ? 1 : 0)))
                .fetchInto(Tutorials.class);
    }

    public List<Tutorials> findByTitleContaining(String title) {
        return context.selectFrom(Tables.TUTORIALS)
                .where(Tables.TUTORIALS.TITLE.contains(title))
                .fetchInto(Tutorials.class);
    }


    public int deleteAll() {
        return context.delete(Tables.TUTORIALS)
                .execute();
    }
}
