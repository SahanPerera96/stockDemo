package com.sahan.demo.demosampleui.modal;

import javax.persistence.*;
import java.util.List;

@Entity
public class OpenStock {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id = 0;

    int date;
    String user;
    String reason;

    @OneToMany(mappedBy = "openStock", cascade = CascadeType.ALL)
    List<OpenStockDetails> openStockDetails;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<OpenStockDetails> getOpenStockDetails() {
        return openStockDetails;
    }

    public void setOpenStockDetails(List<OpenStockDetails> openStockDetails) {
        this.openStockDetails = openStockDetails;
    }
}
