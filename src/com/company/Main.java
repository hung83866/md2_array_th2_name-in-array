package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (1 > 0) {
            String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
            Scanner scanner = new Scanner(System.in);
            System.out.print("name === ");
            String input_name = scanner.nextLine();
            boolean isExist = false;
            for (int i = 0; i < students.length; i++) {
                if (students[i].equalsIgnoreCase(input_name)) {
                    System.out.println("vị trí === "+i);
                    isExist = true;
                    break;
                }
            }
            if (!isExist) {
                System.out.println("Không có nhé!");
            }
        }
    }
}
