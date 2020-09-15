/**
 * The Actor Object class.
 * @author William Knox
 */

package com.slate.model;

import javax.persistence.*;

@Table
@Entity
public class Actor {
    @Id
    private int id;
    private String username;
    private String location;
    private String portfolio;
    private String facebook;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(String portfolio) {
        this.portfolio = portfolio;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
}
