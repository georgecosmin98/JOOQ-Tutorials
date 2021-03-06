/*
 * This file is generated by jOOQ.
 */
package com.simple.spring.mysql.jooq.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tutorials implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long   id;
    private String title;
    private String description;
    private Byte   published;

    public Tutorials() {}

    public Tutorials(Tutorials value) {
        this.id = value.id;
        this.title = value.title;
        this.description = value.description;
        this.published = value.published;
    }

    public Tutorials(
        Long   id,
        String title,
        String description,
        Byte   published
    ) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.published = published;
    }

    /**
     * Getter for <code>test_db.tutorials.id</code>.
     */
    public Long getId() {
        return this.id;
    }

    /**
     * Setter for <code>test_db.tutorials.id</code>.
     */
    public Tutorials setId(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Getter for <code>test_db.tutorials.title</code>.
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Setter for <code>test_db.tutorials.title</code>.
     */
    public Tutorials setTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Getter for <code>test_db.tutorials.description</code>.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Setter for <code>test_db.tutorials.description</code>.
     */
    public Tutorials setDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Getter for <code>test_db.tutorials.published</code>.
     */
    public Byte getPublished() {
        return this.published;
    }

    /**
     * Setter for <code>test_db.tutorials.published</code>.
     */
    public Tutorials setPublished(Byte published) {
        this.published = published;
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Tutorials other = (Tutorials) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        }
        else if (!id.equals(other.id))
            return false;
        if (title == null) {
            if (other.title != null)
                return false;
        }
        else if (!title.equals(other.title))
            return false;
        if (description == null) {
            if (other.description != null)
                return false;
        }
        else if (!description.equals(other.description))
            return false;
        if (published == null) {
            if (other.published != null)
                return false;
        }
        else if (!published.equals(other.published))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
        result = prime * result + ((this.description == null) ? 0 : this.description.hashCode());
        result = prime * result + ((this.published == null) ? 0 : this.published.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Tutorials (");

        sb.append(id);
        sb.append(", ").append(title);
        sb.append(", ").append(description);
        sb.append(", ").append(published);

        sb.append(")");
        return sb.toString();
    }
}
