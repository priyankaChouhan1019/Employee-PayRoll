package com.bdlz.EmployeePayRoll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpPayRollServices {
    private List<EmpRollData> empPayRollList;
    public EmpPayRollServices(List<EmpRollData> empPayRollList) {
        this.empPayRollList = empPayRollList;
    }

    public static void main(String[] args){
        ArrayList<EmpRollData> empPayRollList = new ArrayList<>();
        EmpPayRollServices empPayRollServices = new EmpPayRollServices(empPayRollList);
        Scanner consoleInputReader = new Scanner(System.in);
        empPayRollServices.readEmpPayRollData(consoleInputReader);
        empPayRollServices.writeEmpPayRollData();
        System.out.println("Welcome to Java IO EmpPay Roll Programming");
    }

    private void writeEmpPayRollData() {
        System.out.println("Writing Employee Data To Console :" +empPayRollList);
    }

    private void readEmpPayRollData( Scanner consoleInputReader) {
        System.out.println("Enter Employee Id :");
        int id = consoleInputReader.nextInt();
        System.out.println("Enter Employee Name :");
        String name = consoleInputReader.next();
        System.out.println("Enter Employee Salary :");
        double salary = consoleInputReader.nextDouble();
        empPayRollList.add(new EmpRollData(id,name,salary));
    }
}
