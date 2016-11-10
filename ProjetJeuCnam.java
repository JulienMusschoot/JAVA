import java.util.Scanner;
import java.util.Random;

public class ProjetJeuCnam {
	
	//===============================PROGRAMME MAIN========================================================
	public static void main (String[]args){
		
	ProjetJeuCnam init = new ProjetJeuCnam();
		
		init.entreeMenu();    // fonction qui amene vers le choix du pseudo
		init.choixDepl();     // fonction qui fait commencer le jeu , on choisit un deplacement
		init.evenAlea();	// fonction qui creer un evenement aleatoire
	}
	//========================fonction du menu=============================================================
	public void choixUtilMenu(int choix){
		
		switch (choix){
		case 1: 
		System.out.println("1. Vous avez choisi de lancer le jeu, un instant");
			introJeu();
		break;
		case 2:
		System.out.println("2. Vous voulez quitter le jeu, aurevoir !");
		break;
		case 3: 
		System.out.println("3. Vous voulez obtenir des informations, un instant !");
		break;
		default : 
		System.out.println("4. Vous n'avez pas saisie de reponses correcte !");
		entreeMenu();
		}
		
	
	}
	//======================================================================================================
	public void entreeMenu() { // Debut du programme , permet de lancer le jeu ou d'autres options via un menu
		
		
		int choixMenu=0;
		Scanner choixScan;
		// Declaration des variables du menu
		
		
		do{
		// Debut de la boucle du menu, si on entre une valeur au dessus de 3, retour en début de boucle
		
		choixScan = new Scanner(System.in);
		System.out.println("Bienvenue dans mon RPG !");
		System.out.println("Veuillez choisir une option en tapant le numero associe");
		System.out.println("1. Lancer le jeu");
		System.out.println("2. Quitter le jeu");
		System.out.println("3. Obtenir plus d'informations");
		choixMenu=choixScan.nextInt();
		}while (choixMenu>3);
		
		choixUtilMenu(choixMenu); // <=========== appel de la fonction choixUtilMenu avec comme parametres le resultat de l'entree utilisateur
		
	}
	public void evenAlea(){
		
		Heros heros= new Heros(0,0,0,0);
		Random rand = new Random();
		int nombre = rand.nextInt(11); 
		
		switch (nombre){
		
		case 1 :
			System.out.println("Vous trouvez un trésor !");
			System.out.println("Il contient 50 pieces d'or !");
			heros.setBourseHeros(50);
			choixDepl();
		case 2 :
			System.out.println("Vous trouvez un trésor !");
			System.out.println("Il contient 100 pieces d'or!");
			heros.setBourseHeros(100);
			choixDepl();
		case 3:
			System.out.println("Vous trouvez un trésor!");
			System.out.println("Il contient 20 pieces d'or!");
			heros.setBourseHeros(20);
			choixDepl();
		case 4:
			System.out.println("Vous tombez nez a nez avec un monstre !");
			systemCombat();
			
		}
			
		
		
	}
	public void introJeu(){ // Ceci est l'introduction au jeu , avec le choix du nom du personnage et une courte introduction.
		
		Heros heros=new Heros(0,0,0,0);
		Scanner demandePseudo=new Scanner(System.in);
		System.out.println("Veuillez entrer un nom pour votre personnage : ");
		heros.setNomHeros(demandePseudo.nextLine());
		System.out.println("Bienvenue dans mon RPG " + heros.getNomHeros()+" !!");
		System.out.println("Le but est simple, vous devez choisir entre differente directions");
		System.out.println("A la maniere d'un jeu de plateau");
		System.out.println("Vous rencontrerez differents evenements aleatoires");
		System.out.println("Si votre vie tombe a 0, vous mourrez !");
		System.out.println("Bonne chance !");
	}
	public void choixDepl(){ // Voici la fonction de choix de déplacement , en réalité le deplacement importe peu , cependant il donne une profondeur au jeu
		
		Scanner entreeDepl = new Scanner(System.in);
		System.out.println("Veuillez choisir une direction en saisisant le nombre indiqué");
		System.out.println("1. Haut / Monter d'une case");
		System.out.println("2. Bas / Descendre d'une case");
		System.out.println("3. Gauche / Aller sur la gauche d'une case");
		System.out.println("4. Droite / Aller sur la droite d'une case");
		System.out.println("Votre reponse (numero) :");
		int depl=entreeDepl.nextInt();
		
		switch (depl) {
	
		case 1 :
			System.out.println("Vous montez d'une case");
			break;
		case 2:
			System.out.println("Vous descendez d'une case");
			break;
		case 3:
			System.out.println("Vous allez vers la gauche d'une case");
			break;
		case 4:
			System.out.println("Vous allez vers la droite d'une case");
			break;
		}
	}
	public void systemCombat(){  // script du system de combat
		Monstre newMonstre = new Monstre(0,0,0);
		Heros newHeros = new Heros(0,0,0,0);
		int fHeros=newHeros.getForceHeros();
		int aHeros=newHeros.getArmureHeros();
		int fMonstre=newMonstre.getForceMonstre();
		int aMonstre=newMonstre.getArmureMonstre();
		// generation du pile ou face
		//Valeurs max et min (inclus)
								
		int max=6,min=1;
								 
	    //Ton nombre aléatoire
		int accDegats = (int)(Math.random()*(max-min))+min; // creer une variable entre 1 et 6 qui multiplie le resultat de degats
		
		int degatsHeros=(newHeros.setForceHeros(fHeros)*2/(newMonstre.setArmureMonstre(aMonstre)))*accDegats;
		int degatsMonstre = ((newMonstre.getForceMonstre()*2)/((newHeros.getArmureHeros())))*accDegats;
		
		
		// tirage au sort pour savoir qui du monstre ou du héros commence le combat
		// generation du pile ou face
		//Valeurs max et min (inclus)
						
		int maxp=2,minp=1;
						 
		//Ton nombre aléatoire
		int pileOuface = (int)(Math.random()*(maxp-minp))+minp;
		
		// si le nombre tiré et 1 , le héros commence en premier le combat
		// tant que la vie du Heros ou du monstre est au dessus de zéro le combat continue
		do {
		if (pileOuface ==1){
			System.out.println("Vous commencez le combat");
			System.out.println("Vous entrez dans un combat");
			System.out.println("Vous vous battez contre un monstre avec "+ newMonstre.getVieMonstre()+"points de vie");
			System.out.println("Vous infligez "+ degatsHeros+" points de degats");
			newMonstre.setVieMonstre(newMonstre.getVieMonstre()- degatsHeros);
			}
			else {
				System.out.println("Le monstre commence le combat");
				System.out.println("Vous vous battez contre un monstre avec "+ newMonstre.getVieMonstre()+"points de vie");
				System.out.println("Le monstre vous inflige"+ degatsMonstre+" points de degats");
				newHeros.setVieHeros(newHeros.getVieHeros() - degatsMonstre);
			}
		}while (newHeros.getVieHeros()>0 && newMonstre.getVieMonstre()>0);
			
		if (newHeros.getVieHeros()<1){
			System.out.println("Vous avez perdu ce combat votre vie est de "+ newHeros.getVieHeros()+"point de vie");
			System.out.println("Vous être hors-jeu");
			entreeMenu();
		if (newMonstre.getVieMonstre()<1){
			System.out.println("Vous avez gagné ce combat votre vie est de "+ newHeros.getVieHeros()+"point(s) de vie");
			System.out.println("Vous continuez l'aventure !");
			choixDepl();
		}
		}
		}

	}


		
	





