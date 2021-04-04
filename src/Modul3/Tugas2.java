package Modul3;

import java.util.Scanner;

public class Tugas2 {
    public static void main(String[]args){
        int A[] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int cari = 8;
        int N = 10;
        int IndeksAwal = 0;
        int IndeksAkhir = A.length-1;
        int ketemu = 0;
        int point = 0;
        
        System.out.println("Isi data adalah");
        for(int i=0; i<A.length; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
        System.out.println("");
        while ((IndeksAwal <= IndeksAkhir) && (ketemu == 0)){
        point = (IndeksAwal + IndeksAkhir) / 2;
        System.out.println("Indeks Pointer :"+ point);
            if (cari == A[point]){
                ketemu = 1;
                System.out.println("Data " + cari + "Telah ditemukan pada index ke " + point);
            }
            else if(cari < A[point]){
                System.out.println("Cari di kiri");
                IndeksAkhir = point-1;
            }
            else{
                IndeksAwal = point+1;
                System.out.println("Cari di kanan");
            }
        }
        if (ketemu == 1)
            System.out.println("Kesimpulan: data ditemukan ");
        else
            System.out.println("Kesimpulan: data tidak ditemukan ");
    }
}