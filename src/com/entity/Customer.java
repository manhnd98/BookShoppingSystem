/**
 *
 */
package com.entity;

import java.io.Serializable;

public class Customer implements Serializable{
    private static final long serialVersionUID = 1L;

    private String customerID;
    private String customerName;
    private String city;
    private String mobile;

    public Customer() {

    }

    public Customer(String customerID, String customerName, String city, String mobile) {
        super();
        this.customerID = customerID;
        this.customerName = customerName;
        this.city = city;
        this.mobile = mobile;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "Customer [customerID=" + customerID + ", customerName=" + customerName + ", city=" + city + ", mobile="
                + mobile + "]";
    }

}