package com.example.quanlithuvien.model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "NV_HUY_SACH")
public class Sach {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private int id;


    @Column(name="MA_SACH")
    private int maSach;

    @Column(name = "SNAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "ID_NXB" ,nullable = false)
    private nhaXuatBan nhaXuatBan;

    @ManyToOne
    @JoinColumn(name = "ID_TACGIA" ,nullable = false)
    private tacGia tacGia;



    @Column(name = "CHUDE")
    private String content;

    @Column(name = "NAM_XB")
    private Date namxuatban;

    @Column(name = "MOTA")
    private String mota;

    @Column(name = "SL_CL")
    private int soLuongConLai;
    @Column(name = "SL_DM")
    private int soLuongDangMuon;

    @Column(name = "TONG_SACH")
    private int toTal;

    public Sach() {
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



    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getNamxuatban() {
        return namxuatban;
    }

    public void setNamxuatban(Date namxuatban) {
        this.namxuatban = namxuatban;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoLuongConLai() {
        return soLuongConLai;
    }

    public void setSoLuongConLai(int soLuongConLai) {
        this.soLuongConLai = soLuongConLai;
    }

    public int getSoLuongDangMuon() {
        return soLuongDangMuon;
    }

    public void setSoLuongDangMuon(int soLuongDangMuon) {
        this.soLuongDangMuon = soLuongDangMuon;
    }

    public int getToTal() {
        return toTal;
    }

    public void setToTal(int toTal) {
        this.toTal = toTal;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public Sach(int id, int maSach, String name, com.example.quanlithuvien.model.nhaXuatBan nhaXuatBan, com.example.quanlithuvien.model.tacGia tacGia, String content, Date namxuatban, String mota, int soLuongConLai, int soLuongDangMuon, int toTal) {
        this.id = id;
        this.maSach = maSach;
        this.name = name;
        this.nhaXuatBan = nhaXuatBan;
        this.tacGia = tacGia;
        this.content = content;
        this.namxuatban = namxuatban;
        this.mota = mota;
        this.soLuongConLai = soLuongConLai;
        this.soLuongDangMuon = soLuongDangMuon;
        this.toTal = toTal;
    }
}

