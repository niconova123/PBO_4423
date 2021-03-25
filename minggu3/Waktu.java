public class Waktu {
    int detik, menit, jam;

    
    public Waktu(int jam, int menit, int detik) {
        this.jam = jam;
        this.menit = menit;
        this.detik = detik;

    }

    public static void main(String[] args) {
        // membuat objek dari class "Waktu"
        Waktu mulai = new Waktu(8, 12, 15);
        Waktu selesai = new Waktu(12, 34, 35);
        Waktu selisih;

        selisih = perbedaan(mulai, selesai);
        System.out.printf("Waktu awal= %d:%d:%d \n", mulai.jam, mulai.menit, mulai.detik);
        System.out.printf("Waktu selesai= %d:%d:%d \n", selesai.jam, selesai.menit, selesai.detik);
        System.out.printf("selisih waktu= %d:%d:%d \n", selisih.jam, selisih.menit, selisih.detik);

    }

    public static Waktu perbedaan(Waktu mulai, Waktu selesai) {
        Waktu selisih = new Waktu(0, 0, 0);

        // jika detik "mulai" lebih besar daripada detik "selesai"
        // ubah menit "selesai" ke dalam detik
        // dan tambahkan detik ke detik "selesai"
        if (mulai.detik > selesai.detik) {
            --selesai.menit;
            selesai.detik = selesai.detik + 60;
        }
        selisih.detik = selesai.detik - mulai.detik;

        // jika menit "mulai" lebih besar daripada menit "selesai"
        // ubah jam "selesai" ke dalam menit
        // kemudian tambahkan ke dalam menit "selesai"
        if (mulai.menit > selesai.menit) {
            --selesai.jam;
            selesai.menit = selesai.menit + 60;
        }
        selisih.menit = selesai.menit - mulai.menit;
        selisih.jam = selesai.jam - mulai.jam;

        // me-return perbedaan waktu
        return (selisih);

    }
}
