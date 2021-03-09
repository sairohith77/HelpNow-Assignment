import java.util.*;

abstract class SmartCard{
	int currentbalance,depamount,remainingbalance;
	abstract void Summary();
	abstract void CheckBalance();
	abstract void Payment();
}

class SmartCard1 extends SmartCard{

	public void Summary(){
		System.out.println("Initial Balance: " + currentbalance);
		System.out.println("Deposited Amount: " + depamount);
		System.out.println("Remaining Balance: " + remainingbalance);
	}

	public void CheckBalance(){
			System.out.println("Your balance is insufficient, Do you want to deposit amount, yes or no");
			Scanner sc1 = new Scanner(System.in);
			String a = sc1.nextLine();
			if(a.contains("es")){
				System.out.println("Enter amount: ");
				Scanner sc3 = new Scanner(System.in);
				depamount = sc3.nextInt();
				remainingbalance=currentbalance+depamount;
				try{
					if(remainingbalance<0){
						throw new NegativeBalanceException();
					}
				}
				catch(NegativeBalanceException r){
					System.out.println(r);
				}
				Summary();
			}
			else if(a.contains("o")){
				System.out.println("Thank you for your time");
				System.exit(-1);
			}
			else{
				System.out.println("Sorry, Try again");
			}
	}

	public void Payment(){
		if(currentbalance>=20){
           System.out.println("When do you want to play, Weekday or Weekend?");
           Scanner sc5 = new Scanner(System.in);
           String option = sc5.nextLine();
           if(option.contains("day")){
           	System.out.println("You have selected weekday to play!");
           	System.out.println("The cost to play is Rs.10");
           	System.out.println("Deducting amount...");
           	remainingbalance=currentbalance-10;
            Summary();
           }
           else if(option.contains("end")){
           	System.out.println("You have selected weekend to play!");
           	System.out.println("The cost to play is Rs.20");
           	System.out.println("Deducting amount...");
           	remainingbalance=currentbalance-20;
           	Summary();
           }
           else{
           	System.out.println("Enter a valid option!");
           }
		}
		else if(currentbalance>=10 && currentbalance<20){
			System.out.println("You can only play on weekdays.");
			System.out.println("The cost to play is Rs.10");
           	System.out.println("Deducting amount...");
           	remainingbalance=currentbalance-10;
           	Summary();
		}
	}
}

class SmartDemo{
	public static void main(String...args) throws IllegalArgumentException{
		System.out.println("Gaming Card System for FunFactory");
		SmartCard1 sm = new SmartCard1();
		for(;true;){
			System.out.println("Enter your current balance: ");
			Scanner sc = new Scanner(System.in);
			//boolean b=sc.hasNextInt();
			int c=(sc.hasNextInt())?1:0;
			switch(c){
				case 1:
				sm.currentbalance=sc.nextInt();
				if(sm.currentbalance<10){
					sm.CheckBalance();
				}
				else{
					java.util.ArrayList<String> GameList=new java.util.ArrayList<String>();
		    	    System.out.println("You have sufficient money to play, select the Series given below:");
		    	    GameList.add("Type G1 to start with G1");
		    	    GameList.add("Type G10 to start with G10");
		    	    System.out.println(GameList);
		    	    Scanner scan = new Scanner(System.in);
		    	    String option = scan.nextLine();
		    	    if(option.contains("1")){
		    	    	System.out.println("You have selected G1,G2,...,G10");
		    	    	sm.Payment();
		    	    }
		    	    else if(option.contains("0")){
		    	    	System.out.println("You have selected G10,G9,...,G1");
		    	    	sm.Payment();
		    	    }
		    	    else{
		    	    	System.out.println("Enter a valid option");
		    	    }
				}
				break;
				case 0:
				try{
					if(!sc.hasNextInt()){
						throw new IllegalArgumentException();
					}
				}
				catch(IllegalArgumentException e){
					System.out.println("Enter only numbers, not characters!");
				}
				break;
			}
			System.out.println("Press 0 to exit, Press any number other than 0 to play again");
			Scanner scan = new Scanner(System.in);
			int e = scan.nextInt();
		    try{
		    	if(e==0){
				System.exit(-1);
			}
			else{
				throw new RohithException();
			}
		}
		catch(RohithException e1){
			System.out.println(e1);
		}
		}
	}
}

class RohithException extends InputMismatchException{
	public String toString(){
		return "You are playing again!";
	}
}

class NegativeBalanceException extends IllegalArgumentException{
	public String toString(){
		return "Sorry, You have negative balance, Deposit money to play!";
	}
}