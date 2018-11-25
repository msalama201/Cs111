

public class SmallestLargest{

	public static void main(String[] args) {
		System.out.print("enter terminating value");
		double max;
		double min;
		
		
	double term=IO.readDouble();
	
	double value=IO.readDouble();
	
		max=value;
		min=value;
		
		if (value == term) {
			IO.reportBadInput();
			return;
		}
			
			while(value!=term){
				value=IO.readDouble();
				
				if (value == term)  {
					break;
				}
				
			
				
				
			if(value>max)
			{max=value;}
			
			else if(value<min)
			{ min=value;}
		
			}
			IO.outputDoubleAnswer(max);
			IO.outputDoubleAnswer(min);
	}
}

