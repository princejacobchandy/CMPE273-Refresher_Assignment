package javaRefresher;

import java.util.Scanner;

public class Example {
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    String answer = input.nextLine();

    if (answer.equals("yes")){
        System.out.println("Yea I programmed this right!");
    }else{
        System.out.println("Awww :(");
    }
  }
}