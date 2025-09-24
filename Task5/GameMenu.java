import java.util.ArrayList; 
import java.util.Scanner;

class GameMenu{
	
private ArrayList<String> actions = new ArrayList<>();

// Constructor
public GameMenu(ArrayList<String> actions){
	this.actions = actions;

}
	public void displayMenu(){
		for(String action: actions){
		System.out.println(action);
		}
	}

public String promptUser(){
	System.out.println("Type a number to choose an action");

Scanner sc = new Scanner(System.in);
String choice =  sc.nextLine();


return choice;
	}

}