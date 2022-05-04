package weaponRoulette;

import java.util.Random;

public class AssaultCarbine {
	private int j=0;
	AssaultCarbine(){
		do {
			Random ran=new Random();
			int num=ran.nextInt(100);
			switch(num) {
			case 1:
				System.out.println("ADAR 2-15");
				j++;
				break;
			case 2:
				System.out.println("RFB");
				j++;
				break;
			case 3:
				System.out.println("TX-15 DML");
				j++;
				break;
			case 4:
				System.out.println("VPO-136 'Vepr-KM'");
				j++;
				break;
			case 5:
				System.out.println("VPO-209");
				j++;
				break;
			case 6:
				System.out.println("OP-SKS");
				j++;
				break;
			case 7:
				System.out.println("SKS");
				j++;
				break;
			case 8:
				System.out.println("VPO-101 'Vepr-Hunter'");
				j++;
				break;
			}
		}while(j<1);
	}
}
