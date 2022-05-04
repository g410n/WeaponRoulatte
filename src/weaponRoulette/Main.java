package weaponRoulette;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		Roulette();
	}
		
static void Roulette() {
	int j=0;
	do {
		Random r=new Random();
		int n=r.nextInt(8);
		switch(n) {
			case 1:
				System.out.println("---------------");
				new AssaultCarbine();
				System.out.println("---------------");
				j++;
				break;
			case 2:
				System.out.println("---------------");
				new AssaultRifle();
				System.out.println("---------------");
				j++;
				break;
			case 3:
				System.out.println("---------------");
				new BoltActionRifle();
				j++;
				break;
			case 4:
				System.out.println("---------------");
				new MachineGun();
				System.out.println("---------------");
				j++;
				break;
			case 5:
				System.out.println("---------------");
				new MarksmanRifle();
				System.out.println("---------------");
				j++;
				break;
			case 6:
				System.out.println("---------------");
				new Pistol();
				System.out.println("---------------");
				j++;
				break;
			case 7:
				System.out.println("---------------");
				new SMG();
				System.out.println("---------------");
				j++;
				break;
			case 8:
				System.out.println("---------------");
				new Shotgun();
				System.out.println("---------------");
				j++;
				break;
			}
		}while(j<1);
	}
}