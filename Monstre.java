
public class Monstre {

	private int vieMonstre;
	private int forceMonstre;
	private int armureMonstre;

	// ici mon constructeur me permet de generer des monstres aux caracs aleatoires
	public Monstre(){ // constructeur de ma classe Monstre

		// generation de la vie aleatoire du monstre
		//Valeurs max et min (inclus)

		int maxv=100,minv=80;

		//Ton nombre aléatoire
		int nbAleav = (int)(Math.random()*(maxv-minv))+minv;	
		this.vieMonstre= nbAleav;

		//------------------------------------------------------------------------------------------
		// generation de la force aleatoire du monstre

		//Valeurs max et min (inclus)

		int maxf=15,minf=5;

		//Ton nombre aléatoire
		int nbAleaf = (int)(Math.random()*(maxf-minf))+minf;
		this.forceMonstre=nbAleaf;

		//------------------------------------------------------------------------------------------
		//generation de l'armure aleatoire du monstre

		//Valeurs max et min (inclus)

		int maxa=10,mina=1;

		//Ton nombre aléatoire
		int nbAleaa = (int)(Math.random()*(maxa-mina))+mina;
		this.armureMonstre=nbAleaa;

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
