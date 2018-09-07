package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Fans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "noticer_id")
    private Integer noticerId;

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
     * @return noticer_id
     */
    public Integer getNoticerId() {
        return noticerId;
    }

    /**
     * @param noticerId
     */
    public void setNoticerId(Integer noticerId) {
        this.noticerId = noticerId;
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