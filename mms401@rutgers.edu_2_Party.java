
public class Party {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int numPeople,slices,soda,slicesPizza,cansCase,totalSlices,totalSoda;
double numSodaCase;
double numPizzaBox;
double pricePizza,priceSoda,total,pricePizzaTotal,priceSodaTotal;
System.out.println("the number of people attending the party");
numPeople=IO.readInt();
System.out.println("the number of slices of pizza each person should be able to eat");
slices=IO.readInt();
System.out.println("the number of cans of soda each person should be able to drink");
soda=IO.readInt();
System.out.println("the cost of a pizza pie");
pricePizza=IO.readDouble();
System.out.println("the number of slices in a pizza pie");
slicesPizza=IO.readInt();
System.out.println("the cost of a case of soda");
priceSoda=IO.readDouble();
System.out.println("the number of cans in a case of soda");
cansCase=IO.readInt();
totalSlices=numPeople*slices; //100x3=300

totalSoda=numPeople*soda; //100x2= 200
	
numPizzaBox=(Math.ceil((double) totalSlices/slicesPizza)); //how many boxs to buy

numSodaCase=(Math.ceil((double) totalSoda/cansCase));   //how many cases to buy
	
pricePizzaTotal=numPizzaBox*pricePizza;

priceSodaTotal=numSodaCase*priceSoda;

total=pricePizzaTotal+priceSodaTotal;
IO.outputDoubleAnswer(total);
	}

}
