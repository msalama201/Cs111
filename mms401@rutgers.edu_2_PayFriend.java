
public class PayFriend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double amount,money,money1,money2;
		System.out.println("how much money");
		amount=IO.readDouble();
		if(amount>0 && amount<=100){
			money=5;
			IO.outputDoubleAnswer(money);	
		}// close if
		if(amount>100 && amount<1000 ){
			money=amount*0.03;
			money1=6;
			if(money>money1){
				IO.outputDoubleAnswer(money);
			}
			else{
				IO.outputDoubleAnswer(money1);
			}
		}
		if(amount>=1000 && amount<10000 ){
			money=amount*0.01;
			money1=15;
	
		if(money>money1){
			IO.outputDoubleAnswer(money);
		}
		else{
			IO.outputDoubleAnswer(money1);
		}}
		if(amount>=10000){
				
		}//if
		
		if(amount>10000 && amount<=15000){
			money=100;
			money1=(amount-10000)*.02;
			money2=money+money1;
			IO.outputDoubleAnswer(money2);
		}//if close 
		if(amount>15000 ){
			money=200;
			money1=(amount-15000)*.03;
			money2=money+money1;
			IO.outputDoubleAnswer(money2);
		}
	}//main
}//everything

	
