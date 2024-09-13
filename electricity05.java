import java.util.Scanner;

/**
 * electricity05
 */
public class electricity05 {

    public static void main(String[] args) {
        Scanner elec = new Scanner (System.in);
        int electricityTariff, electricityUsed;
        int electricityPerKWH = 1500;
        boolean electricityUsage;

        System.out.print("Enter electricity used in kWh: ");
        electricityUsed = elec.nextInt();
       
        electricityTariff = (electricityUsed * electricityPerKWH);
        System.out.println("Electricity tariff: Rp " + electricityTariff);

        electricityUsage = electricityUsed > 500;
        System.out.print("Electricity used exceeds 500 kWh : " + electricityUsage);
    }
}