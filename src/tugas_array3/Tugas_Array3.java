/*
 * Github yusril86
 * https://github.com/yusril86
 * follow me
 */
package tugas_array3;

/**
 *
 * @author Yusril
 * Copyright YurA
 */
public class Tugas_Array3 {
  private int [][] matrik1,matrik2,hasil;
  private double [][] perkalian;

    public double[][] getPerkalian() {
        return perkalian;
        
    }

    public void setPerkalian(double[][] matrik1,double [][] matrik2,double x) {
        perkalian= matrik1;
        perkalian = matrik2;
     
        
        int i, j ; // i=baris , j= kolom
        for (i=0; i<matrik1.length;i++){
          for (j=0; j<matrik1[i].length;j++)
            {
             
              perkalian[i][j]=  (matrik1[i][j]  + matrik2[i][j]) *x ; 
              
            }
        
        }
       
        matrik2=null;
        matrik1 = null ; //meghapus variable dari parameter dari memory
    }
    

    
    
    public int[][] getMatrik1() {
        return matrik1;
    }
    public void setMatrik1(int[][] matrik1) {
        this.matrik1 = matrik1;
        matrik1= null;
    }

    
    
    public int[][] getMatrik2() {
        return matrik2;
    }
    public void setMatrik2(int[][] matrik2) {
        this.matrik2 = matrik2;
        matrik2=null;
    }

    
    
    
    
    public int[][] getPenjumlahan() {
        return hasil;
    }
    public void setPenjumlahan(int[][] matrik1,int[][] matrik2) {
         hasil = matrik1;
         hasil= matrik2;
          int i, j ; // i=baris , j= kolom
 
        for (i=0; i<matrik2.length;i++){
          for (j=0; j<matrik2[i].length;j++)
            {
                
          
              hasil[i][j]= matrik1[i][j] + matrik2[i][j]; 
//                System.out.println(hasil[i][j]);
              
            }
          
        }
            matrik1=null;
            matrik2=null;  //meghapus variable dari parameter dari memory
    }
    
   
    
    
    
    

   public void tampil (int data [][])
   {  //mendeklarasikan baris dan kolom 
       int i ,j; // i = baris , j= kolom
       
       for (i=0; i<data.length; i++){
        for (j=0; j<data[i].length;j++)
           {
               System.out.print(data[i][j] + "  ");   
           }
           System.out.println();
       }
       data = null; //menghapus variabel parameter dari memory
   }
  
   
   
  
   public void tampil (double data [][])
   {  //mendeklarasikan baris dan kolom 
       int i ,j; // i = baris , j= kolom
       
       for (i=0; i<data.length; i++){
        for (j=0; j<data[i].length;j++)
           {
               System.out.print(data[i][j] + "  ");   
           }
           System.out.println();
       }
       data = null; //menghapus variabel parameter dari memory
   }
   
  
//    public static void main(String[] args) {
//        // TODO code application logic here
//    }
    
}
