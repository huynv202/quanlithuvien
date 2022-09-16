package com.example.quanlithuvien.repository;


import com.example.quanlithuvien.model.muonSach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MuonSachRepository extends JpaRepository<muonSach,Integer> {
    @Query("delete from NV_HUY_MUONSACH a where a.id = ?1")
    void deleteMuonSachById(Integer id);

    @Query("SELECT m FROM NV_HUY_MUONSACH m WHERE m.id = ?1")
    muonSach findMuonSachById(Integer id);
}
