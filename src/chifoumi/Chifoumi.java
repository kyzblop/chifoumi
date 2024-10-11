package chifoumi;

import java.util.Scanner;

public class Chifoumi {

	public static void main(String[] args) {
		System.out.println("Jeu du Chifoumi");
		
		Scanner scan = new Scanner(System.in);
		
		// Definition de la regle
		System.out.println("Voulez vous jouer à la française ? (Y/N)");
		String regle = scan.nextLine().toUpperCase();
		
		while(!(regle.equals("Y") || regle.equals("N"))) {
			System.out.println("Repondez à la question");
			System.out.println("Voulez vous jouer à la française ? (Y/N)");
			regle = scan.nextLine().toUpperCase();
		}
		
		Boolean isRegleFr;
		
		if(regle.equals("Y")) {
			isRegleFr = true;
		} else {
			isRegleFr = false;
		}
		
		// Definition du nombre de partie
		System.out.println("Saisir le nombre de partie");
		int nbPartie = Integer.parseInt(scan.nextLine());
		
		// Joueur 1 
		System.out.println("Joueur 1 : Jouez ! (P/F/C)");
		String j1 = scan.nextLine().toUpperCase();
		
		while(!(j1.equals("P") || j1.equals("F") || j1.equals("C"))) {
			System.out.println("Jouez correctemment ! (P/F/C)");
			j1 = scan.nextLine().toUpperCase();
		}
		
		// Joueur 2
		System.out.println("Joueur 2 : Jouez ! (P/F/C)");
		String j2 = scan.nextLine().toUpperCase();
		
		while(!(j2.equals("P") || j2.equals("F") || j2.equals("C"))) {
			System.out.println("Jouez correctemment ! (P/F/C)");
			j2 = scan.nextLine().toUpperCase();
		}
		
		

	}

}
