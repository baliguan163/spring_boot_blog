package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "father_id")
    private Integer fatherId;

    @Column(name = "blog_id")
    private Integer blogId;

    @Column(name = "user_id")
    private Integer userId;

    private Date date;

    @Column(name = "have_reply")
    private Boolean haveReply;

    private String content;

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
     * @return father_id
     */
    public Integer getFatherId() {
        return fatherId;
    }

    /**
     * @param fatherId
     */
    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

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

    /**
     * @return have_reply
     */
    public Boolean getHaveReply() {
        return haveReply;
    }

    /**
     * @param haveReply
     */
    public void setHaveReply(Boolean haveReply) {
        this.haveReply = haveReply;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }
}