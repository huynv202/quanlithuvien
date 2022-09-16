package com.example.quanlithuvien.Controller;


import com.example.quanlithuvien.model.nhaXuatBan;
import com.example.quanlithuvien.repository.NhaXuatBanrepository;
import com.example.quanlithuvien.service.NhaXuatBanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nxb")

public class NXBController {

 private final NhaXuatBanService nhaXuatBanService;

    @Autowired
    public NXBController(NhaXuatBanService nhaXuatBanService) {
        this.nhaXuatBanService = nhaXuatBanService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<nhaXuatBan>> getAllNXB(){
        List<nhaXuatBan> nxb = nhaXuatBanService.findAllNhaXuatBan();
        return new ResponseEntity<>(nxb, HttpStatus.OK);
    }

    @PostMapping ("/add")
    public ResponseEntity<nhaXuatBan> addNXB(@RequestBody nhaXuatBan nxb){
          nhaXuatBan newNXB = nhaXuatBanService.addNhaXuatBan(nxb);
            return new ResponseEntity<>(newNXB, HttpStatus.CREATED);
        }

    @PutMapping("/update")
    public ResponseEntity<nhaXuatBan> updateNXB(@RequestBody nhaXuatBan nxb){
        nhaXuatBan updateNXB = nhaXuatBanService.updateNhaXuatBan(nxb);
        return new ResponseEntity<>(updateNXB, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteNXB(@PathVariable("id") Integer id){
        nhaXuatBanService.deleteNhaXuatBanById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
