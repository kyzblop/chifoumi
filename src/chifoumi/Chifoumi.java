package chifoumi;

import java.util.ArrayList;
import java.util.Scanner;

public class Chifoumi {

    String[] formes = {"pierre","feuille","ciseaux"};
    int scoreA = 0;
    int scoreB = 0;
    
    
	public int getScoreA() {
		return scoreA;
	}

	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}

	public int getScoreB() {
		return scoreB;
	}

	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
	}

	public String[] getFormes() {
		return formes;
	}

	public void setFormes(String[] formes) {
		this.formes = formes;
	}

	public void checkWin(String formeA, String formeB) {
		if (formeA == formeB) {
			System.out.println("Match null");
			return;
		}
		if (formeA==formes[0]) {
			if (formeB==formes[1]) setScoreB(getScoreB() + 1);
			if (formeB==formes[2]) setScoreA(getScoreA() + 1);
			return;
		}
		if (formeA==formes[1]) {
			if (formeB==formes[0]) setScoreA(getScoreA() + 1);
			if (formeB==formes[2]) setScoreB(getScoreB() + 1);
			return;
		}
		if (formeA==formes[2]) {
			if (formeB==formes[0]) setScoreB(getScoreB() + 1);
			if (formeB==formes[1]) setScoreA(getScoreA() + 1);
			return;
		}
		
	}
	
	public static void main(String[] args) {
		Chifoumi chifoumi = new Chifoumi();
		
		System.out.println("Jeu du Chifoumi");
		
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Saisir le nombre de partie");
		*/

		chifoumi.checkWin(chifoumi.formes[1], chifoumi.formes[0]);
		
		System.out.println("Score A : " + chifoumi.getScoreA());
		System.out.println("Score B : " + chifoumi.getScoreB());

	}

}
