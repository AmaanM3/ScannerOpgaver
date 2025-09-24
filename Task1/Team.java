import java.util.ArrayList;

class Team{
	
private String teamName;
private int teamRank;
private ArrayList<String> teamMates = new ArrayList<>();


//Constructor
public Team(String teamName){
	this.teamName = teamName;
	}

// Min setRank metode
public void setRank(int rank){
	this.teamRank = rank;
	}

// Tilføjge player metoden
public void addPlayer(String playerName){
	teamMates.add(playerName);
}


//ToString metoden
public String toString(){
	String players = "";
	for(String player : teamMates){
		players += player + "\n";
	}
	return "Hold: " + teamName + " -" + " Rang: " + teamRank + "\nSpillere:\n" + players + "\n";
}


}