package com.cathy.homeshop;

public class Customer {
    private String fullname;
    private String address;

    /**
     * constucteur customer
     * @param fullname
     * @param address
     */
    public Customer(String fullname, String address) {
        this.fullname = fullname;
        this.address = address;
    }

    public Customer() {
    }

    public String getFullname() {
        return fullname;
    }

    public String getAddress() {
        return address;
    }
}
