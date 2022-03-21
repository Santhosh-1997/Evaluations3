package com.masai.DateandTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {

    public long findAge(String date) throws InvalidException{

        boolean correct = date.matches("^\\d{2}-\\d{2}-\\d{4}");

        if(!correct)
            throw new InvalidException("please pass the date in correct format");

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate dateFormat = LocalDate.parse(date,dtf);

        LocalDate now = LocalDate.now();

        long diff = ChronoUnit.YEARS.between(dateFormat,now);
        if(diff<0)
            throw new InvalidException("Dob should not be in future");

        return diff;
    }


    public static void main(String[] args) {
        System.out.println("Enter the dob in dd-mm-yyyy");

        Scanner input = new Scanner(System.in);

        String date = input.next();

        Main m = new Main();
        try {
            long age = m.findAge(date);
            System.out.println(age);
        }catch(InvalidException e){
            System.out.println(e);
        }
    }
}
