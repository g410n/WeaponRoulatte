package weaponRoulette;

import java.util.Random;

public class AssaultRifle {
	private int j=0;
	AssaultRifle(){
		do {
			Random ran=new Random();
			int num=ran.nextInt(100);
			switch(num) {
			case 1:
				System.out.println("AK-101");
				j++;
				break;
			case 2:
				System.out.println("AK-102");
				j++;
				break;
			case 3:
				System.out.println("AK-103");
				j++;
				break;
			case 4:
				System.out.println("AK-104");
				j++;
				break;
			case 5:
				System.out.println("AK-105");
				j++;
				break;
			case 6:
				System.out.println("AK-74M");
				j++;
				break;
			case 7:
				System.out.println("AK-74N");
				j++;
				break;
			case 8:
				System.out.println("AKM");
				j++;
				break;
			case 9:
				System.out.println("AKMN");
				j++;
				break;
			case 10:
				System.out.println("AKMS");
				j++;
				break;
			case 11:
				System.out.println("AKMSN");
				j++;
				break;
			case 12:
				System.out.println("AKS-74N");
				j++;
				break;
			case 13:
				System.out.println("AS VAL");
				j++;
				break;
			case 14:
				System.out.println("ASh-12");
				j++;
				break;
			case 15:
				System.out.println("Mk47");
				j++;
				break;
			case 16:
				System.out.println("M4A1");
				j++;
				break;
			case 17:
				System.out.println("SA-58");
				j++;
				break;
			case 18:
				System.out.println("MDR 5.56x45");
				j++;
				break;
			case 19:
				System.out.println("MDR 7.62x51");
				j++;
				break;
			case 20:
				System.out.println("Mk 17");
				j++;
				break;
			case 21:
				System.out.println("Mk 16");
				j++;
				break;
			case 22:
				System.out.println("HK 416A5");
				j++;
				break;
			case 23:
				System.out.println("AK-74");
				j++;
				break;
			case 24:
				System.out.println("AKS-74");
				j++;
				break;
			case 25:
				System.out.println("AKS-74U");
				j++;
				break;
			case 26:
				System.out.println("AKS-74UB");
				j++;
				break;
			case 27:
				System.out.println("AKS-74UN");
				j++;
				break;
			case 28:
				System.out.println("MCX .300 BLK");
				j++;
				break;
			}
		}while(j<1);
	}
}
