package test;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        EmployeeFullTime eft = new EmployeeFullTime();
        EmployeeParttime ept = new EmployeeParttime();
        Scanner scanBaseSalaryFull = new Scanner(System.in);
        System.out.println("input base salary for full-time employee:");
        eft.baseSalary = scanBaseSalaryFull.nextFloat();
        Scanner scanBaseSalaryPart = new Scanner(System.in);
        System.out.println("input base salary for part-time employee:");
        ept.baseSalary = scanBaseSalaryPart.nextFloat();
        System.out.println("salary for full-time employee:" + eft.getSalary());
        System.out.println("salary for part-time employee:" + ept.getSalary());
    }
}
