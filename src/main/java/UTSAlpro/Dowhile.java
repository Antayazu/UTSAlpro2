package UTSAlpro;

import java.util.Scanner;

public class Dowhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarifPerKm = 3500; 
        double bonus = 0; // Bonus tambahan jika jarak perjalanan melebihi 20 km

        do {
            System.out.print("Masukkan jarak perjalanan (dalam kilometer): ");
            double jarak = input.nextDouble();

            double biaya = jarak * tarifPerKm; 

            if (jarak > 20) {
                bonus = 5000; // Bonus tambahan jika jarak perjalanan melebihi 20 km
            }

            double totalBiaya = biaya + bonus; 

            System.out.println("Biaya perjalanan: Rp " + biaya);
            System.out.println("Bonus tambahan: Rp " + bonus);
            System.out.println("Total biaya perjalanan: Rp " + totalBiaya);

            System.out.print("Apakah ingin menghitung biaya perjalanan lagi? (Ya/Tidak): ");
        } while (input.next().equalsIgnoreCase("Ya"));

        System.out.println("Terima kasih telah menggunakan aplikasi kalkulator biaya perjalanan.");
        input.close();
    }
}
