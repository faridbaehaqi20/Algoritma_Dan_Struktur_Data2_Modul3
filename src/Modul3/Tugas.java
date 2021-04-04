package Modul3;

import java.util.Scanner;

public class Tugas {
    public static void main(String[] args) {
        String data[] = {"Galileo", "Archimedes", "Alkhawarizmi", "Aljabar", "Nama Mahasiswa", "Tesla"};
        String key;
        
        //fitur scanner
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan data yang dicari: ");
        key = scan.nextLine();
        
        //menampilkan data array
        System.out.print("isi data adalah: ");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i] + " ");
        }
        System.out.println("");
        
        for (int i=0; i<=data.length; i++){
            if (key.equalsIgnoreCase(data[i])){
                System.out.print("Data "+key+" berada pada index ke - " + i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println();
        System.out.println("***** Terima kasih *****");
    }
    
}
