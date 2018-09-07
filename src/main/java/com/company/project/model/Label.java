package com.company.project.model;

import javax.persistence.*;

public class Label {
    @Id
    @Column(name = "label_id")
    private Integer labelId;

    @Column(name = "label_title")
    private String labelTitle;

    @Column(name = "user_id")
    private Integer userId;

    /**
     * @return label_id
     */
    public Integer getLabelId() {
        return labelId;
    }

    /**
     * @param labelId
     */
    public void setLabelId(Integer labelId) {
        this.labelId = labelId;
    }

    /**
     * @return label_title
     */
    public String getLabelTitle() {
        return labelTitle;
    }

    /**
     * @param labelTitle
     */
    public void setLabelTitle(String labelTitle) {
        this.labelTitle = labelTitle;
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
}