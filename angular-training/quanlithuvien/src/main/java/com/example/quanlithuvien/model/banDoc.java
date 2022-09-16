package com.example.quanlithuvien.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "NV_HUY_READER")
public class banDoc {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @Column(name = "MA_READER")
    private int maBanDoc;
    @Column(name = "RNAME")
    private String name;
    @Column(name = "R_ADD")
    private String address;

    @Column(name = "RPHONE")
    private String phone;

    @Column(name = "R_ACC")
    private Date date_of_account;

    @Column(name = "R_BIRTH")
    private Date date_of_birth;

    @Column(name = "RANK")
    private Integer rank;



    public banDoc() {
    }

    public banDoc(int id, int maBanDoc, String name, String address, String phone, Date date_of_account, Date date_of_birth, Integer rank) {
        this.id = id;
        this.maBanDoc = maBanDoc;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.date_of_account = date_of_account;
        this.date_of_birth = date_of_birth;
        this.rank = rank;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getMaBanDoc() {
        return maBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        this.maBanDoc = maBanDoc;
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

    public Date getDate_of_account() {
        return date_of_account;
    }

    public void setDate_of_account(Date date_of_account) {
        this.date_of_account = date_of_account;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}

