import java.util.Scanner;

class Main{
	
public static void main(String[] args){

	System.out.println("Please type your name");
	
	Scanner sc = new Scanner(System.in);

	String name = sc.nextLine();
		System.out.println("Hello " + name);
		System.out.println(name + " please enter your age");

	int age = sc.nextInt();
		System.out.println("You are " + age + " years old");

	int retirement = 67 - age;
		System.out.println("You have " + retirement + " years before retirement");

	}

}