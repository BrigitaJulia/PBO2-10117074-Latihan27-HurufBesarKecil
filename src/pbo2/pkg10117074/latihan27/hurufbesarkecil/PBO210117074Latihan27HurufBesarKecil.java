/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117074.latihan27.hurufbesarkecil;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA : Brigita Julia Puspita Nai Goncalves
 * KELAS: PBO-2
 * NIM  : 10117074
 * Deskripsi Program: program ini berisi program yang menampilkan format huruf
 * besar dan huruf kecil
 */
public class PBO210117074Latihan27HurufBesarKecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Kalimat;
        System.out.print("Masukan Kalimat : ");
        Scanner scanner = new Scanner(System.in);
        Kalimat = scanner.nextLine();
        
        String Besar = Kalimat.toUpperCase();
        String Kecil = Kalimat.toLowerCase();
        System.out.println();
        System.out.println("========HasilFormating=======");
        System.out.println("Huruf besar = " + Besar);
        System.out.println("Huruf Kecil = " + Kecil);
    }
    
}
