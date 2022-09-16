package com.example.quanlithuvien.repository;

import com.example.quanlithuvien.model.Sach;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BookRepository extends JpaRepository<Sach,Integer> {

    @Query("delete from NV_HUY_SACH where id = ?1")
    void deleteBookById(Integer id);

    @Query("SELECT s FROM NV_HUY_SACH s WHERE s.id = ?1")
    Sach findBookById(Integer id);

}
