/*
 * Name: Kareem Hing
 * Student Id: 991485091
 * SYST 38634 ICE 03
 * 
 * The purpose of this program is to take a certain amount of cents 
 * and output the quarters,dimes and nickel equivalent of those cents
 */



public class Change {
	
	public static String correct_Change(int cents) {
		String i = "";
		int amount ;
		if(cents >= 0 && cents <= 100 ) {
			amount = (int)((Math.round(cents/5.0f))* 5);
			switch(amount) {
			case 0:
			case 100:
				i = "Cannot calculate change";
				break;
			case 5:
				i = cents + " cents requires " +  "1 nickel";
				break;
			case 10:
			case 20:
				i = cents + " cents requires " + (amount/10) + " dimes ";
				break;
			case 15:
				i = cents + " cents requires " + (amount/10) + " dime, " + " 1 nickel";
				break;
			case 25:
			case 50:
			case 75:
				i = cents + " cents requires " + (amount/25) + " quarters ";
				break;
			case 30:
			case 55:
			case 80:
				i = cents + " cents requires " + (amount/25) + " quarters, " + " 1 nickel ";
				break;
			case 35:
			case 45:
			case 60:
			case 70:
			case 85:
			case 95:
				if(amount % 25 == 10) {
					i = cents + " cents requires " + (amount/25) + " quarter, " + " 1 dime ";
				}else {
					i = cents + " cents requires " + (amount/25) + " quarters, " + " 2 dime ";
				}
				break;
			case 40:
			case 65:
			case 90:
				if(amount % 25 == 15) {
					i = cents + " cents requires " + (amount/25) + " quarter, " + " 1 dime " + " 1 nickel";
				}else {
					i = cents + " cents requires " + (amount/25) + " quarters, " + " 2 dime " + " 1 nickel";
				}
				break;
			}
			
		}
		
		return i;
		
	}
	
	public static void main(String[] args ) throws BadChangeException {
		//Change ch1 = new Change();
		System.out.println(Change.correct_Change(54));
	}

}


