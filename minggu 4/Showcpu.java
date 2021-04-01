public class Showcpu {
    public static void main(String[] args) {
        // memanggil class 'CPU' lewat variabel
        // 'visitCPU'
        Cpu visitCPU = new Cpu();

        /*
         * variabel 'showProcie' akan memanggil class 'Processor' yang ada di dalam
         * class 'CPU'.
         * 
         * Tapi, variabel ini memerintahkan si variabel 'visitCPU' karena
         * 'showProcie' tidak bisa melakukannya tanpa orang dalam . Jadi, variabel
         * 'visitCPU' merupakan orang suruhan dari variabel 'showProcie'
         */
        Cpu.Processor showProcie = visitCPU.new Processor();

        // menampilkan isi dari method getCache()
        System.out.printf("Processor Cache= %.1f\n", showProcie.getCache());

        /*
         * variabel 'tampilkanRAM' akan memanggil class 'ram' yang ada di dalam class
         * 'CPU'.
         * 
         * Tapi, variabel ini memerintahkan si variabel 'kunjungiCPU' karena
         * 'tampilkanRAM' tidak bisa melakukannya tanpa orang dalam . Jadi, variabel
         * 'kunjungiCPU' merupakan orang suruhan dari variabel 'tampilkanRAM'
         */
        Cpu.RAM tampilkanRAM = visitCPU.new RAM();

        // menampilkan isi dari method getClockSpeed()
        System.out.printf("Ram Clock Speed = %.1f\n", tampilkanRAM.getClockSpeed());
    }
}
