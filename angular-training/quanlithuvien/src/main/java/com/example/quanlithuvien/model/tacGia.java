package com.example.quanlithuvien.model;

import javax.persistence.*;

@Entity(name = "NV_HUY_TACGIA")
public class tacGia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(name="MA_TACGIA")
    private int maTacGia;

    @Column(name = "TNAME")
    private String name;

    @Column(name = "TG_ADD")
    private String address;

    @Column(name = "PHONE")
    private String phone;

    @Column(name = "MOTA")
    private String mota;

    public tacGia() {
    }

    public tacGia(int id, String name, String address, String phone, String mota) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.mota = mota;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}

