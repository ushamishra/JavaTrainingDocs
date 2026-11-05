import java.util.Scanner;

public class Hello{


public static void main(String args[]){

  

System.out.println("Enter your name");

Scanner sc = new Scanner(System.in);

String name = sc.nextLine();

System.out.println("Hello "+ name );

System.out.println("How are you ?" );

String userStatus = sc.nextLine();

if (userStatus.equals("fine"))

System.out.println("Great to hear that !!!" );

else

System.out.println("Sorry to know that!" );












}


}