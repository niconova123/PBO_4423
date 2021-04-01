import java.util.Scanner;
public class Motherboard {
    static class USB {

        int getTotalPorts(int usb_pertama, int usb_kedua) {
            return usb_pertama + usb_kedua;
        }
    }

    public static void main(String[] args) {

        // memanggil fungsi Scanner lewat variabel 'minta_input'
        Scanner minta_input = new Scanner(System.in);

        // memanggil class 'USB' lewat variabel 'tampilkanUSB'
        Motherboard.USB showUSB = new USB();

            // meminta input angka pertama
            System.out.println("masukkan angka pertama");
            int usb2 = minta_input.nextInt();

            // meminta input pada angka kedua
            System.out.println("masukkan angka kedua");
            int usb3 = minta_input.nextInt();
            System.out.println("Total Ports= " + showUSB.getTotalPorts(usb2, usb3));
   

    }
}