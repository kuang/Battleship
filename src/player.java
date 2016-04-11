import java.util.ArrayList;

public class player {
	private String[][] myBoard = new String[10][10];
	private String[][] opponentBoard = new String[10][10];
	private String[][] opponentBoardActual = new String[10][10];

	private ArrayList<String> aircraftCarrier = new ArrayList<String>();
	private ArrayList<String> battleship = new ArrayList<String>();
	private ArrayList<String> submarine = new ArrayList<String>();
	private ArrayList<String> cruiser = new ArrayList<String>();
	private ArrayList<String> destroyer = new ArrayList<String>();
	private boolean aircraftSunk = false;
	private boolean battleshipSunk = false;
	private boolean submarineSunk = false;
	private boolean cruiserSunk = false;
	private boolean destroyerSunk = false;
	
	private String name;
	
	public player()
	{
		for(int i = 0; i < 10; i++){
		      for(int j = 0; j < 10; j++){
		    	  myBoard[i][j]=" ";
		    	  opponentBoard[i][j]=" ";
		      }
		   }
		/*myBoard[0][0] = "A";
		myBoard[0][1] = "A";
		myBoard[0][2] = "A";
		myBoard[0][3] = "A";
		myBoard[0][4] = "A";
		myBoard[1][0] = "B";
		myBoard[1][1] = "B";
		myBoard[1][2] = "B";
		myBoard[1][3] = "B";
		myBoard[2][0] = "S";
		myBoard[2][1] = "S";
		myBoard[2][2] = "S";
		myBoard[3][0] = "C";
		myBoard[3][1] = "C";
		myBoard[3][2] = "C";*/
		myBoard[4][0] = "D";
		myBoard[4][1] = "D";
		name = "Will";
	}
	public player(ArrayList<String> aircraftCarrier)
	{
		this.aircraftCarrier = aircraftCarrier;
		for(int i = 0; i < 10; i++){
		      for(int j = 0; j < 10; j++){
		    	  myBoard[i][j]=" ";
		    	  opponentBoard[i][j]=" ";
		      }
		   }
	}
	
	public player(ArrayList<String> aircraftCarrier, ArrayList<String> battleship, ArrayList<String> submarine, ArrayList<String> cruiser, ArrayList<String> destroyer, String name){
		this.aircraftCarrier=aircraftCarrier;
		this.battleship = battleship;
		this.submarine = submarine;
		this.cruiser = cruiser;
		this.destroyer = destroyer;
		this.name = name;
		for(int i = 0; i < 10; i++){
		      for(int j = 0; j < 10; j++){
		    	  myBoard[i][j]=" ";
		    	  opponentBoard[i][j]=" ";
		      }
		   }
		
	}
	
