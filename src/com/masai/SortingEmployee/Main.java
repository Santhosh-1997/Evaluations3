package com.masai.SortingEmployee;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);

        TreeSet<Employee> ts = new TreeSet<>(new SortSalary());

        int count = 1;

        while(true){

            System.out.println("Enter employee detail " + count++);

            System.out.println("Enter employee Id");
            int empId = input.nextInt();


            System.out.println("Enter Name");
            String name = input.nextLine();

            input.nextLine();

            System.out.println("Enter Address");
            String address = input.next();

            input.nextLine();

            System.out.println("Enter Salary");
            double salary = input.nextDouble();

            ts.add(new Employee(empId,name,address,salary));

            if(count==5){
                break;
            }

        }

        for(Employee el: ts){
            System.out.println(el);
        }


    }
}
