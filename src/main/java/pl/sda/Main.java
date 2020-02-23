package pl.sda;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dzień");
        int day = input.nextInt();
        System.out.println("Podaj miesiąc");
        int month = input.nextInt();
        System.out.println("Podaj rok");
        int year = input.nextInt();

        LocalDate date = LocalDate.of(year,month,day);
        LocalDate today = LocalDate.now();

        long years = ChronoUnit.YEARS.between(date, today);
        long months = ChronoUnit.MONTHS.between(date,today);
        long days = ChronoUnit.DAYS.between(date, today);

        System.out.println("Lata " + years);
        System.out.println("Miesiące " + months);
        System.out.println("Dni " + days);
    }
}
