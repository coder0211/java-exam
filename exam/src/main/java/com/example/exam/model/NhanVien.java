package com.example.exam.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "NHANVIEN")
@Getter
@Setter
public class NhanVien {
    @Id
    @Column(length = 3)
    private String maNV;
    @Column(length = 100, nullable = false)
    private String tenNV;
    @Column(length = 3)
    private String phai;
    @Column(length = 200)
    private String noiSinh;
    private double luong;

    @ManyToOne
    @JoinColumn(name = "maPhong")
    private PhongBan phongBan;

}
