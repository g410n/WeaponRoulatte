package weaponRoulette;

import java.util.Random;

public class Pistol {
	private int j=0;
	Pistol(){
		do {
			Random ran=new Random();
			int num=ran.nextInt(100);
			switch(num) {
			case 1:
				System.out.println("APB");
				j++;
				break;
			case 2:
				System.out.println("M9A3");
				j++;
				break;
			case 3:
				System.out.println("CR 50DS .357");
				j++;
				break;
			case 4:
				System.out.println("CR 200DS 9mm");
				j++;
				break;
			case 5:
				System.out.println("M1911A1");
				j++;
				break;
			case 6:
				System.out.println("M45A1");
				j++;
				break;
			case 7:
				System.out.println("FN 5-7");
				j++;
				break;
			case 8:
				System.out.println("Glock 17");
				j++;
				break;
			case 9:
				System.out.println("Glcok 18C");
				j++;
				break;
			case 10:
				System.out.println("USP .45");
				j++;
				break;
			case 11:
				System.out.println("PM(t)");
				j++;
				break;
			case 12:
				System.out.println("PM");
				j++;
				break;
			case 13:
				System.out.println("PB");
				j++;
				break;
			case 14:
				System.out.println("PL-15");
				j++;
				break;
			case 15:
				System.out.println("P226R");
				j++;
				break;
			case 16:
				System.out.println("SR-1MP");
				j++;
				break;
			case 17:
				System.out.println("APS");
				j++;
				break;
			case 18:
				System.out.println("TT");
				j++;
				break;
			case 19:
				System.out.println("MP-443 'Grach'");
				j++;
				break;
			}
		}while(j<1);
	}
}
