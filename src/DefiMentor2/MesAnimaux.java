package DefiMentor2;

public class MesAnimaux {

	public static void main(String[] args) {
		// Objectifs : appel � une m�thode statique donc avec une classe / appel � une m�thode non statique donc avec un objet.
		//Je ne peux pas instancier un nouvel objet avec la classe Animal.
		Chat ripley = new Chat();
	
		Chat nero = new Chat();
		
		nero.seDeplacer(); 
		ripley.manger(); 
		ripley.criSpecifique();
		

	}

}
