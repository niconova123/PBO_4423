package minggu5;

import java.util.ArrayList;
import java.util.Scanner;

public class Inputsiswa{
    ArrayList<String> Nama = new ArrayList<String>();
    ArrayList<String> Nim = new ArrayList<String>();

    ArrayList<Double> nilaipraktek = new ArrayList<Double>();
    ArrayList<Double> nilaiteori = new ArrayList<Double>();

    Scanner input = new Scanner(System.in);

    String nama, nim;
    double nilaiTeori, nilaiPraktek;

    public String getNIM() {
        System.out.print("masukkan nim = ");
        nim = input.nextLine();
        return nim;
    }

    void setNIM() {
        Nim.add(nim);
    }

    public String getNama() {
        System.out.print("masukkan nama = ");
        nama = input.nextLine();
        return nama;
    }

    void setNama() {
        Nama.add(nama);
    }

    public double getTeori() {
        System.out.print("masukkan nilai teori = ");
        nilaiTeori = input.nextFloat();
        input.nextLine();
        return nilaiTeori;
    }

    void setTeori() {
        nilaiteori.add(nilaiTeori);
    }

    public double getPraktek() {
        System.out.print("masukkan nilai praktek = ");
        nilaiPraktek = input.nextFloat();
        input.nextLine();
        return nilaiPraktek;
    }
    void setPraktek() {
        nilaipraktek.add(nilaiPraktek);
    }

    void tampilkanIsiData() {
        System.out.println("daftar nim = ");
        System.out.println(Nim);
        System.out.println();

        System.out.println("daftar nama = ");
        System.out.println(Nama);
        System.out.println();

        System.out.println("daftar nilai teori = ");
        System.out.println(nilaiteori);
        System.out.println();

        System.out.println("daftar nilai praktek = ");
        System.out.println(nilaipraktek);
        System.out.println();  

    }
}
