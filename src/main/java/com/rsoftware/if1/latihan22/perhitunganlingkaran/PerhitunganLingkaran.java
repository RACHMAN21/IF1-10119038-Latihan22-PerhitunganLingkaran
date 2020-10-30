package com.rsoftware.if1.latihan22.perhitunganlingkaran;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Deskripsi Program : Program ini berisi untuk menampilkan hasil perhitungan
 *                     sebuah lingkaran
 * 
 */

import java.util.Scanner; // import kelas Scanner

public class PerhitunganLingkaran {
    public static void main(String[] args) {
        final double PHI = 3.14;
        double k,L,r,rad;

        Scanner sc = new Scanner(System.in);
        rad = 0;

        System.out.println("========Perhitungan Lingkaran========");
        System.out.print("Masukkan nilai diameter lingkaran : ");
        try {
            rad = sc.nextDouble();
            r = rad / 2;
            k = 2 * PHI * r;
            L = PHI * r * r;
            System.out.println();
            System.out.println("=====Hasil Perhitungan Lingkaran=====");
            System.out.println("Jari-jari Lingkaran = " + String.format("%.2f",r) + " cm");
            System.out.println("Luas Lingkaran      = " + String.format("%.2f",L) + " cm");
            System.out.println("Keliling Lingkaran  = " + String.format("%.2f",k) + " cm");
            } catch (Exception e) {
                System.out.println("Nilai Diameter Tidak Sesuai!");
                sc.nextLine();
            }
    }
}