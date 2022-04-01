package typinghomework;

import java.util.Scanner;

public class Programme_5_SalarySlip {
    public static void main(String[] args) {
        //scanner declaration for reading input from console
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter your Name: ");
        String name = Scanner.nextLine();
        System.out.println("Enter your EmployeeID: ");
        int employeeId = Scanner.nextInt();

        System.out.println("Enter Basic Salary: ");
        double basicSalary = Scanner.nextDouble();

        // Calculating HRA,DA,TA and PF
        double hRA = calculateHRA(basicSalary);
        double da = calculateDA(basicSalary);
        double ta = calculateTA(basicSalary);
        double pf = calculatePF(basicSalary);

        // Calculating the gross salary
        double grossSalary = basicSalary + hRA + da + ta - pf;

        System.out.println("---------------------------------------");
        System.out.println("|Salary Slip                          |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Employee ID:" + employeeId + "                     |");
        System.out.println("|Employee Name:" + name + "                    |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Basic Salary: " + basicSalary + "                |");
        System.out.println("|HRA 10%     : " + hRA + "                 |");
        System.out.println("|TA 8%       : " + ta + "                 |");
        System.out.println("|DA 9%       : " + da + "                 |");
        System.out.println("|PF -20%     : " + pf + "                |");
        System.out.println("|-------------------------------------|");
        System.out.println("|Gross Salary: " + grossSalary + "                |");
        System.out.println("|-------------------------------------|");
        // Closing scanner object
        Scanner.close();
    }

    // Calculating HRA
    public static double calculateHRA(double basicSalary) {
        return (basicSalary * 10) / 100;
    }

    // Calculating DA
    public static double calculateDA(double basicSalary) {
        return (basicSalary * 8) / 100;
    }

    // Calculating TA
    public static double calculateTA(double basicSalary) {
        return (basicSalary * 9) / 100;
    }

    // Calculating PF
    public static double calculatePF(double basicSalary) {
        return (basicSalary * 20) / 100;
    }
}


