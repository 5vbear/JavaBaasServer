package com.javabaas.server.admin.entity;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by Staryet on 15/6/5.
 */
@Document
public class Clazz {

    private String id;
    @DBRef
    private App app;
    private String name;
    private String description;
    private ClazzAcl acl;
    private boolean internal;
    transient private long count;

    public Clazz() {
    }

    public Clazz(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ClazzAcl getAcl() {
        return acl;
    }

    public void setAcl(ClazzAcl acl) {
        this.acl = acl;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }
}
