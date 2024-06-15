package com.example.exam.repository;

import com.example.exam.model.NhanVien;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface NhanVienRepository extends JpaRepository<NhanVien, String> {

}
