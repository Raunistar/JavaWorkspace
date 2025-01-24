package MyJavaWork;

import java.util.*;
public  class Main{
public static class Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public int product(int a,int b){
        return a*b;
    }
}
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Name :");
        String name=s.nextLine();
        System.out.println("hello "+ name);
        System.out.print(" a : ");
        int a=s.nextInt();
        System.out.print(" b : ");
        int b=s.nextInt();
        Calculator calc=new Calculator();
        System.out.println("Addition : "+ calc.add(a,b));
        System.out.println("Subtraction : "+ calc.subtract(a,b));
        System.out.println("Product : "+ calc.product(a,b));
    }
}