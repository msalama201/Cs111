
public class LuckyNines {
	
	
	public static int countLuckyNines(int lowerEnd, int upperEnd){int count = 0;
	
	for (int i = lowerEnd; i <= upperEnd; i++) {
		int j = Math.abs(i);
		while (j > 0) {
			if (j % 10 == 9) {
				count++;
			}

			j = j / 10;

		}
	}
if(upperEnd<lowerEnd){return -1;

}
else {
	return count;}


	}
		
	public static void main(String[] args) {
		int lowerEnd = IO.readInt();
		int upperEnd = IO.readInt();
		
	int	answer=countLuckyNines( lowerEnd,  upperEnd);
		IO.outputIntAnswer(answer);
		
		
		
		
		

		

	}
}