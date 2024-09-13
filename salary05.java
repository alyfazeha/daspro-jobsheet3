import java.util.Scanner;

/** 
 * salary05
 */
public class salary05 {

    public static void main(String[] args) {
        Scanner sal = new Scanner (System.in);

        short hourWork;
        int hourlyWages, grossSalary, tempGrossSalary;
        float bonus, tax;

        System.out.print("Enter your hour work: ");
        hourWork = sal.nextShort();
        System.out.print("Enter you hourly wages: ");
        hourlyWages = sal.nextInt();

        grossSalary = hourWork * hourlyWages;
        System.out.println("Your gross salary: " + grossSalary);

        bonus = 0.1f * grossSalary;
        System.out.println("Your bonus: " + bonus);

        tempGrossSalary = (int) (grossSalary + bonus);
        System.out.println("Your temporary gross salary: " + tempGrossSalary);

        tax = 0.05f * tempGrossSalary;
        System.out.println("Your tax: " + tax);

        float monthlySalary = tempGrossSalary - tax;
        System.out.println("Your monthly salary: " + monthlySalary);

    }
}