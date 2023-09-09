

import javax.swing.JOptionPane;

public class test {




    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int angka1 = 12;
        int angka2 = 20;
        
        int hasilJumlah= angka1+angka2;
        int hasilKurang= angka1-angka2;
        int hasilKali= angka1*angka2;
        int hasilBagi= angka1/angka2;
        int hasilModulus= angka1%angka2;
        
        System.out.println("Hasil Penjumlahan: "+hasilJumlah);
        
       String nama = JOptionPane.showInputDialog("nama") ;       
// TODO code application logic here
    }
    
}

    

