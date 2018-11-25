

public class AIPlayer implements Player{
//do not change the line above	
	
	//Define your fields here
	
	private int playerID,row = 0,col=0,c=0;

	Board c4 = new Board();
		
	
	
	//constructor takes the player id for this player, and the number of 
	// rows and columns of the board we're playing on
	public AIPlayer(int playerID, int row, int col){
		this.playerID = playerID;
		this.row = row;
		this.col = col;
	
		
		
	}
	
	//used to notify your AI player of the other players last move
	public void lastMove(int c) {

		
		if (playerID==1 ){
		c4.play(2, c);  
		}
if ( playerID==2){
	c4.play(1, c);
}
		this.c = c;
				
	}
	
	//returns column of where to play a token
	public int playToken(){
	int z=0;

		if(z<col&& z>-1&&c4.play(playerID, z)==true){
			return z;
		}
		
		else{
			while(z<=-1||z>=col||c4.play(playerID, z)==false || c4.getToken(0, z) == playerID ){
				z++;
			}
			return z;
		}
	
	
				
		
			
}	
	
	
	//get this player's id
	public int getPlayerID(){
		return playerID;
		
	}
	
	//resets the state of the player in preparation for a new game
	public void reset(){
			c4 = new Board();
			playerID=0;


				}

				
			
		
	}
