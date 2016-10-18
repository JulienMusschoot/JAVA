import java.util.Scanner;
import java.util.Random;
public class ProjetJeuCnam {
	
	public int orPerso = 0;
	protected static String nomHeros;
	//===============================PROGRAMME MAIN========================================================
	public static void main (String[]args){
	
		entreeMenu();
		choixDepl();
	}
	//========================fonction du menu=============================================================
	public static void choixUtilMenu(int choix){
		
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
	public static void entreeMenu() {
		
		
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
		
		Random rand = new Random();
		int nombre = rand.nextInt(11); 
		
		switch (nombre){
		
		case 1 :
			System.out.println("Vous trouvez un trésor !");
			System.out.println("Il contient 50 pieces d'or !");
			orPerso=orPerso+50;
			break;
		case 2 :
			System.out.println("Vous trouvez un trésor !");
			System.out.println("Il contient 100 pieces d'or!");
			orPerso=orPerso+100;
			break;
		case 3:
			System.out.println("Vous trouvez un trésor!");
			System.out.println("Il contient 20 pieces d'or!");
			orPerso=orPerso+20;
			break;
		
		}
			
		
		
	}
	public static void introJeu(){ // Ceci est l'introduction au jeu , avec le choix du nom du personnage et une courte introduction.
		
		Scanner demandePseudo=new Scanner(System.in);
		System.out.println("Veuillez entrer un nom pour votre personnage : ");
		nomHeros=demandePseudo.nextLine();
		System.out.println("Bievenue dans mon RPG !");
		System.out.println("Le but est simple, vous devez choisir entre differente directions");
		System.out.println("A la maniere d'un jeu de plateau");
		System.out.println("Vous rencontrerez differents evenements aleatoires");
		System.out.println("Si votre vie tombe a 0, vous mourrez !");
		System.out.println("Bonne chance !");
	}
	public static void choixDepl(){ // Voici la fonction de choix de déplacement , en réalité le deplacement importe peu , cependant il donne une profondeur au jeu
		
		Scanner entreeDepl = new Scanner(System.in);
		System.out.println("Veuillez choisir une direction en saisisant le nombre indiqué");
		System.out.println("1. Haut / Monter d'une case");
		System.out.println("2. Bas / Descendre d'une case");
		System.out.println("3. Gauche / Aller sur la gauche d'une case");
		System.out.println("4. Droite / Aller sur la droite d'une case");
		System.out.println("Votre reponse (numero) :");
		int depl=entreeDepl.nextInt();
		
	}
	public static void systemCombat(){
		
		
		
		
		
		
		
	}

		
	

}



