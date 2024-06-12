/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas_besar_mkepl;
/**
 *
 * @author Raychan
 */
public class PersegiPanjang extends Bentuk implements BangunDatar {
    private int lebar;
    private int panjang;

    public PersegiPanjang(String nama, int panjang, int lebar) {
        super(nama);
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void info() {
        System.out.println("Nama Persegi Panjang    : "+super.getNama());
        System.out.println("Panjang                 : "+this.panjang);
        System.out.println("Lebar                   : "+this.lebar);
    }

    @Override
    public double hitungKeliling() {
        return (2*this.panjang) + (2*this.lebar);
    }

    @Override
    public double hitungLuas() {
        return this.panjang*this.lebar;
    }
}
