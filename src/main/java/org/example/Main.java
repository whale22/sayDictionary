package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Run program = new Run();
        program.run();

    }


}

class Run {
    void run(){
        ArrayList<String> order = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        String say, author;
        order.add("종료");

        System.out.println("== 명언 앱 ==");

        while(true){
            System.out.print("명령) ");
            input=sc.nextLine();
            if(input.equals("종료")) break;
            else if(input.equals("등록")){
                System.out.print("**명언)");
                say=sc.nextLine();
                System.out.print("**작가)");
                author=sc.nextLine();
            }
        }
        System.out.println("프로그램을 종료합니다.");
        sc.close();
    }

    String input(){
        Scanner sc = new Scanner(System.in);
        String input;
        System.out.printf("명령) ");
        input=sc.nextLine();
        sc.close();
        return input;
    }
}

