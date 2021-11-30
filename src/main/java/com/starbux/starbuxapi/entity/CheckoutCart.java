package com.starbux.starbuxapi.entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name="checkout_cart")
public class CheckoutCart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String order_id,payment_type,delivery_address;
    long user_id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "drinks_id")
    Drinks drinks;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name = "toppings_id")
    Toppings toppings;
    //long ;
    int qty;
    double price;
    @Column(updatable=false, insertable=false)
    String order_date;
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getOrder_id() {
        return order_id;
    }
    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getPayment_type() {
        return payment_type;
    }
    public void setPayment_type(String payment_type) {
        this.payment_type = payment_type;
    }
    public String getDelivery_address() {
        return delivery_address;
    }
    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getOrder_date() {
        return order_date;
    }
    public void setOrder_date(String order_date) {
        this.order_date = order_date;
    }
    public long getUser_id() {
        return user_id;
    }
    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public Drinks getDrinks() {
        return drinks;
    }
    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    public Toppings getToppings() {
        return toppings;
    }
    public void setToppings(Toppings toppings) {
        this.toppings = toppings;
    }




}