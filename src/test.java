import java.util.ArrayList;
import java.util.Scanner;
public class test {
	private static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		startGame();
		
	}
	public static void startGame(){
		player player1=createPlayer();
		player player2=createPlayer();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(player1.getName() + ", press enter when you're ready to begin.");
		myScanner.nextLine();
		player1.setOpponentBoardActual(player2.getMyBoard());
		player2.setOpponentBoardActual(player1.getMyBoard());

		boolean gameEnd=true;
		while(gameEnd==true){
			gameEnd=nextTurn(player1,player2);
			if (gameEnd == false) break;
			gameEnd=nextTurn(player2,player1);
		}
		

	}
	public static void printGrid(String[][] input, String[][] input1, String name, String otherName)
	{
		String[] letters = new String[]{
				"A","B","C","D","E","F","G","H","I","J"
		};
		System.out.print(name+ "'s board");
		for (int i = name.length(); i<53; i++)
		{
			System.out.print(" ");
		}
		System.out.print(otherName + "'s board");
		System.out.println();
		System.out.println("     1   2   3   4   5   6   7   8   9  10                        1   2   3   4   5   6   7   8   9  10");
		System.out.println();
	   for(int i = 0; i < 10; i++)
	   {
		  String currentLine1=letters[i]+"   ";
		  String currentLine2=letters[i]+"   ";
	      for(int j = 0; j < 10; j++)
	      {
	         currentLine1+="["+input[i][j]+"] ";
	         currentLine2+="["+input1[i][j]+"] ";
	      }
	      System.out.println(currentLine1+"                 "+currentLine2);
	      currentLine1="";
	      currentLine2="";
	   }
	}
	public static void printGridTemplate(String[][] input)
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		String[] letters = new String[]{
				"A","B","C","D","E","F","G","H","I","J"
		};
		System.out.println("     1   2   3   4   5   6   7   8   9  10");
		System.out.println();
	   for(int i = 0; i < 10; i++)
	   {
		  String currentLine1=letters[i]+"   ";
	      for(int j = 0; j < 10; j++)
	      {
	         currentLine1+="["+input[i][j]+"] ";
	      }
	      System.out.println(currentLine1);
	      currentLine1="";
	   }
	   System.out.println();
	}
	public static player createPlayer(){
		String[][] myBoard = new String[10][10];
		for(int i = 0; i < 10; i++){
		      for(int j = 0; j < 10; j++){
		    	  myBoard[i][j]=" ";
		      }
		   }
		System.out.println("Enter your name:");
		String name = myScanner.nextLine();
		ArrayList<String> aircraftCarrier = new ArrayList<String>();

		System.out.println("Enter the 1st aircraft carrier coordinates:");
		String coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		aircraftCarrier.add(coord);
		System.out.println("Enter the 2nd aircraft carrier coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		aircraftCarrier.add(coord);
		System.out.println("Enter the 3rd aircraft carrier coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		aircraftCarrier.add(coord);
		System.out.println("Enter the 4th aircraft carrier coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		aircraftCarrier.add(coord);
		System.out.println("Enter the 5th aircraft carrier coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		aircraftCarrier.add(coord);
		for (int i = 0; i < aircraftCarrier.size(); i++){
			coord = aircraftCarrier.get(i);
			coord = coord.toUpperCase();
			int first = Math.abs(coord.substring(0,1).compareTo("A"));
			int second = Integer.valueOf(coord.substring(1)) - 1;
			myBoard[first][second] = "A";
		}
		printGridTemplate(myBoard);
		
		ArrayList<String> battleship = new ArrayList<String>();
		
		System.out.println("Enter the 1st battleship coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		battleship.add(coord);
		System.out.println("Enter the 2nd battleship coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		battleship.add(coord);
		System.out.println("Enter the 3rd battleship coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		battleship.add(coord);
		System.out.println("Enter the 4th battleship coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		battleship.add(coord);
		for (int i = 0; i < battleship.size(); i++){
			coord = battleship.get(i);
			coord = coord.toUpperCase();
			int first = Math.abs(coord.substring(0,1).compareTo("A"));
			int second = Integer.valueOf(coord.substring(1)) - 1;
			myBoard[first][second] = "B";
		}
		printGridTemplate(myBoard);
		
		ArrayList<String> submarine = new ArrayList<String>();
		
		System.out.println("Enter the 1st submarine coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		submarine.add(coord);
		System.out.println("Enter the 2nd submarine coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		submarine.add(coord);
		System.out.println("Enter the 3rd submarine coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		submarine.add(coord);
		for (int i = 0; i < submarine.size(); i++){
			coord = submarine.get(i);
			coord = coord.toUpperCase();
			int first = Math.abs(coord.substring(0,1).compareTo("A"));
			int second = Integer.valueOf(coord.substring(1)) - 1;
			myBoard[first][second] = "S";
			}
		printGridTemplate(myBoard);
		
		ArrayList<String> cruiser = new ArrayList<String>();
		
		System.out.println("Enter the 1st cruiser coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		cruiser.add(coord);
		System.out.println("Enter the 2nd cruiser coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		cruiser.add(coord);
		System.out.println("Enter the 3rd cruiser coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		cruiser.add(coord);
		for (int i = 0; i < cruiser.size(); i++){
			coord = cruiser.get(i);
			coord = coord.toUpperCase();
			int first = Math.abs(coord.substring(0,1).compareTo("A"));
			int second = Integer.valueOf(coord.substring(1)) - 1;
			myBoard[first][second] = "C";
		}
		printGridTemplate(myBoard);
		
		ArrayList<String> destroyer = new ArrayList<String>();
		
		System.out.println("Enter the 1st destroyer coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		destroyer.add(coord);
		System.out.println("Enter the 2nd destroyer coordinates:");
		coord = myScanner.nextLine();
		while (checkIfDumb(coord))
		{
			System.out.println("Error. Enter the coordinates:");
			coord = myScanner.nextLine();
		}
		destroyer.add(coord);
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		
		player testPlayer = new player(aircraftCarrier, battleship, submarine, cruiser, destroyer, name);
		testPlayer.placeAircraftCarrier();
		testPlayer.placeBattleship();
		testPlayer.placeSubmarine();
		testPlayer.placeCruiser();
		testPlayer.placeDestroyer();
/*		player testPlayer=new player();*/
		return testPlayer;
	}
	public static boolean nextTurn(player player1, player player2){

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		printGrid(player1.getMyBoard(), player1.getOpponentBoard(), player1.getName(), player2.getName());
		String tempOutput=player1.checkForSunk();
		System.out.println(tempOutput);
		if(tempOutput.equals("GAME OVER YOU LOSE")){
			return false;
		}
		System.out.println("Enter the coordinates to attack:");
		String coordHit = myScanner.nextLine();
		while (checkIfDumb(coordHit))
		{
			System.out.println("Error. Enter the coordinates to attack:");
			coordHit = myScanner.nextLine();
		}
		player2.getHit(coordHit);
		printGrid(player1.getMyBoard(),player1.updateOpponentBoard(coordHit), player1.getName(), player2.getName());
		System.out.println("Press enter when you're ready to end your turn.");
		myScanner.nextLine();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println(player2.getName() + ", press enter when you're ready to begin your turn.");
		myScanner.nextLine();
		return true;
	}
	public static boolean checkIfDumb(String input)
	{
		input = input.toUpperCase();
		if (input.length()<1) return true;
		if (!(input.substring(0,1).equals("A")||input.substring(0,1).equals("B")||input.substring(0,1).equals("C")||input.substring(0,1).equals("D")||input.substring(0,1).equals("E")||input.substring(0,1).equals("F")||input.substring(0,1).equals("G")||input.substring(0,1).equals("H")||input.substring(0,1).equals("I")||input.substring(0,1).equals("J"))) return true;
		if (!(input.substring(1).equals("1")||input.substring(1).equals("2")||input.substring(1).equals("3")||input.substring(1).equals("4")||input.substring(1).equals("5")||input.substring(1).equals("6")||input.substring(1).equals("7")||input.substring(1).equals("8")||input.substring(1).equals("9")||input.substring(1).equals("10"))) return true;
		return false;
	}


}
