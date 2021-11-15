package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        input();
    }
    public static void input(){
        boolean valid = true;
        try {
            while(valid) {
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("raffle number");
                int option = Integer.parseInt(br.readLine());
                valid = check(option);
            }
        }
        catch (Exception e){
            System.out.println("invalid input");
        }
    }

    private static boolean check(int option) {
        switch(option){
            case 464565656:
                System.out.println("test");
            case 0:
                System.out.println("sheesh");
        }return false;
    }
}
