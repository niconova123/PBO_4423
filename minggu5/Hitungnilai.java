package minggu5;

import java.util.ArrayList;
import java.util.Scanner;

class Hitungnilai {
    ArrayList<Double> Nilai = new ArrayList<Double>();
    ArrayList<String> Nama = new ArrayList<String>();

    //
    Scanner input = new Scanner(System.in);

    String nama;
    Double nilai;

    // meminta input nama
    public String mintaNama() {
        System.out.print("masukkan nama = ");
        nama = input.nextLine();
        input.nextLine();
        return nama;
    }

    void simpanNama() {
        Nama.add(nama);
    }

    // meminta input nilai
    public double mintaNilai() {
        System.out.print("masukkan nilai = ");
        nilai = input.nextDouble();
        input.nextLine();
        return nilai;
    }

    void simpanNilai() {
        Nilai.add(nilai);
    }


    void daftarNilai() {
       
        System.out.println("daftar nama = ");
        System.out.println(Nama);
        
        System.out.println();
        
        System.out.println("daftar nilai= ");
        System.out.println(Nilai);
        
    }

}
