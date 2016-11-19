import java.util.Scanner;
import java.util.Random;

public class ProjetJeuCnam {
	Heros newHeros = new Heros();
	Monstre newMonstre = new Monstre();
	int max=6,min=1;
	int accDegats = (int)(Math.random()*(max-min))+min; // creer une variable entre 1 et 6 qui multiplie le resultat de degats
	int degatsHeros=(newHeros.getForceHeros()*2/(newMonstre.getArmureMonstre()))*accDegats;
	int degatsMonstre = (newMonstre.getForceMonstre()*2/((newHeros.getArmureHeros())))*accDegats;
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
		System.exit(0);
		break;
		case 3: 
		System.out.println("3. Vous voulez obtenir des informations, un instant !");
		infoJeu();
		default : 
		entreeMenu();
		}
		
	
	}
	public void entreeMenu() { // Debut du programme , permet de lancer le jeu ou d'autres options via un menu
		
		
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
		
		choixUtilMenu(choixMenu); // <=========== appel de la fonction choixUtilMenu avec comme parametres le resultat de l'entree utilisateur
		
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
	public void evenAlea(){
		Random rand = new Random();
		int nombre = rand.nextInt(5); 
		
		switch (nombre){
		
		case 1 :
			System.out.println("Vous trouvez un trésor !");
			System.out.println("Il contient 50 pieces d'or !");
			newHeros.setBourseHeros(newHeros.getBourseHeros()+50);
			System.out.println("Votre bourse contient maintenant "+ newHeros.getBourseHeros()+ " pieces d'or !");
			choixDepl();
			break;
		case 2 :
			System.out.println("Vous trouvez un trésor !");
			System.out.println("Il contient 100 pieces d'or!");
			newHeros.setBourseHeros(newHeros.getBourseHeros()+100);
			System.out.println("Votre bourse contient maintenant "+ newHeros.getBourseHeros()+ " pieces d'or !");
			choixDepl();
			break;
		case 3:
			System.out.println("Vous trouvez un trésor!");
			System.out.println("Il contient 20 pieces d'or!");
			newHeros.setBourseHeros(newHeros.getBourseHeros()+20);
			System.out.println("Votre bourse contient maintenant "+ newHeros.getBourseHeros()+ " pieces d'or !");
			choixDepl();
			break;
		case 4:
			System.out.println("Vous tombez nez a nez avec un monstre !");
			systemCombat();

		}
			
		
		
	}
	public void introJeu(){ // Ceci est l'introduction au jeu , avec le choix du nom du personnage et une courte introduction.
		Scanner demandePseudo=new Scanner(System.in);
		System.out.println("Veuillez entrer un nom pour votre personnage : ");
		newHeros.setNomHeros(demandePseudo.nextLine());
		System.out.println("Bienvenue dans mon RPG " + newHeros.getNomHeros()+" !!");
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
			evenAlea();
			break;
		case 2:
			System.out.println("Vous descendez d'une case");
			evenAlea();
			break;
		case 3:
			System.out.println("Vous allez vers la gauche d'une case");
			evenAlea();
			break;
		case 4:
			System.out.println("Vous allez vers la droite d'une case");
			evenAlea();
			break;
		default :
			System.out.println("Veuillez entrer un chiffre correct");
			choixDepl();
			break;
		}
	}
	public void systemCombat(){  // script du system de combat
		boolean pileOuface=(Math.random() < 0.5);
		
		if (pileOuface == true) {
			System.out.println("Vous avez gagné le pile ou face");
			System.out.println("Vous commencez le combat");
			System.out.println("Vous affrontez un monstre de " + newMonstre.getVieMonstre()+" points de vie.");
			System.out.println("Vous portez le premier coup, vous infligez "+degatsHeros+" points de degats");
			newMonstre.setVieMonstre(newMonstre.getVieMonstre()-degatsHeros);
			System.out.println("Il reste au monstre ignoble "+ newMonstre.getVieMonstre()+" points de vie");
		}else {
			System.out.println("Vous perdez le pile ou face");
			System.out.println("Le monstre commence le combat");
			System.out.println("Le monstre vous inflige "+ degatsMonstre + " points de degats");
			newHeros.setVieHeros(newHeros.getVieHeros()-degatsMonstre);
		
		while (newHeros.getVieHeros()>=0 || newMonstre.getVieMonstre()>=0){
			boolean rng=(Math.random() < 0.5);
				if (rng == true){
					tourHeros();
				}
				else {
					tourMonstre();
				}
		}
		
		if (newHeros.getVieHeros()>0){
			System.out.println("Ce monstre vous a battu !");
			System.out.println("Vous avez 0 point de vie");
			System.out.println("Vous etes hors-jeu !");
			System.out.println("Retour au menu");
			entreeMenu();
		if (newMonstre.getVieMonstre()>0){
			System.out.println("Vous avez triomphe !!!");
			System.out.println("Vous continuez l'aventure");
			choixDepl();
			}
		}
		}
				
				
				
				
		}
		

	public void tourHeros(){
		System.out.println("Vous frappez le monstre !");
		System.out.println("Vous infligez : " +degatsHeros+"points de degats" );
		newMonstre.setVieMonstre(newMonstre.getVieMonstre()-degatsHeros);
		System.out.println("Il reste au monstre ignoble "+ newMonstre.getVieMonstre()+" points de vie");
		System.out.println("Vous passez votre tour");
	}		
	public void tourMonstre(){
		System.out.println("Le monstre vous frappe !");
		System.out.println("Il vous inflige "+degatsMonstre +" points de degats" );
		newHeros.setVieHeros(newHeros.getVieHeros()-degatsMonstre);
		System.out.println("Le monstre passe son tour");
		
		
	}
		
		}

	


		
	





