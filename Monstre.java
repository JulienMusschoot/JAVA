
public class Monstre {

	private int vieMonstre=0;
	private int forceMonstre=0;
	private int armureMonstre=0;
	
	// ici mon constructeur me permet de generer des monstres aux caracs aleatoires
	public Monstre(int vMonstre, int fMonstre , int aMonstre){ // constructeur de ma classe Monstre
		
		// generation de la vie aleatoire du monstre
		//Valeurs max et min (inclus)
		
		int maxv=100,minv=80;
		 
		//Ton nombre aléatoire
		int nbAleav = (int)(Math.random()*(maxv-minv))+minv;
		vMonstre=vieMonstre;
		
		int vieMonstre= nbAleav;
		
		//------------------------------------------------------------------------------------------
		// generation de la force aleatoire du monstre
		
		//Valeurs max et min (inclus)
		
		int maxf=100,minf=80;
				 
		//Ton nombre aléatoire
		int nbAleaf = (int)(Math.random()*(maxf-minf))+minf;
		fMonstre=forceMonstre;
		int forceMonstre=nbAleaf;

		//------------------------------------------------------------------------------------------
		//generation de l'armure aleatoire du monstre
		
		//Valeurs max et min (inclus)
		
		int maxa=100,mina=80;
				 
		//Ton nombre aléatoire
		int nbAleaa = (int)(Math.random()*(maxa-mina))+mina;
		
		aMonstre=armureMonstre;
		int armureMonstre=nbAleaa;
		
	}



public int getVieMonstre() {
	return vieMonstre;
}



public void setVieMonstre(int vieMonstre) {
	this.vieMonstre = vieMonstre;
}



public int getForceMonstre() {
	return forceMonstre;
}



public void setForceMonstre(int forceMonstre) {
	this.forceMonstre = forceMonstre;
}



public int getArmureMonstre() {
	return armureMonstre;
}



public void setArmureMonstre(int armureMonstre) {
	this.armureMonstre = armureMonstre;
}	






}
