package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "cateName")
    private String catename;
    private Date date;
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
     * @return cateName
     */
    public String getCatename() {
        return catename;
    }

    /**
     * @param catename
     */
    public void setCatename(String catename) {
        this.catename = catename;
    }

    /**
     * @return date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date
     */
    public void setDate(Date date) {
        this.date = date;
    }
}