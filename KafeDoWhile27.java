import java.util.Scanner;

public class KafeDoWhile27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int kopi,teh,roti,hargakopi = 12000, hargateh = 7000, hargaroti = 20000, totalharga;
        String namaPelanggan;

        do {
            System.out.print("Masukkan nama pelanggan (ketik batal untuk keluar): ");
            namaPelanggan = scanner.nextLine();
            if (namaPelanggan.equalsIgnoreCase("batal")) {
                System.out.println("transaksi dibatalkan");
                break;
            }
            System.out.print("jumlah kopi:");
            kopi = scanner.nextInt();
            System.out.print("jumlah teh:");
            teh = scanner.nextInt();
            System.out.print("jumlah roti:");
            roti = scanner.nextInt();

            totalharga = (kopi * hargakopi) + (teh * hargateh) + (roti * hargaroti);
            System.out.println("Total harga yang harus dibayar adalah: Rp " + totalharga);
            scanner.nextLine(); 
        } while (true);
        System.out.println("semua transaksi selesai");
    }
}
