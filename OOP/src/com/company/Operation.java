package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Operation {

    public static void main(String[] args) {
        while(true)
        {
            Scanner in = new Scanner(System.in);
            int a = in.nextInt();
            char oper = in.next().charAt(0);
            int b = in.nextInt();
            Execute(a,oper,b);
        }
    }
    static void Execute(int a, char oper, int b){
        if(oper == '+')
        {
            Sum summa = new Sum(a,oper,b);
        }
        if(oper == '-')
        {
            Dif differ = new Dif(a,oper,b);
        }
        if(oper == '*')
        {
            Mult multi = new Mult(a,oper,b);
        }
        if(oper == '/')
        {
            Div divis = new Div(a,oper,b);
        }
    }
}
class Sum extends Operation{
    public Sum(int a, char oper, int b){
        System.out.println(a + b);
    }
}
class Dif extends Operation{
    public Dif(int a, char oper, int b){
        System.out.println(a - b);
    }
}
class Mult extends Operation{
    public Mult(int a, char oper, int b){
        System.out.println(a * b);
    }
}
class Div extends Operation{
    public Div(int a, char oper, int b){
        System.out.println(a / b);
    }
}