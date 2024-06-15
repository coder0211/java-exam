package com.example.exam.controller;

import com.example.exam.model.NhanVien;
import com.example.exam.repository.NhanVienRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/nhanvien")
@CrossOrigin(origins = "http://localhost:3000")
public class NhanVienController {


    public NhanVienController(NhanVienRepository nhanVienRepository) {
        this.nhanVienRepository = nhanVienRepository;
    }

    private final NhanVienRepository nhanVienRepository;

    @GetMapping("")
    public ResponseEntity<List<NhanVien>> list() {
        return ResponseEntity.ok(nhanVienRepository.findAll());
    }

    @PostMapping("")
    public ResponseEntity<NhanVien> add(@RequestBody NhanVien nhanVien) {
        return ResponseEntity.ok(nhanVienRepository.save(nhanVien));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> remove(@PathVariable(name = "id") String id) {
        nhanVienRepository.deleteById(id);
        return ResponseEntity.ok("OK");
    }
}
