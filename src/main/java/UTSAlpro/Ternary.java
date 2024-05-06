package UTSAlpro;

import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double tarifPerKm = 3500; 
        double bonus = 0.1; 
        
        System.out.print("Masukkan jarak perjalanan (dalam kilometer): ");
        double jarak = input.nextDouble();
        
        double biaya = (jarak <= 20) ? jarak * tarifPerKm : (20 * tarifPerKm) + (jarak - 20) * tarifPerKm * (1 + bonus);
        
        System.out.println("Biaya perjalanan: Rp " + biaya);
    }
}

