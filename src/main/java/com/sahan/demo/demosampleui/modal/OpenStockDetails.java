package com.sahan.demo.demosampleui.modal;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
public class OpenStockDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;

    Integer itemId;

    Integer quantity;

    @ManyToOne
    @JoinColumn
    @JsonIgnore
    OpenStock openStock;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public OpenStock getOpenStock() {
        return openStock;
    }

    public void setOpenStock(OpenStock openStock) {
        this.openStock = openStock;
    }
}
