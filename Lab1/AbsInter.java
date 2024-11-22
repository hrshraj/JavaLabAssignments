package lab1.java;

//QUestion3

import java.util.Scanner;

//Interface
interface BasicOperations {
 int sum(int a, int b, int c);

 double average(int a, int b, int c);

 int product(int a, int b, int c);
}

//Abstract Class
abstract class AdditionalOperations {
 abstract int largest(int a, int b, int c);

 abstract int smallest(int a, int b, int c);
}


class NumberOperations extends AdditionalOperations implements BasicOperations {

 
 public int sum(int a, int b, int c) {
     return a + b + c;
 }

 
 public double average(int a, int b, int c) {
     return (a + b + c) / 3.0;
 }

 public int product(int a, int b, int c) {
     return a * b * c;
 }

 
 @Override
 public int largest(int a, int b, int c) {
     return Math.max(a, Math.max(b, c));
 }

 @Override
 public int smallest(int a, int b, int c) {
     return Math.min(a, Math.min(b, c));
 }
}


public class AbsInter {

 public static void main(String[] args) {
     
     Scanner scanner = new Scanner(System.in);

  
     System.out.print("Enter the first integer: ");
     int num1 = scanner.nextInt();

     System.out.print("Enter the second integer: ");
     int num2 = scanner.nextInt();

     System.out.print("Enter the third integer: ");
     int num3 = scanner.nextInt();


     NumberOperations operations = new NumberOperations();

     
     System.out.println("Sum: " + operations.sum(num1, num2, num3));
     System.out.println("Average: " + operations.average(num1, num2, num3));
     System.out.println("Product: " + operations.product(num1, num2, num3));
     System.out.println("Largest: " + operations.largest(num1, num2, num3));
     System.out.println("Smallest: " + operations.smallest(num1, num2, num3));

     
     scanner.close();
 }
}
