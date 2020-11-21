/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119061.latihan57.vehicle;

/**
 *
 * @author Rheiza
 *  Nama     : Rheiza Akmal R
 * KELAS    : IF2
 * NIM      : 10119061
 * Deskripsi Program : Program ini dibuat untuk menampilkan model, brand. jumlah gear dan panjang board
 */
public class PBOIF210119061Latihan57Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Bicycle bicycle = new Bicycle();
        bicycle.setMyBrand("Trek Bike");
        bicycle.setMyModel("7.4FX");
        bicycle.setMyGearCount(23);
        System.out.println("Brand : " + bicycle.getMyBrand());
        System.out.println("Model : " + bicycle.getMyModel());
        System.out.println("Jumlah Gear : " + bicycle.getMyGearCount());
        System.out.println();
        SkateBoard skate = new SkateBoard();
        skate.setMyBrand("Ally Skate");
        skate.setMyModel("Rocket");
        skate.setMyBoardLength(54.5);
        System.out.println("Brand : " + skate.getMyBrand());
        System.out.println("Model : " + skate.getMyModel());
        System.out.println("Panjang Board : " + skate.getMyBoardLength());
    }
    
}
