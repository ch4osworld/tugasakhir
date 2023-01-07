import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menumakanan m1 = new menumakanan();
        int pilihan;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("-------------------------------");
            System.out.println("SELAMAT DATANG DI DIDAT RESTO");
            System.out.println("-------------------------------");
            System.out.println("SILAHKAN PILIH MENU YANG ANDA INGINKAN : ");
            System.out.println("1.INPUT PESAN MAKANAN");
            System.out.println("2.CETAK INPUT MAKANAN");
            System.out.println("3.BAYAR MAKANAN");
            System.out.println("4.CETAK STRUK PEMBAYARAN");
            System.out.println();
            System.out.print("MASUKAN PILIHAN ANDA = ");
            pilihan = input.nextInt();
            if (pilihan==1){
                m1.pesanmakanan();
            } else if (pilihan==2) {
                m1.cetakpesanan();
            } else if (pilihan==3) {
                m1.bayarmakanan();
            } else if (pilihan==4) {
                m1.cetakstruk();
            }else {
                System.out.println("OUT OF MENU!!!!!!");
            }

        }while (pilihan !=4);
    }
}