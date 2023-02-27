import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.println("Hello " + sc.next());
    }
}
