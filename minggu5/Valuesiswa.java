package minggu5;

import java.util.Scanner;

public class Valuesiswa {
    public static void main(String[] args) {
        Inputsiswa Siswa = new Inputsiswa();
        Scanner input = new Scanner(System.in);

        int lagi;
        try {
           
            Siswa.getNIM();
            Siswa.setNIM();

            Siswa.getNama();
            Siswa.setNama();

            Siswa.getTeori();
            Siswa.setTeori();

            Siswa.getPraktek();
            Siswa.setPraktek();

            System.out.print("ingin isi berapa data lagi? = ");
            lagi = input.nextInt();

            for (int i = 0; i < lagi; i++) {
                
                Siswa.getNIM();
                Siswa.setNIM();

                Siswa.getNama();
                Siswa.setNama();

                Siswa.getTeori();
                Siswa.setTeori();

                Siswa.getPraktek();
                Siswa.setPraktek();
            }
            Siswa.tampilkanIsiData();
        } finally {
            input.close();
        }

    }
}