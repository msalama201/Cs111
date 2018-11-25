
public class TwoSmallest {
	public static void main(String[] args) {
		
		double term = IO.readDouble();
		double smallest = 0.0;
		double secondSmallest = 0.0;
		double num;

		smallest = IO.readDouble();
		while(smallest == term) {
			IO.reportBadInput();
			smallest = IO.readDouble();
		}
		secondSmallest=IO.readDouble();
		while(secondSmallest == term){
			IO.reportBadInput();
			secondSmallest = IO.readDouble();
		}
		while(true) {
			num = IO.readDouble();
			if(num != term) {
				if(num < smallest) {
					if(secondSmallest > smallest) {
						secondSmallest = smallest;
					}
					smallest = num;
				}
				else {
					if(num < secondSmallest)
						secondSmallest = num;
					
				}
			}
					else {
						break;
					}

		}
				if(secondSmallest < smallest) {
					double temp = smallest;
					smallest = secondSmallest;
					secondSmallest = temp;
				}

				IO.outputDoubleAnswer(smallest);
				IO.outputDoubleAnswer(secondSmallest);
	}
}
