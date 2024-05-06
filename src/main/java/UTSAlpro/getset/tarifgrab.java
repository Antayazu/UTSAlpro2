package UTSAlpro.getset;

import java.util.Scanner;

class tarifgrab {
    private double tarifPerKm;
    private double bonus;

    public tarifgrab() {
        this.tarifPerKm = 3500;
        this.bonus = 0.1;
    }

    public double hitungBiayaPerjalanan(double jarak) {
        double biaya;
        if (jarak <= 20) {
            biaya = jarak * tarifPerKm;
        } else {
            biaya = (20 * tarifPerKm) + (jarak - 20) * tarifPerKm * (1 + bonus);
        }
        return biaya;
    }

    public double getTarifPerKm() {
        return tarifPerKm;
    }

    public void setTarifPerKm(double tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
