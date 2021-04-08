package minggu5;
import java.util.Scanner;

public class MainNilai {
    public static void main(String[] args) {

        Hitungnilai aksesNilai = new Hitungnilai();

        Scanner input = new Scanner(System.in);

        String cekNama;
        Integer ulangNama, ulangNilai;
        Double cekNilai;

        cekNama = aksesNilai.mintaNama();
        if (cekNama.isEmpty()) {
            System.out.println("nama masih kosong, silahkan isi dulu");
        }
        if (cekNama != null && cekNama.length() > 0) {
            System.out.println("nama akan disimpan");
            aksesNilai.simpanNama();
        }

        // meminta input nilai
        cekNilai = aksesNilai.mintaNilai();
        if (cekNilai == 0) {
            System.out.println("nilai masih kosong, silahkan isi dulu");
        }
        if (cekNilai != null) {
            System.out.println("nilai akan disimpan");
            aksesNilai.simpanNilai();
        }
        System.out.print("ingin memasukkan berapa nama lagi?= ");
        ulangNama = input.nextInt();
        for (int i = 0; i < ulangNama; i++) {
            aksesNilai.mintaNama();
            aksesNilai.simpanNama();
        }

        System.out.print("ingin memasukkan nilai lagi? (1,2,3,dst...) = ");
        ulangNilai = input.nextInt();
        for (int j = 0; j < ulangNilai; j++) {
            aksesNilai.mintaNilai();
            aksesNilai.simpanNilai();
        }
        System.out.println();
        aksesNilai.daftarNilai();
        input.close();
    }

}
