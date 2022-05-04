package weaponRoulette;

import java.util.Random;

public class MarksmanRifle {
	private int j=0;
	MarksmanRifle(){
		do {
			Random ran=new Random();
			int num=ran.nextInt(100);
			switch(num) {
			case 1:
				System.out.println("G28");
				j++;
				break;
			case 2:
				System.out.println("SR-25");
				j++;
				break;
			case 3:
				System.out.println("RSASS");
				j++;
				break;
			case 4:
				System.out.println("SVDS");
				j++;
				break;
			case 5:
				System.out.println("Mk-18 mjolnir");
				j++;
				break;
			case 6:
				System.out.println("M1A");
				j++;
				break;
			case 7:
				System.out.println("VSS Vintorez");
				j++;
				break;
			}
		}while(j<1);
	}
	
	
}