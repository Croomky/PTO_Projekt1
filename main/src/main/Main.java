package main;

import main.Parser;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        Parser.Execute(scanner.nextLine());
    }

}
