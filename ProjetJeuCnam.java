import java.util.Scanner;

public class ProjetJeuCnam {
	
	//===============================PROGRAMME MAIN========================================================
	public static void main (String[]args){
	
		entreeMenu();
	}
	//========================fonction du menu=============================================================
	public static void choixUtilMenu(int choix){
		
		switch (choix){
		case 1: 
		System.out.println("1. Vous avez choisi de lancer le jeu, un instant");
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
	public static void classeVoleur(){
		
		
		
		
		
		
	}
	public static void classeGuerrier(){

		
	
	}
	public static void classeBarbare(){
		
	}
	public static void caracJoueur(){
		
	}
	
	
}



