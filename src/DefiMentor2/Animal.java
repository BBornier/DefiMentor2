package DefiMentor2;

public abstract class Animal implements Cri {

	short nbDePattes = 4;
	short nbDeQueues = 1;
	String nom;
	String type;
	boolean parle = false;

	abstract void seDeplacer();

	static void manger() {
	}

	@Override
	public void criSpecifique() {
		
	}
	

}
