package com.example.quanlithuvien.model;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "NV_HUY_MUONSACH")

public class muonSach {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;

    @ManyToOne
    @JoinColumn(name = "ID_R",nullable = false)
    private banDoc banDoc;

    @ManyToOne
    @JoinColumn(name = "ID_S",nullable = false)
    private Sach sach;

    @Column(name = "SL")
    private int soLuong;

    @Column(name = "NGAY_MUON")
    private Date date_borrow;

    @Column(name = "NGAY_TRA")
    private Date date_return;
    @Column(name = "STATUS")
    private Integer trang_thai;

    @Column(name = "GHICHU")
    private String ghi_chu;

    public muonSach() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getDate_borrow() {
        return date_borrow;
    }

    public void setDate_borrow(Date date_borrow) {
        this.date_borrow = date_borrow;
    }

    public Date getDate_return() {
        return date_return;
    }

    public void setDate_return(Date date_return) {
        this.date_return = date_return;
    }

    public Integer getTrang_thai() {
        return trang_thai;
    }

    public void setTrang_thai(Integer trang_thai) {
        this.trang_thai = trang_thai;
    }

    public String getGhi_chu() {
        return ghi_chu;
    }


    public void setGhi_chu(String ghi_chu) {
        this.ghi_chu = ghi_chu;
    }

    public muonSach(int id, com.example.quanlithuvien.model.banDoc banDoc, Sach sach, int soLuong, Date date_borrow, Date date_return, Integer trang_thai, String ghi_chu) {
        this.id = id;
        this.banDoc = banDoc;
        this.sach = sach;
        this.soLuong = soLuong;
        this.date_borrow = date_borrow;
        this.date_return = date_return;
        this.trang_thai = trang_thai;
        this.ghi_chu = ghi_chu;
    }
}

