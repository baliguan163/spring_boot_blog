package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Blog {
    @Id
    @Column(name = "blog_id")
    private Integer blogId;

    @Column(name = "blog_title")
    private String blogTitle;

    @Column(name = "blog_visit")
    private Integer blogVisit;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "blog_date")
    private Date blogDate;

    @Column(name = "blog_pv")
    private Integer blogPv;

    @Column(name = "blog_text")
    private String blogText;

    /**
     * @return blog_id
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * @param blogId
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * @return blog_title
     */
    public String getBlogTitle() {
        return blogTitle;
    }

    /**
     * @param blogTitle
     */
    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle;
    }

    /**
     * @return blog_visit
     */
    public Integer getBlogVisit() {
        return blogVisit;
    }

    /**
     * @param blogVisit
     */
    public void setBlogVisit(Integer blogVisit) {
        this.blogVisit = blogVisit;
    }

    /**
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return blog_date
     */
    public Date getBlogDate() {
        return blogDate;
    }

    /**
     * @param blogDate
     */
    public void setBlogDate(Date blogDate) {
        this.blogDate = blogDate;
    }

    /**
     * @return blog_pv
     */
    public Integer getBlogPv() {
        return blogPv;
    }

    /**
     * @param blogPv
     */
    public void setBlogPv(Integer blogPv) {
        this.blogPv = blogPv;
    }

    /**
     * @return blog_text
     */
    public String getBlogText() {
        return blogText;
    }

    /**
     * @param blogText
     */
    public void setBlogText(String blogText) {
        this.blogText = blogText;
    }
}