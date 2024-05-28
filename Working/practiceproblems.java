package Working;

public class practiceproblems {
public static void main(String[] args) {
    //Write a Java program to print 'Hello' on screen and your name on a separate line.
    String name="Jessica";
    String hello="Hello";
    System.out.println(hello);
    System.out.println(name);

    //Write a Java program to print the sum of two numbers 74 + 36 = 110
    int x=74;
    int y=36;
    System.out.println(x+y);
    
    //Write a Java program to divide two numbers and print them on the screen 50/3
    x=50;
    y=3;
    System.out.println(x/y);

    //Write a Java program to print the results of the following operations.
        //a. -5 + 8 * 6
        //b. (55+9) % 9
        //c. 20 + -3*5 / 8
        //d. 5 + 15 / 3 * 2 - 8 % 3
    x=5;
    y=8;
    int z=6;
    System.out.println(-x+y*z);
   
    int sum=(55+9);
    int result=sum %9;
    System.out.println(result);

    int multiply=-3*5;
    int divide=multiply/8;
    result=divide+20;

    System.out.println(result);

    int frac=15/3;
    multiply=frac*2; 
    int rem=8%3;
    result=5+multiply-rem;
    System.out.println(result);

    
}
}
