package bladibla;

import java.util.Arrays;
import java.util.Random;

public class Test {

	public static int max(int[] arg) {

		if (arg.length == 1) {
			return arg[0];
		} else if (arg.length == 2) {
			if (arg[1] >= arg[0]) {
				return arg[1];
			} else {
				return arg[0];
			}
		}

		else {
			int[] kleinFeld = new int[arg.length / 2];
			int[] grossFeld = new int[arg.length / 2];

			System.arraycopy(arg, 0, kleinFeld, 0, kleinFeld.length / 2);
			System.arraycopy(arg, grossFeld.length / 2, grossFeld, 0,
					grossFeld.length);

			System.out.println("Haaaai");

			for (int i = 0; i < kleinFeld.length; i++) {
				System.out.println(kleinFeld[i] + ", ");
			}
			for (int i = 0; i < grossFeld.length; i++) {
				System.out.println(grossFeld[i] + ", ");
			}
			
			for (int i = 0; i < grossFeld.length; i++) {
				System.out.println(grossFeld[i]+", ");
			}
			for (int i = 0; i < kleinFeld.length; i++) {
				System.out.println(kleinFeld[i]+", ");
			}
			max(kleinFeld);
			max(grossFeld);
		}

	}

	public void run() {

	}

//	public static void splitFeld(int[] arg) {
//		int[] kleinFeld = new int[arg.length / 2];
//		int[] grossFeld = new int[arg.length / 2];
//
//		System.arraycopy(arg, 0, kleinFeld, 0, kleinFeld.length / 2);
//		System.arraycopy(arg, grossFeld.length / 2, grossFeld, 0,
//				grossFeld.length);
//
//		System.out.println("Haaaai");
//
//		for (int i = 0; i < kleinFeld.length; i++) {
//			System.out.println(kleinFeld[i] + ", ");
//		}
//		for (int i = 0; i < grossFeld.length; i++) {
//			System.out.println(grossFeld[i] + ", ");
//		}
//		
//		for (int i = 0; i < grossFeld.length; i++) {
//			System.out.println(grossFeld[i]+", ");
//		}
//		for (int i = 0; i < kleinFeld.length; i++) {
//			System.out.println(kleinFeld[i]+", ");
//		}
//		max(kleinFeld);
//		max(grossFeld);
//
//	}

	public static int[] genFeld(int size) {

		int[] Feld = new int[size];
		Random rand = new Random();

		for (int i = 0; i < Feld.length; i++) {
			Feld[i] = rand.nextInt(10);
		}

		return Feld;

	}

	public static void main(String[] args) {
		int size = 4;
		int max;

		int[] Feld = new int[size];
		Feld = genFeld(size);

		for (int i = 0; i < Feld.length; i++) {
			System.out.print(Feld[i] + ", ");
		}
		
		max = max(Feld);
		System.out.println(max);
		
		// Thread[] threadlist = new Thread[1];
		// Thread t = new Thread(null);
		//
		// for (int i = 0; i < threadlist.length; i++) {
		//
		// Thread t = new Thread(Feld1);
		// threadlist[0] = t;
		// t.start();
		// }
		//
		// try {
		// t.join();
		// } catch (InterruptedException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }
		//
	}

}
