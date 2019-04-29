/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_array3;

/**
 * Copyright YurA
 * @author Yusril Anwar
 */
public class MainArray3 {
   
   
     public static void main(String[] args) {
         Tugas_Array3 ob = new Tugas_Array3();
        int [][] matrik1 = {
           //{kolom 0 , kolom 1}
             {1,2}, //baris ke-0
             {3,5}, // baris ke-1
             {6,7} // baris ke-2
         };
        int [][] matrik2 = {
           //{kolom 0 , kolom 1}
             {8,9}, //baris ke-0
             {10,11}, // baris ke-1
             {12,13} // baris ke-2
         };
       
     
        ob.setMatrik1(matrik1);
        ob.setMatrik2(matrik2);
     
       
        System.out.println("Matrik A: ");
        ob.tampil(ob.getMatrik1());
       
        System.out.println("matrik B: ");
         ob.tampil(ob.getMatrik2());
       
        System.out.println("Hasil Penjumlahan :");
         ob.setPenjumlahan(matrik1,matrik2);
         ob.tampil(ob.getPenjumlahan());
         
         
       
       
         System.out.println("Hasil Perkalian");
         double [][] matrik3 = {
           //{kolom 0 , kolom 1}
             {1,2}, //baris ke-0    
             {3,5}, // baris ke-1
             {6,7} // baris ke-2
         };                    //(Ini Tipe Data Double Array) agar
                              //membedakan pecahan desimal dengan bilangan bulat
        double [][] matrik4 = {
           //{kolom 0 , kolom 1}
             {8,9}, //baris ke-0
             {10,11}, // baris ke-1
             {12,13} // baris ke-2
         };
          double x=0.5;
         // Yang ini mengambill suatu Permodelan (Setter and Getter) yang telah
         // kita buat di class Tugass_array 3                                              
         ob.setPerkalian(matrik3,matrik4,x);
         ob.tampil(ob.getPerkalian());
//         ob.setMatrik2(matrik3);
//         ob.setMatrik1(matrik4);
         
       
    }
}
