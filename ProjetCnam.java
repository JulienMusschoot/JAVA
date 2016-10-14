package projetCnam;

import java.util.Scanner;

public class ProjetCnam {
	
	// Declaration des variables de classe
	
	String nomJoueur;
	String classeJoueur;
	
	
	public static void main (String[]args){
		
		public void entreeMenu() {
			
			int choixMenu=0;
			
			// Declaration des variables du menu
			
			do{
				
			// Debut de la boucle du menu, si on entre une valeur au dessus de 3, retour en début de boucle
				
			Scanner choixScan = new Scanner(System.in);
			System.out.println("Bienvenue dans mon RPG !");
			System.out.println("Veuillez choisir une option en tapant le numero associe");
			System.out.println("1. Lancer le jeu");
			System.out.println("2. Quitter le jeu");
			System.out.println("3. Obtenir plus d'informations");
			choixMenu=choixScan.nextInt();
			
			
					switch (choixMenu){
					case 1: 
					System.out.println("Vous avez choisi de lancer le jeu, un instant");
					break;
					case 2:
					System.out.println("Vous voulez quitter le jeu, aurevoir !");
					break;
					case 3: 
					System.out.println("Vous voulez obtenir des informations, un instant !");
					break;
					default : 
					System.out.println("Vous n'avez pas saisie de reponses correcte !");
					}	
			
			}while (choixMenu>3);
		}
		
		// ========================================================================================= FIN MENU
		// DEBUT CHOIX 1 : JOUER
		String choixNom;
		String nomDuJoueur;
		new ProjetCnam();
		String nomJoueur=nomDuJoueur;
		
		
		if (choixMenu == 1){
			System.out.println("Bienvenue dans ce sombre donjon !");
			Scanner entreeNomJoueur = new Scanner(System.in);
			
			do{
			System.out.println("Veuillez choisir un nom pour continuer l'aventure !");
			nomDuJoueur=entreeNomJoueur.nextLine();
			Scanner entreeChoixNom = new Scanner(System.in);
			System.out.println("Vous vous appellez"+ nomJoueur+"?");
			System.out.println("Tapez O pour oui , N pour non");
			choixNom=entreeChoixNom.nextLine();
			}while (choixNom.		
			
			
		}
		
		
		}
}
