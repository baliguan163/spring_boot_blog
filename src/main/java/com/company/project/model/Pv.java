package com.company.project.model;

import java.util.Date;
import javax.persistence.*;

public class Pv {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "countDate")
    private Date countdate;

    private Integer pv;

    private Integer uid;

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
     * @return countDate
     */
    public Date getCountdate() {
        return countdate;
    }

    /**
     * @param countdate
     */
    public void setCountdate(Date countdate) {
        this.countdate = countdate;
    }

    /**
     * @return pv
     */
    public Integer getPv() {
        return pv;
    }

    /**
     * @param pv
     */
    public void setPv(Integer pv) {
        this.pv = pv;
    }

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }
}