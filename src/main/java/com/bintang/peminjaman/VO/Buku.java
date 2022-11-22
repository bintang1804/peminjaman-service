/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bintang.peminjaman.VO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Bintang
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Buku {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long bukuId;
    private String judul;
    private String pengarang;
    private String penerbit;
    private String tahun_terbit;

}
