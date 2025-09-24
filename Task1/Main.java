class Main{
	
public static void main(String[] args){
	

Team team1 = new Team("FC Barcelona");
Team team2 = new Team("PSG");
Team team3 = new Team("Liverpool");
Team team4 = new Team("Manchester City");
Team team5 = new Team("Inter Milan");
Team team6 = new Team("Real Madrid");

team1.setRank(1);
team2.setRank(2);
team3.setRank(4);
team4.setRank(3);
team5.setRank(5);
team6.setRank(6);

team1.addPlayer("Lamine Yamal");
team1.addPlayer("Pedri");
team1.addPlayer("Ferran Terran");



System.out.print(team1);
System.out.print(team2);
System.out.print(team3);
System.out.print(team4);
System.out.print(team5);
System.out.print(team6);

}





}