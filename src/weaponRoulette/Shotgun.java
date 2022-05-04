package weaponRoulette;

import java.util.Random;

public class Shotgun {
	private int j=0;
	Shotgun(){
		do {
			Random ran=new Random();
			int num=ran.nextInt(100);
			switch(num) {
			case 1:
				System.out.println("MP-133");
				j++;
				break;
			case 2:
				System.out.println("MP-153");
				j++;
				break;
			case 3:
				System.out.println("MP-155");
				j++;
				break;
			case 4:
				System.out.println("MP-43-1C");
				j++;
				break;
			case 5:
				System.out.println("MTs-255-12");
				j++;
				break;
			case 6:
				System.out.println("590A1");
				j++;
				break;
			case 7:
				System.out.println("M870");
				j++;
				break;
			case 8:
				System.out.println("Saiga 12ga v.10");
				j++;
				break;
			case 9:
				System.out.println("KS-23M");
				j++;
				break;
			case 10:
				System.out.println("TOZ-106");
				j++;
				break;
			}
		}while(j<1);
	}
}
