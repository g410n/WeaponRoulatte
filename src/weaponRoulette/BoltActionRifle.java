package weaponRoulette;

import java.util.Random;

public class BoltActionRifle {
	private int j=0;
	BoltActionRifle(){
		do {
			Random ran=new Random();
			int num=ran.nextInt(100);
			switch(num) {
			case 1:
				System.out.println("DVL-10");
				j++;
				break;
			case 2:
				System.out.println("VPO-215");
				j++;
				break;
			case 3:
				System.out.println("Mosin(Infantry)");
				j++;
				break;
			case 4:
				System.out.println("Mosin");
				j++;
				break;
			case 5:
				System.out.println("T-5000M");
				j++;
				break;
			case 6:
				System.out.println("M700");
				j++;
				break;
			case 7:
				System.out.println("SV-98");
				j++;
				break;
			}
		}while(j<1);
	}
	
	
}
