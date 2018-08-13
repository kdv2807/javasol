package Salarycalculator;

import java.util.Scanner;

public class Salarycalculator {

    public static void main(String[] args) {
        int hra, specialallowance, pf, netpayablesalary, basicsalary, grosssalary;

        System.out.println("Enter your basic salary:");
        Scanner sc1 = new Scanner(System.in);
        basicsalary = sc1.nextInt();
        //int basicsalary=4000;

        hra = (50 * basicsalary) / 100;
        specialallowance = (75 * basicsalary) / 100;
        pf = (12 * basicsalary) / 100;
        grosssalary = basicsalary + hra + specialallowance;

        netpayablesalary = basicsalary + hra + specialallowance - pf;

        System.out.println("Basic salary       =" + basicsalary);
        System.out.println("HRA                =" + hra);
        System.out.println("Special allowance  =" + specialallowance);
        System.out.println("------------------------");
        System.out.println("Gross Salary       =" + grosssalary);
        System.out.println("------------------------");
        System.out.println("Deductions:");
        System.out.println("PF                 =-" + pf);

        System.out.println("------------------------");
        System.out.println("Net payable salary =" + netpayablesalary);
        System.out.println("------------------------");



    }
}

