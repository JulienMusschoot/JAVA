import java.util.Scanner;
import java.util.Random;

public class ProjetJeuCnam {

	//===============================PROGRAMME MAIN========================================================
	public static void main (String[]args){

		ProjetJeuCnam init = new ProjetJeuCnam();
		Heros newHeros = new Heros();
		Monstre newMonstre= new Monstre();
		int max=6,min=1;
		int accDegats = (int)(Math.random()*(max-min))+min; // creer une variable entre 1 et 6 qui multiplie le resultat de degats
		int degatsHeros=(newHeros.getForceHeros()*2/(newMonstre.getArmureMonstre()))*accDegats;
		int degatsMonstre = (newMonstre.getForceMonstre()*2/((newHeros.getArmureHeros())))*accDegats;





		init.entreeMenu(newHeros);    // fonction qui amene vers le choix du pseudo
		init.choixDepl(newHeros, degatsHeros, degatsMonstre);     // fonction qui fait commencer le jeu , on choisit un deplacement
		init.evenAlea(newHeros, degatsHeros, degatsMonstre);	// fonction qui creer un evenement aleatoire
	}
	//========================fonction du menu=============================================================
	public void choixUtilMenu(int choix, Heros newHeros){

		switch (choix){
		case 1: 
			System.out.println("1. Vous avez choisi de lancer le jeu, un instant");
			introJeu(newHeros);
			break;
		case 2:
			System.out.println("2. Vous voulez quitter le jeu, aurevoir !");
			System.exit(0);
			break;
		case 3: 
			System.out.println("3. Vous voulez obtenir des informations, un instant !");
			infoJeu();
		default : 
			entreeMenu(newHeros);
		}


	}
	public void entreeMenu(Heros newHeros) { // Debut du programme , permet de lancer le jeu ou d'autres options via un menu


		int choixMenu;
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

		choixUtilMenu(choixMenu, newHeros); // <=========== appel de la fonction choixUtilMenu avec comme parametres le resultat de l'entree utilisateur

	}
	public void infoJeu(){
		Scanner sc = new Scanner(System.in);
		char exit;
		System.out.println("Ceci est un petit RPG au tour par tour sans graphisme (uniquement en console)");
		System.out.println("J'ai du le developper dans le cadre de mon projet CNAM");
		System.out.println("Il comprend environ 200 lignes de code");
		System.out.println("Bon jeu !");
		System.out.println("Appuyez sur n'importe qu'elle touche pour revenir au menu");
		exit=sc.next().charAt(0);
	}
	public void evenAlea(Heros newHeros,int degatsHeros, int degatsMonstre){
		Random rand = new Random();
		int nombre = rand.nextInt(5); 

		switch (nombre){

		case 1 :
			System.out.println("Vous trouvez un trésor !");
			System.out.println("Il contient 50 pieces d'or !");
			newHeros.setBourseHeros(newHeros.getBourseHeros()+50);
			System.out.println("Votre bourse contient maintenant "+ newHeros.getBourseHeros()+ " pieces d'or !");
			System.out.println("*************************************************************************************************");
			choixDepl(newHeros, degatsHeros, degatsMonstre);
			break;
		case 2 :
			System.out.println("Vous trouvez un trésor !");
			System.out.println("Il contient 100 pieces d'or!");
			newHeros.setBourseHeros(newHeros.getBourseHeros()+100);
			System.out.println("Votre bourse contient maintenant "+ newHeros.getBourseHeros()+ " pieces d'or !");
			System.out.println("*************************************************************************************************");
			choixDepl(newHeros, degatsHeros, degatsMonstre);
			break;
		case 3:
			System.out.println("Vous trouvez un trésor!");
			System.out.println("Il contient 20 pieces d'or!");
			newHeros.setBourseHeros(newHeros.getBourseHeros()+20);
			System.out.println("Votre bourse contient maintenant "+ newHeros.getBourseHeros()+ " pieces d'or !");
			System.out.println("*************************************************************************************************");
			choixDepl(newHeros, degatsHeros, degatsMonstre);
			break;
		case 4:
			Monstre newMonstre = new Monstre();
			System.out.println("Vous tombez nez a nez avec un monstre !");
			systemCombat(newHeros, newMonstre, degatsMonstre, degatsHeros);
		}



	}
	public void introJeu(Heros newHeros){ // Ceci est l'introduction au jeu , avec le choix du nom du personnage et une courte introduction.
		Scanner demandePseudo=new Scanner(System.in);
		System.out.println("*************************************************************************************************");
		System.out.println("Veuillez entrer un nom pour votre personnage : ");
		newHeros.setNomHeros(demandePseudo.nextLine());
		System.out.println("Bienvenue dans mon RPG " + newHeros.getNomHeros()+" !!");
		System.out.println("Le but est simple, vous devez choisir entre differente directions");
		System.out.println("A la maniere d'un jeu de plateau");
		System.out.println("Vous rencontrerez differents evenements aleatoires");
		System.out.println("Si votre vie tombe a 0, vous mourrez !");
		System.out.println("Bonne chance !");
	}
	public void choixDepl(Heros newHeros, int degatsHeros, int degatsMonstre){ // Voici la fonction de choix de déplacement , en réalité le deplacement importe peu , cependant il donne une profondeur au jeu

		Scanner entreeDepl = new Scanner(System.in);
		System.out.println("*************************************************************************************************");
		System.out.println("Veuillez choisir une direction en saisisant le nombre indiqué");
		System.out.println("1. Haut / Monter d'une case");
		System.out.println("2. Bas / Descendre d'une case");
		System.out.println("3. Gauche / Aller sur la gauche d'une case");
		System.out.println("4. Droite / Aller sur la droite d'une case");
		System.out.println("5. Se diriger vers le sombre marchand encapuchonne");
		System.out.println("Votre reponse (numero) :");
		int depl=entreeDepl.nextInt();

		switch (depl) {

		case 1 :
			System.out.println("Vous montez d'une case");
			evenAlea(newHeros, degatsHeros, degatsMonstre);
			break;
		case 2:
			System.out.println("Vous descendez d'une case");
			evenAlea(newHeros, degatsHeros, degatsMonstre);
			break;
		case 3:
			System.out.println("Vous allez vers la gauche d'une case");
			evenAlea(newHeros, degatsHeros, degatsMonstre);
			break;
		case 4:
			System.out.println("Vous allez vers la droite d'une case");
			evenAlea(newHeros, degatsHeros, degatsMonstre);
			break;
		case 5:
			System.out.println("A l'entree de la piece ce trouve un marchand a l'air sombre.");
			System.out.println("Vous vous en approchez");
			boutique(newHeros, degatsHeros, degatsMonstre);
		default :
			System.out.println("Veuillez entrer un chiffre correct");
			choixDepl(newHeros, degatsHeros, degatsMonstre);
			break;
		}
	}
	public void systemCombat(Heros newHeros, Monstre newMonstre,int degatsHeros, int degatsMonstre){  // script du system de combat
		boolean pileOuface=(Math.random() < 0.5);

		if (pileOuface == true) {
			System.out.println("Vous avez gagné le pile ou face");
			System.out.println("Vous commencez le combat");
			tourHeros(newHeros,newMonstre, degatsMonstre, degatsHeros);
		}else {
			System.out.println("Vous perdez le pile ou face");
			System.out.println("Le monstre commence le combat");
			tourMonstre(newHeros,newMonstre, degatsMonstre, degatsHeros);

			while (newHeros.getVieHeros()>0 && newMonstre.getVieMonstre()>0){
				boolean rng=(Math.random() < 0.5);
				if (rng == true){
					tourHeros(newHeros, newMonstre, degatsMonstre, degatsHeros);
				}
				else {
					tourMonstre(newHeros, newMonstre, degatsMonstre, degatsHeros);
				}
			}

			if (newHeros.getVieHeros()<1){
				System.out.println("Ce monstre vous a battu !");
				System.out.println("Vous avez 0 point de vie");
				System.out.println("Vous etes hors-jeu !");
				System.out.println("Retour au menu");
				entreeMenu(newHeros);
			}
			else{
				System.out.println("Vous avez triomphe !!!");
				System.out.println("Vous continuez l'aventure");
				choixDepl(newHeros,degatsMonstre, degatsHeros);
			}
		}

	}


