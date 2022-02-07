/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop.pkg1;

/**
 *
 * @author asus
 */
public class OOP1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        kelulusan hitung = new kelulusan();
        hitung.setNilai(80);
        hitung.kriteria(hitung.getNilai());
    }
    
}
