package com.example.quanlithuvien.repository;


import com.example.quanlithuvien.model.tacGia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ActorRepository extends JpaRepository<tacGia,Integer> {
    @Query("delete from NV_HUY_TACGIA a where a.id = ?1")
    void deleteActorById(Integer id);

    @Query("SELECT a FROM NV_HUY_TACGIA a WHERE a.id = ?1")
    tacGia findActorById(Integer id);

}
