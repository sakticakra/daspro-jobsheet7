import java.util.Scanner;

public class siakadfor27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double nilai, Tertinggi = 0 , terendah = 100;

        for (int i = 1; i<= 10 ; i++){
            System.out.print("Masukkan nilai mahasiswa ke-" + i + ": ");
            nilai = scanner.nextDouble();

            if (nilai > Tertinggi) {
                Tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }
        System.out.println("Nilai tertinggi: " + Tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}