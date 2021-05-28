package DefiMentor2;

public class MesAnimaux {

	public static void main(String[] args) {
		// Objectifs : appel à une méthode statique donc avec une classe / appel à une méthode non statique donc avec un objet.
		//Je ne peux pas instancier un nouvel objet avec la classe Animal.
		Chat ripley = new Chat();
	
		Chat nero = new Chat();
		
		nero.seDeplacer(); 
		ripley.manger(); 
		ripley.criSpecifique();
		

	}

}