	public void placeAircraftCarrier(){
		for (int i = 0; i < aircraftCarrier.size(); i++){
			String coord = aircraftCarrier.get(i);
			coord = coord.toUpperCase();
			int first = Math.abs(coord.substring(0,1).compareTo("A"));
			int second = Integer.valueOf(coord.substring(1)) - 1;
			myBoard[first][second] = "A";
		}
		}
	public void placeBattleship(){
		for (int i = 0; i < battleship.size(); i++){
			String coord = battleship.get(i);
			coord = coord.toUpperCase();
			int first = Math.abs(coord.substring(0,1).compareTo("A"));
			int second = Integer.valueOf(coord.substring(1)) - 1;
			myBoard[first][second] = "B";
		}
	}
	public void placeSubmarine(){
		for (int i = 0; i < submarine.size(); i++){
			String coord = submarine.get(i);
			coord = coord.toUpperCase();
			int first = Math.abs(coord.substring(0,1).compareTo("A"));
			int second = Integer.valueOf(coord.substring(1)) - 1;
			myBoard[first][second] = "S";
			}
	}
	public void placeCruiser(){
		for (int i = 0; i < cruiser.size(); i++){
			String coord = cruiser.get(i);
			coord = coord.toUpperCase();
			int first = Math.abs(coord.substring(0,1).compareTo("A"));
			int second = Integer.valueOf(coord.substring(1)) - 1;
			myBoard[first][second] = "C";
		}
			}
	public void placeDestroyer(){
			for (int i = 0; i < destroyer.size(); i++){
				String coord = destroyer.get(i);
				coord = coord.toUpperCase();
				int first = Math.abs(coord.substring(0,1).compareTo("A"));
				int second = Integer.valueOf(coord.substring(1)) - 1;
				myBoard[first][second] = "D";
			}
				}
	public String[][] getMyBoard()
	{
		return myBoard;
	}
	public String[][] getOpponentBoard()
	{
		return opponentBoard;
	}
	public String checkForSunk(){
		String allCharacters="";
		boolean aircraftSunkTemp = false;
		boolean battleshipSunkTemp = false;
		boolean submarineSunkTemp = false;
		boolean cruiserSunkTemp = false;
		boolean destroyerSunkTemp = false;
		for(int i = 0; i < 10; i++)
		 {
			for(int j = 0; j < 10; j++)
			{
		       allCharacters+=myBoard[i][j];
		    }
		 }
		if(!(allCharacters.contains("D")||allCharacters.contains("A")||allCharacters.contains("B")||allCharacters.contains("S")||allCharacters.contains("C"))){
			return "GAME OVER YOU LOSE";		}
		
		
		if(!allCharacters.contains("A"))
		{
			aircraftSunkTemp = true;
		}
		if(aircraftSunkTemp == true && aircraftSunk == false)
		{
			aircraftSunk = true;
			return "Your aircraft carrier has been sunk.";
		}
		if(!allCharacters.contains("D"))
		{
			destroyerSunkTemp = true;
		}
		if(destroyerSunkTemp == true && destroyerSunk == false)
		{
			destroyerSunk = true;
			return "Your destroyer has been sunk.";
		}
		
		if(!allCharacters.contains("S"))
		{
			submarineSunkTemp = true;
		}
		if(submarineSunkTemp == true && submarineSunk == false)
		{
			submarineSunk = true;
			return "Your submarine has been sunk.";
		}
		
		if(!allCharacters.contains("C"))
		{
			cruiserSunkTemp = true;
		}
		if(cruiserSunkTemp == true && cruiserSunk == false)
		{
			cruiserSunk = true;
			return "Your cruiser has been sunk.";
		}
		if(!allCharacters.contains("B"))
		{
			battleshipSunkTemp = true;
		}
		if(battleshipSunkTemp == true && battleshipSunk == false)
		{
			battleshipSunk = true;
			return "Your battleship has been sunk.";
		}

		
		
		
		
		return "";
	}
	public void setOpponentBoardActual(String[][] input){
		opponentBoardActual = input;
	}
	public String[][] updateOpponentBoard(String input)
	{
		input = input.toUpperCase();
		int first = Math.abs(input.substring(0,1).compareTo("A"));
		int second = Integer.valueOf(input.substring(1)) - 1;
		if (opponentBoardActual[first][second].equals(" ")){
			opponentBoard[first][second] = "O";
		}
		else
			opponentBoard[first][second] = "X";
		return opponentBoard;
	}
	public boolean checkGameEnd()
	{
		
		if (aircraftSunk == true && battleshipSunk == true && submarineSunk == true && cruiserSunk == true && destroyerSunk== true) return true;
		return false;
	}
	public void getHit(String input){
		input = input.toUpperCase();
		int first = Math.abs(input.substring(0,1).compareTo("A"));
		int second = Integer.valueOf(input.substring(1)) - 1;
		if (!(myBoard[first][second].equals(" "))){
			myBoard[first][second] = "X";
		}
		
		
	}
	public String getName()
	{
		return name;
	}

}
