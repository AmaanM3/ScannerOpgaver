import java.util.ArrayList;

class Main{

	public static void main(String[] args){

	ArrayList<String> actions = new ArrayList<>();
	actions.add("1) Start game");
	actions.add("2) Resume game");
	actions.add("3) Pause game");
	actions.add("4) End game");

//Test print
//System.out.print(actions.get(1)); // expected output: "Resume game"

	//Instantiate gamemenu
	GameMenu menu = new GameMenu(actions);

    // Vis menuen og få brugerens valg
	menu.displayMenu();
	String usersChoice = menu.promptUser();
	System.out.println("You selected " + usersChoice);

//Konverterer brugerens valg til heltal
	int action = Integer.parseInt(usersChoice);

//Kalder doAction funktionen
	doAction(action);


}


public static void doAction(int action){

switch (action){
	case 1:
		System.out.println("The user has started the game");
		break;
	case 2:
		System.out.println("The user has resumed the game");
		break;
	case 3:
		System.out.println("The user has paused the game");
		break;
	case 4:
		System.out.println("The user has ended the game");
		break;

		}
	}
}

