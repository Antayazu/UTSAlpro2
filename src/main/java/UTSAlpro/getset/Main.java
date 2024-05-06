package UTSAlpro.getset;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tarifgrab hitungBiaya = new tarifgrab();

        System.out.print("Masukkan jarak perjalanan (dalam kilometer): ");
        double jarak = input.nextDouble();

        double biaya = hitungBiaya.hitungBiayaPerjalanan(jarak);

        System.out.println("Biaya perjalanan: Rp " + biaya);
    }
}