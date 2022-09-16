package com.example.quanlithuvien.repository;


import com.example.quanlithuvien.model.banDoc;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ReaderRepository extends JpaRepository<banDoc,Integer>{
    @Query("delete from NV_HUY_READER where id = :id")
    void deleteBanDocById(@Param("id") Integer id);

    @Query("SELECT b FROM NV_HUY_READER b WHERE b.id = ?1")
    banDoc findbandocById( Integer id);
}

