
public class Board {
	
private  int row;
private  int col;
private char playerOne;
private char board[][];
private char playerTwo;

	public Board () {
		this.row=6;
		this.col=7;
		board  = new char [row][col];
	
		for(int i = 0; i<board.length;i++){
			for(int j = 0; j<board[i].length;j++){
				board[i][j]=' ';
				}
		}//end standard board play
}
	
	
	public Board(int row, int col){
		
		if(row<4||col<4){
			row=6;
			col=7;
			}
		this.row=row;
		this.col=col;
		
		
		
		 board  = new char [row][col];
		
		for(int i = 0; i<board.length;i++){
			
			for(int j = 0; j<board[i].length;j++){
				board[i][j]=' ';
				}
			}
		}//end user generated board
	
	
	public int getNumRows(){
		return board.length;
		}//retur num rows
	
	
	public int getNumCols(){
		return board[0].length;
		}//return num colums
	
	public char getPlayerOne() {
		return playerOne;
		}//end return player 1
	
	public char getPlayerTwo(){
		return playerTwo;
		} //end return player 2
	
	public void setPlayerOne(char o){
		playerOne=o;	
		} // end set player one
	
	public void setPlayerTwo(char t){
		playerTwo=t;
		}// end set player two
	
	public char getToken(int row, int col) {

		if(row < 0 || col < 0 || row >= board.length || col >= board[0].length){
			return '\0';
		}
		return board[row][col];
		} // end of get token 
	
	public boolean canPlay(){
		
		

		for(int i = 0; i<board.length;i++){
			
			for(int j = 0; j<board[0].length;j++){
				
				if(board[i][j]==' '){ 
					
					return true;
				}
				
				}
			
			}
		return false;
		}
	
	public boolean play(int p, int c){
		char chip = 0;
		boolean condA=false;
		boolean condB=false;
		
		if (p==1) {
			chip=playerOne; 
			condA=true;
		}
		if (p==2) {
			chip=playerTwo; 
			condA= true;
			}
		
		if ( c>board[0].length-1){
			return false;
		}
	
		for(int i = board.length; i>0;i--){
			if(board[i-1][c]==' '){
				condB=true;
				board[i-1][c]=chip;
				break;
				}
			}
			
	if(condA==true && condB==true ){
		return true;
		}
	return false;}
	
	

	
	




public int hor(){
	
for(int i = 0; i<board.length;i++){
	
	for(int j = 0,a=1,b=2,c=3; j<board[i].length;j++,a++,b++,c++){
		
	if(j>=board[i].length-1 
		|| a>=board[i].length-1 
		|| b>=board[i].length-1
		|| c>board[i].length-1){
		break;
	}
			
	if (board[i][j]==playerOne 
	&& board[i][a]==playerOne
    && board[i][b]==playerOne 
    && board[i][c]==playerOne){
		return 1;
		}
	}
	}


for(int i = 0; i<board.length;i++){
	
	for(int j = 0,a=1,b=2,c=3; j<board[i].length;j++,a++,b++,c++){
		
	if(j>=board[i].length-1 
		|| a>=board[i].length-1 
		|| b>=board[i].length-1
		|| c>board[i].length-1){
		break;
	}
			
	if (board[i][j]==playerTwo 
	&& board[i][a]==playerTwo
    && board[i][b]==playerTwo 
    && board[i][c]==playerTwo){
		return 2;
		}
	}
	}

return -1;
}
		
public int ver(){
	for(int i = 0,a=1,b=2,c=3; i<board.length;i++,a++,b++,c++){
		
		for(int j = 0; j<board[i].length;j++){
			
		if(j>=board.length-1 
			|| a>=board.length-1 
			|| b>=board.length-1
			|| c>board.length-1){
			break;
		}
				
		if (board[i][j]==playerOne 
		&& board[a][j]==playerOne
	    && board[b][j]==playerOne 
	    && board[c][j]==playerOne){
			return 1;
			}
		}
		}


for(int i = 0,a=1,b=2,c=3; i<board.length;i++,a++,b++,c++){
		
		for(int j = 0; j<board[i].length;j++){
			
		if(j>=board.length-1 
			|| a>=board.length-1 
			|| b>=board.length-1
			|| c>board.length-1){
			break;
		}
				
		if (board[i][j]==playerTwo 
		&& board[a][j]==playerTwo
	    && board[b][j]==playerTwo 
	    && board[c][j]==playerTwo){
			return 2;
			}
		}
		}


	return -1;
	}
		
public int digDown(){

	for(int i = 0; i<board.length;i++){
		
		for(int j = 0,a=1,b=2,c=3,aa=1,bb=2,cc=3; j<board[i].length;j++,aa++,bb++,cc++){
			
		if(j>=board[i].length-1 
			|| a>=board.length-1 
			|| b>=board.length-1
			|| c>board.length-1
			|| aa>=board[i].length-1 
			|| bb>=board[i].length-1
			|| cc>board[i].length-1){
			break;
		}
				
		if (board[i][j]==playerOne 
		&& board[a][aa]==playerOne
	    && board[b][bb]==playerOne 
	    && board[c][cc]==playerOne){
			return 1;
			}
		}
		}

for(int i = 0; i<board.length;i++){
		
		for(int j = 0,a=1,b=2,c=3,aa=1,bb=2,cc=3; j<board[i].length;j++,aa++,bb++,cc++){
			
		if(j>=board[i].length-1 
			|| a>=board.length-1 
			|| b>=board.length-1
			|| c>board.length-1
			|| aa>=board[i].length-1 
			|| bb>=board[i].length-1
			|| cc>board[i].length-1){
			break;
		}
				
		if (board[i][j]==playerTwo 
		&& board[a][aa]==playerTwo
	    && board[b][bb]==playerTwo 
	    && board[c][cc]==playerTwo){
			return 2;
			}
		}
		}

	return -1;
}
	



public int digUp(){

	for(int i = board.length-1 ; i>0;i--){
		
		for(int j = 0,a=board.length-2,b=board.length-3,c=board.length-4,aa=1,bb=2,cc=3; j<board[i].length;j++,aa++,bb++,cc++){
			
		if(
			 aa>=board[i].length-1 
			|| bb>=board[i].length-1
			|| cc>board[i].length-1){
			break;
		}
				
		if (board[i][j]==playerOne 
		&& board[a][aa]==playerOne
	    && board[b][bb]==playerOne 
	    && board[c][cc]==playerOne){
			return 1;
			}
		}
		}
	for(int i = board.length-1 ; i>=0;i--){
		
		for(int j = 0,a=board.length-2,b=board.length-3,c=board.length-4,aa=1,bb=2,cc=3; j<board[i].length;j++,aa++,bb++,cc++){
			
		if(
			 aa>=board[i].length-1 
			|| bb>=board[i].length-1
			|| cc>board[i].length-1){
			break;
		}
				
		if (board[i][j]==playerTwo 
		&& board[a][aa]==playerTwo
	    && board[b][bb]==playerTwo 
	    && board[c][cc]==playerTwo){
			return 2;
			}
		}
		}
	return -1;
}
	






	public int isFinished(){
		if(digDown()==1 || hor()==1 || ver()==1 || digUp()==1)
		{return 1;}
		
		if(digDown()==2 || hor()==2 || ver()==2 || digUp()==2)
		{return 2;}
		
	
	
		
		if(canPlay() == true)
		{return -1;}
		
		return 0;
		
	}
		
		

}
