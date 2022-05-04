package weaponRoulette;

import java.util.Random;

public class SMG {
	private int j=0;
	SMG(){
		do {
			Random ran=new Random();
			int num=ran.nextInt(100);
			switch(num) {
			case 1:
				System.out.println("MP9");
				j++;
				break;
			case 2:
				System.out.println("MP9-N");
				j++;
				break;
			case 3:
				System.out.println("P90");
				j++;
				break;
			case 4:
				System.out.println("MP5");
				j++;
				break;
			case 5:
				System.out.println("MP5K-N");
				j++;
				break;
			case 6:
				System.out.println("MP7A1");
				j++;
				break;
			case 7:
				System.out.println("MP7A2");
				j++;
				break;
			case 8:
				System.out.println("UMP 45");
				j++;
				break;
			case 9:
				System.out.println("PP-19-01");
				j++;
				break;
			case 10:
				System.out.println("PP-9 Klin");
				j++;
				break;
			case 11:
				System.out.println("PP-91 Kedr");
				j++;
				break;
			case 12:
				System.out.println("PP-91-01 Kedr-B");
				j++;
				break;
			case 13:
				System.out.println("PPSh41");
				j++;
				break;
			case 14:
				System.out.println("MPX");
				j++;
				break;
			case 15:
				System.out.println("Saiga-9");
				j++;
				break;
			case 16:
				System.out.println("STM-9");
				j++;
				break;
			case 17:
				System.out.println("Vector .45ACP");
				j++;
				break;
			case 18:
				System.out.println("Vector 9x19");
				j++;
				break;
			}
		}while(j<1);
	}
}
