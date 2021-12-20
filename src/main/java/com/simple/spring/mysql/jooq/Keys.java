/*
 * This file is generated by jOOQ.
 */
package com.simple.spring.mysql.jooq;


import com.simple.spring.mysql.jooq.tables.Tutorials;
import com.simple.spring.mysql.jooq.tables.records.TutorialsRecord;

import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;


/**
 * A class modelling foreign key relationships and constraints of tables in 
 * test_db.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

    // -------------------------------------------------------------------------
    // UNIQUE and PRIMARY KEY definitions
    // -------------------------------------------------------------------------

    public static final UniqueKey<TutorialsRecord> KEY_TUTORIALS_PRIMARY = Internal.createUniqueKey(Tutorials.TUTORIALS, DSL.name("KEY_tutorials_PRIMARY"), new TableField[] { Tutorials.TUTORIALS.ID }, true);
}