package com.example.exam.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="PHONGBAN")
@Getter
@Setter
public class PhongBan {
    @Id
    @Column(length = 2)
    private String maPhong;
    @Column(length = 30, nullable = false)
    private String tenPhong;
}
