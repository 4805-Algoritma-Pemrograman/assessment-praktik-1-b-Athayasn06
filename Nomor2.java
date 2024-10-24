

import java.util.Scanner;

public class nomor2 {
    public static void main(String[] args){ 
    int taripPerMalam;
    int biayaPenginapan;
    int lamaMenginap;
    int kodeBungalow;
    double totalPendapatan;
    double biayaPelayanan;

    System.out.println("Masukkan kode bungalow [1/2/3]");
        
    System.out.println("Lama Menginap (malam)");
        
    System.out.println("Input lagi (Y/N)?");
    switch () {
        case 1 :
         kodeBungalow = 1;
         taripPerMalam = 50000;
         biayaPelayanan = (taripPerMalam * 0.30) + taripPerMalam;  
            break;
        case 2 :
         kodeBungalow = 2;
         taripPerMalam = 40000;
         biayaPelayanan = (taripPerMalam * 0.20) + taripPerMalam;
            break;
        case 3 :
         kodeBungalow = 3;
         taripPerMalam = 30000;
         biayaPelayanan = (taripPerMalam * 0.10) + taripPerMalam;
        default:
            throw new AssertionError();
    }
    System.out.println(("Total pendapatan = lamaMenginap") + biayaPelayanan);


  }
}

