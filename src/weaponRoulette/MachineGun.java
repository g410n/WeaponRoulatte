package weaponRoulette;

import java.util.Random;

public class MachineGun {
	private int j=0;
	MachineGun(){
		do {
			Random ran=new Random();
			int num=ran.nextInt(100);
			switch(num) {
			case 1:
				System.out.println("RPK-16");
				j++;
				break;
			}
		}while(j<1);
	}
	
	
}