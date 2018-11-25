public class HumanPlayer implements Player{
//do not change the line above	
	
	//Define your fields here
private int playerID,row = 0,col=0,c=0;

Board c4 = new Board();
	
	//constructor takes the player id for this player, and the number of 
	// rows and columns of the board we're playing on
	public HumanPlayer(int playerID, int row, int col){
		this.playerID = playerID;
		this.row = row;
		this.col = col;
	
	}
	
	//used to notify your AI player of the other players last move
	public void lastMove(int c) {
		this.c = c;
		
	}
	
	//returns column of where to play a token
	//returns column of where to play a token
		public int playToken(){
	
				System.out.println("enter col ");
				c=IO.readInt();
				
				if(c<col&&c>-1&&c4.play(playerID, c)==true){
					return c;
				}
				
				else{
					while(c<=-1||c>=col||c4.play(playerID, c)==false){
						System.out.println("enter valid col ");
						c=IO.readInt();
					}
					return c;
				}
			
			
						
				
					
		}
				
		
		
		
	
	//get this player's id
	public int getPlayerID(){
		return playerID;
	}
	
	//resets the state of the player in preparation for a new game
	public void reset(){
c4 = new Board();


	}

	
}

