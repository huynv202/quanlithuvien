package com.example.quanlithuvien.service;

import com.example.quanlithuvien.model.nhaXuatBan;
import com.example.quanlithuvien.repository.NhaXuatBanrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NhaXuatBanService {
    private final NhaXuatBanrepository nhaXuatBanRepository;

    @Autowired
    public NhaXuatBanService(NhaXuatBanrepository nhaXuatBanRepository) {
        this.nhaXuatBanRepository = nhaXuatBanRepository;
    }

    public void deleteNhaXuatBanById(Integer id) {
        nhaXuatBanRepository.deleteNhaXuatBanById(id);
    }

    public nhaXuatBan addNhaXuatBan(nhaXuatBan nhaXuatBan) {
        return  nhaXuatBanRepository.save(nhaXuatBan);
    }

    public nhaXuatBan findNhaXuatBanById(Integer id) {
        return nhaXuatBanRepository.findNhaXuatBanById(id);
    }

    public nhaXuatBan updateNhaXuatBan(nhaXuatBan nhaXuatBan){
        return nhaXuatBanRepository.save(nhaXuatBan);
    }

    public List<nhaXuatBan> findAllNhaXuatBan() {
        return nhaXuatBanRepository.findAll();
    }

}
