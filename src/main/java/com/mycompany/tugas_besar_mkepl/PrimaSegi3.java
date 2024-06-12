/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tugas_besar_mkepl;
/**
 *
 * @author Raychan
 */
public class PrimaSegi3 extends Bentuk implements BangunRuang{
    private int alas;
    private int tinggi;
    private int tinggi_prisma;

    public PrimaSegi3(String nama, int alas, int tinggi, int tinggi_prisma) {
        super(nama);
        this.alas = alas;
        this.tinggi = tinggi;
        this.tinggi_prisma = tinggi_prisma;
    }


    @Override
    public void info() {
        System.out.printf("%-25s : %s\n", "Nama Prisma Segitiga", getNama());
        System.out.printf("%-25s : %s\n", "Alas Segitiga", alas);
        System.out.printf("%-25s : %s\n", "Tinggi Segitiga", tinggi);
        System.out.printf("%-25s : %s\n", "Tinggi Prisma", tinggi_prisma);
    }

    @Override
    public double hitungLuasPermukaan() {
        return Math.floor((alas + tinggi + Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2))) * tinggi_prisma);
    }

    @Override
    public double hitungVolume() {
        return 0.5 * alas * tinggi * tinggi_prisma;
    }
}
