package io.github.anis468;

public class DiceUser {

	public static TripletOfDice rollOnce() {
		TripletOfDice tr = new TripletOfDice(6);
		tr.rollAllDice();
		return tr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           TripletOfDice result = rollOnce();
           System.out.println("The die number 1 is a "+result.getFirstDie());
           System.out.println("The die number 2 is a "+result.getSecondDie());
           System.out.println("The die number 3 is a "+result.getThirdDie());
	}

}
