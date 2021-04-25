import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Queuelist{

    Queue<String> makananFavorit;

    Queuelist(){
        makananFavorit=new LinkedList<>();
    }
    Scanner tanyaMakanan=new Scanner(System.in);

    String namaMakanan;

    boolean cekApakahPenuh(){
        if(makananFavorit.size() <=0){
            return false;
        }else{
            return true;
        }
    }

    boolean cekApakahKosong(){
        if(makananFavorit.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    void enqueue(){
        System.out.print("makanan kesukaan kalian apa? = ");
        namaMakanan= tanyaMakanan.nextLine();
        tanyaMakanan.nextLine();
        System.out.println();
        makananFavorit.add(namaMakanan);
        System.out.println(namaMakanan +" dimasukkan dalam queue");
        System.out.println();
    }
    void dequeue(){
        if (makananFavorit.isEmpty()){
            System.out.println("queue sudah kosong,tidak bisa menghapus anggota queue lagi");
        }else {
            String makananDihapus;
            makananDihapus=makananFavorit.remove();
            System.out.println("makanan yang terhapus adalah = "+makananDihapus);
        }

    }

    void cariMakananDalamQueue(){
        String makananDicari;
        System.out.print("masukkan makanan yang dicari = ");
        makananDicari= tanyaMakanan.nextLine();
        System.out.println(); 
        if(makananFavorit.contains(makananDicari)){
                System.out.print(makananDicari+" ada di dalam queue makanan favorit!");
        }else {
            System.out.println(makananDicari+ " tidak ada dalam queue makanan favorit");
        }


    }

}