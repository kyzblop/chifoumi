package chifoumi;

public class Check {


    String[] formes = {"P","F","C"};
    int scoreA = 0;
    int scoreB = 0;
    String gagnant ="";
    
	public int getScoreA() {
		return scoreA;
	}

	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
		gagnant = "Jouer 1 gagnant";
	}

	public int getScoreB() {
		return scoreB;
	}

	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
		gagnant = "Jouer 2 gagnant";
	}

	public String[] getFormes() {
		return formes;
	}

	public void setFormes(String[] formes) {
		this.formes = formes;
	}

	public void checkWin(String formeA, String formeB) {
		if (formeA.equals(formeB)) {
			System.out.println("Match null");
			return;
		}

		if (formeA.equals(formes[0])) {
			if (formeB.equals(formes[1])) setScoreB(getScoreB() + 1);
			if (formeB.equals(formes[2])) setScoreA(getScoreA() + 1);
			System.out.println(gagnant);
			return;
		}
		if (formeA.equals(formes[1])) {
			if (formeB.equals(formes[0])) setScoreA(getScoreA() + 1);
			if (formeB.equals(formes[2])) setScoreB(getScoreB() + 1);
			System.out.println(gagnant);
			return;
		}
		if (formeA.equals(formes[2])) {
			if (formeB.equals(formes[0])) setScoreB(getScoreB() + 1);
			if (formeB.equals(formes[1])) setScoreA(getScoreA() + 1);
			System.out.println(gagnant);
			return;
		}
		
	}
}