	public void tourHeros(Heros newHeros, Monstre newMonstre, int degatsMonstre, int degatsHeros){
		System.out.println("Vous frappez le monstre !");
		System.out.println("Vous infligez : " +degatsHeros+" points de degats" );
		newMonstre.setVieMonstre(newMonstre.getVieMonstre()-degatsHeros);
		System.out.println("Il reste au monstre ignoble "+ newMonstre.getVieMonstre()+" points de vie");
		System.out.println("Vous passez votre tour");
		System.out.println("*************************************************************************************************");
	}		
	public void tourMonstre(Heros newHeros, Monstre newMonstre, int degatsMonstre, int degatsHeros){
		System.out.println("Le monstre vous frappe !");
		System.out.println("Il vous inflige "+degatsMonstre +" points de degats" );
		newHeros.setVieHeros(newHeros.getVieHeros()-degatsMonstre);
		System.out.println("Il vous reste  "+ newHeros.getVieHeros()+" points de vie");
		System.out.println("Le monstre passe son tour");
		System.out.println("*************************************************************************************************");

	}
	public void boutique(Heros newHeros, int degatsHeros, int degatsMonstre){
		System.out.println("*************************************************************************************************");
		System.out.println("En vous voyant, le marchand vous ouvre son manteau");
		System.out.println("'Choisi donc c'que tu veux mon brave'");
		System.out.println("*Il vous sourit, toutes ses dents sont pourries et une fumee verdatre s'evade lentement de sa bouche*");
		System.out.println("*************************************************************************************************");
		Scanner choixScan = new Scanner(System.in);

		int pvie=25;
		int gpvie=60;
		int epeec=5;
		int epeel=10;
		System.out.println("Veuillez choisir une option du menu");
		System.out.println("1. Acheter une potion de vie (+25 pv) (200 po)");
		System.out.println("2. Acheter une grande potion de vie (+60 pv ) (350 po)"); 
		System.out.println("3. Acheter une benediction (+ 5 force) (400 po)");
		System.out.println("4. Acheter une faveur divine (+10 force) (750 po)");
		System.out.println("5. Retourner dans le donjon");
		System.out.println("*************************************************************************************************");
		int choixBoutique=choixScan.nextInt();
		switch (choixBoutique){

		case 1:
			if (newHeros.getBourseHeros()<200){
				System.out.println("Vous n'avez pas assez d'or");
				boutique(newHeros, degatsHeros, degatsMonstre);
			}
			else {
				System.out.println("Vous achetez une potion de vie");
				newHeros.setVieHeros(newHeros.getVieHeros()+pvie);
				System.out.println("Votre vie est maintenant de "+ newHeros.getVieHeros()+" points de vie");
				System.out.println("Merci pour vos piecettes !! *rire demoniaque*");
				newHeros.setBourseHeros(newHeros.getBourseHeros()-200);
				System.out.println("Il vous reste "+ newHeros.getBourseHeros() +" pieces d'or");
				boutique(newHeros, degatsHeros, degatsMonstre);
			}
		case 2:
			if (newHeros.getBourseHeros()<350){
				System.out.println("Vous n'avez pas assez d'or");
				boutique(newHeros, degatsHeros, degatsMonstre);
			}
			else {
				System.out.println("Vous achetez une grande potion de vie");
				newHeros.setVieHeros(newHeros.getVieHeros()+gpvie);
				System.out.println("Votre vie est maintenant de "+ newHeros.getVieHeros()+" points de vie");
				System.out.println("Merci pour vos piecettes !! *rire demoniaque*");
				newHeros.setBourseHeros(newHeros.getBourseHeros()-350);
				System.out.println("Il vous reste "+ newHeros.getBourseHeros() +" pieces d'or");
				boutique(newHeros, degatsHeros, degatsMonstre);
			}
		case 3:
			if (newHeros.getBourseHeros()<400){
				System.out.println("Vous n'avez pas assez d'or");
				boutique(newHeros, degatsHeros, degatsMonstre);
			}
			else {
				System.out.println("Vous achetez une benediction");
				System.out.println("*Vous sentez votre puissance augmentée*");
				newHeros.setForceHeros((newHeros.getForceHeros()+epeec));
				System.out.println("Votre force est maintenant de "+ newHeros.getForceHeros());
				System.out.println("Merci pour vos piecettes !! *rire demoniaque*");
				newHeros.setBourseHeros(newHeros.getBourseHeros()-400);
				System.out.println("Il vous reste "+ newHeros.getBourseHeros() +" pieces d'or");
				boutique(newHeros, degatsHeros, degatsMonstre);
			}
		case 4:
			if (newHeros.getBourseHeros()<750){
				System.out.println("Vous n'avez pas assez d'or");
				boutique(newHeros, degatsHeros, degatsMonstre);
			}
			else {
				System.out.println("Vous achetez une faveur divine");
				System.out.println("*Vous sentez votre puissance augmentée drastiquement*");
				newHeros.setForceHeros((newHeros.getForceHeros()+epeel));
				System.out.println("Votre force est maintenant de "+ newHeros.getForceHeros());
				System.out.println("Merci pour vos piecettes !! *rire demoniaque*");
				newHeros.setBourseHeros(newHeros.getBourseHeros()-750);
				System.out.println("Il vous reste "+ newHeros.getBourseHeros() +" pieces d'or");
				boutique(newHeros, degatsHeros, degatsMonstre);
			}
		case 5:
			System.out.println("Vous faites un signe de la main au marchand");
			System.out.println("En vous retournant vous vous retrouvez face a l'arche beante de l'entree du donjon");
			System.out.println("Vous passez sous l'arche et vous enfoncez dans les tenebres");
			choixDepl(newHeros, degatsHeros, degatsMonstre);
		}

	}
}	

	


		
	





