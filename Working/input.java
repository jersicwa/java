package Working;
import java.util.Scanner;
public class input {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String nick = sc.nextLine();
    int age = sc.nextInt();
    System.out.println(nick+":"+age);
}
}
