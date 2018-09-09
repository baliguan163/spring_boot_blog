package com.company.project.model;

import javax.persistence.*;

public class Tags {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tagName")
    private String tagname;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return tagName
     */
    public String getTagname() {
        return tagname;
    }

    /**
     * @param tagname
     */
    public void setTagname(String tagname) {
        this.tagname = tagname;
    }
}