package org.yw.springbootelasticsearch.model;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Handy {

    private String id;
    private String brand;

    private Date creationDate = new Date();
    private Map<String, String> details = new HashMap<>();

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public Map<String, String> getDetails() {
        return details;
    }

    public void setDetails(Map<String, String> details) {
        this.details = details;
    }
}
