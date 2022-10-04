package jdn46_Lab5;

public class RollDice {

	private int die1;
	private int die2;
	private int times;
	private int two = 0;
	private int three = 0;
	private int four = 0;
	private int five = 0;
	private int six = 0;
	private int seven = 0;
	private int eight = 0;
	private int nine = 0;
	private int ten = 0;
	private int eleven = 0;
	private int twelve = 0;
		
	public void RollDice(int t) {
		this.times = t;
	}
	
	public void RolledDice() {
	
		for (int i=0; i < times; i++) {
			die1 = (int)(Math.random()*6)+1;
			die2 = (int)(Math.random()*6)+1;
			int sum = die1 + die2;
			if (sum == 2) {
				two++;
			}else if(sum == 3){
				three++;
			}else if(sum == 4) {
				four++;
			}else if(sum == 5) {
				five++;
			}else if(sum == 6) {
				six++;
			}else if (sum == 7) {
				seven++;
			}else if (sum == 8) {
				eight++;
			}else if (sum == 9) {
				nine++;
			}else if (sum == 10) {
				ten++;
			}else if (sum == 11) {
				eleven++;
			}else if (sum == 12) {
				twelve++;
			}
		}
	}
	
	public int val2() {
		return two;
	}
	
	public String prob2() {
		return two+"/"+times;
	}
	
	public int val3() {
		return three;
	}
	
	public String prob3() {
		return three+"/"+times;
	}
	
	public int val4() {
		return four;
	}
	
	public String prob4() {
		return four+"/"+times;
	}
	
	public int val5() {
		return five;
	}
	
	public String prob5() {
		return five+"/"+times;
	}
	
	public int val6() {
		return six;
	}
	
	public String prob6() {
		return six+"/"+times;
	}
	
	public int val7() {
		return seven;
	}
	
	public String prob7() {
		return seven +"/"+times;
	}
	public int val8() {
		return eight;
	}
	
	public String prob8() {
		return eight+"/"+times;
	}
	
	public int val9() {
		return nine;
	}
	
	public String prob9() {
		return nine+"/"+times;
	}
	
	public int val10() {
		return ten;
	}
	
	public String prob10() {
		return ten+"/"+times;
	}
	
	public int val11() {
		return eleven;
	}
	
	public String prob11() {
		return eleven+"/"+times;
	}
	
	public int val12() {
		return twelve;
	}
	
	public String prob12() {
		return twelve+"/"+times;
	}
	
	
	
	
	
}