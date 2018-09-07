package com.company.project.model;

import javax.persistence.*;

public class Place {
    @Id
    @Column(name = "place_id")
    private Integer placeId;

    private String province;

    private String city;

    private String area;

    /**
     * @return place_id
     */
    public Integer getPlaceId() {
        return placeId;
    }

    /**
     * @param placeId
     */
    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return area
     */
    public String getArea() {
        return area;
    }

    /**
     * @param area
     */
    public void setArea(String area) {
        this.area = area;
    }
}