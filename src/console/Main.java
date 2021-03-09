package console;

import methods.LambdaMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LambdaMethods lMethods = new LambdaMethods();
        System.out.println("Enter the line:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Count lowercase letter: " + lMethods.countLowerCase(scan.nextLine()));

        List<String> list = new ArrayList<>();
        list.add("age");
        list.add("count");
        list.add("args");
        list.add("october");
        list.add("Name");
        lMethods.threeLetter(list);
        lMethods.maxCountLetter(list);
    }
}
