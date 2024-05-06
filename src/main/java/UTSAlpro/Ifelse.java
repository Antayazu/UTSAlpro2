package UTSAlpro;

import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jarak perjalanan (dalam km): ");
        double jarak = scanner.nextDouble();

        double biaya = 0;
        if (jarak <= 0) {
            System.out.println("Jarak tidak boleh kurang dari atau sama dengan 0 km.");
        } else if (jarak <= 20) {
            biaya = jarak * 3500;
        } else {
            biaya = 70000 + ((jarak - 20) * 2500);
        }

        System.out.printf("Biaya perjalanan: Rp%.2f\n", biaya);
    }
}

