import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class menumakanan implements alat{
    java.io.File file = new File("strukresto.txt");

    int max = 500;
    int up = 0;
    Scanner menu = new Scanner(System.in);
    String [] id = new String[max];
    String [] nama = new String[max];
    int [] jumlah = new int[max];
    int [] harga = new int[max];
    int [] totbayar = new int[max];
    int [] jumbay = new int[max];
    int kembalian;
    int totseluruh;

    @Override
    public void pesanmakanan() {

        System.out.print("MASUKAN ID PESANAN     = ");
        id [up]= menu.next();
        System.out.print("MASUKAN NAMA MAKANAN   = ");
        nama[up] = menu.next();
        System.out.print("MASUKAN JUMLAH PESANAN = ");
        jumlah[up] = menu.nextInt();
        System.out.print("MASUKAN HARGA MAKANAN  = ");
        harga [up] = menu.nextInt();
        up++;
        System.out.println();
    }

    @Override
    public void cetakpesanan() {
        for (int i = 0; i<up; i++){
            System.out.println();
            System.out.println(i+1+"."+"ID PESANAN     = "+id[i]);
            System.out.println("  NAMA MAKANAN   = "+nama[i]);
            System.out.println("  JUMLAH PESANAN = "+jumlah[i]);
            System.out.println("  HARGA MAKANAN  = "+harga[i]);
            totbayar[i] = harga[i]*jumlah[i];
            System.out.println("  TOTAL          = "+totbayar[i]);
            System.out.println();
        }
    }

    @Override
    public void bayarmakanan() {
        for (int j = 0; j<up; j++){
            System.out.println();
            System.out.println(j+1+"."+"ID PESANAN       = "+id[j]);
            System.out.println("  NAMA MAKANAN     = "+nama[j]);
            System.out.println("  JUMLAH PESANAN   = "+jumlah[j]);
            System.out.println("  HARGA MAKANAN    = "+harga[j]);
            totbayar[j] = harga[j]*jumlah[j];
            System.out.println("  TOTAL          = "+totbayar[j]);
            totseluruh = totseluruh+totbayar[j];
            System.out.println();
            }
        System.out.println("TOTAL PEMBAYARAN = "+totseluruh);
        System.out.print("MASUKAN NOMINAL  = ");
        jumbay[up] = menu.nextInt();
        kembalian = jumbay[up]-totseluruh;
        System.out.println("KEMBALIAN ANDA   = "+kembalian);
        }


    @Override
    public void cetakstruk() {
        try {
            java.io.PrintWriter out = new PrintWriter("strukresto.txt");
            for (int k = 0; k<up; k++){
                out.println(k+1+"."+"ID PESANAN        = "+id[k]);
                out.println("  NAMA MAKANAN      = "+nama[k]);
                out.println("  JUMLAH PESANAN    = "+jumlah[k]);
                out.println("  HARGA MAKANAN     = "+harga[k]);
                totbayar[k] = jumlah[k]*harga[k];
                out.println("  TOTAL             = "+totbayar[k]);
            }
                out.println();
                out.println("----------------------------------");
                out.println("  TOTAL BELANJAAN   = "+totseluruh);
                out.println("  JUMLAH PEMBAYARAN = "+jumbay[up]);
                out.println("  KEMBALIAN ANDA    = "+kembalian);
            System.out.println("BERHASIL MENCETAK,SILAHKAN PRINT FILE TXT");
            out.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
