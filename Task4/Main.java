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

menu.displayMenu();
	}
}