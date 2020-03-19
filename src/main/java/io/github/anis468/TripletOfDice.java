package io.github.anis468;
import java.lang.Math;
public class TripletOfDice {
	int nb_face;
	int dice1;
	int dice2;
	int dice3;
   
	/**  
	 * this constructeur take an int that will be 1 to 6 under 6 dosnt exists
	 * 
	 * */
	public TripletOfDice(int a) {
		if (a > 6 || a < 1) {
			throw new IllegalArgumentException("nb des non ");
		} else {
			nb_face = a;
		}
	}

	public void rollAllDice() {
		dice1=(int) (Math.random()*nb_face +1);
		dice2=(int) (Math.random()*nb_face +1);
		dice3=(int) (Math.random()*nb_face +1);
	}

	public void rollOneDie(int dieNumber) {
		if ((dieNumber != 1) || (dieNumber != 2) || (dieNumber != 3)) {
			throw new IllegalArgumentException("dosnt exist ");
		}else {
			  if(dieNumber==1) dice1=(int) (Math.random()*nb_face +1);
				  if(dieNumber==2) 		dice2=(int) (Math.random()*nb_face +1);
					  if(dieNumber==3)  dice3=(int) (Math.random()*nb_face +1);
		}
	}

	public int getFirstDie() {return dice1;}

	public int getSecondDie() {return dice2;}

	public int getThirdDie() {return dice3;}

}
