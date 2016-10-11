import java.util.*;
public class machinecafe{
	public static void main (String[]args){
		
		byte piece5 = 5;  // declaration des variables
		byte piece10 = 10;
		byte piece20 = 20;
		int totalpiece=0;
		byte prixcafe = 45;
		int sommeutilisateur=0;
		int sommecafe=0;
		
		System.out.println("Bienvenue à la machine à cafe");
		System.out.println("Le prix d'un cafe est de 45 centimes");
		System.out.println("Seules les pieces de 5,10,20 centimes sont acceptees");
		
		do { // debut de la boucle
			Scanner lectureClavier=new Scanner (System.in);
			System.out.println("Veuillez inserer une piece");
			sommeutilisateur=lectureClavier.nextInt(); // 
			sommecafe=sommecafe+sommeutilisateur;
			totalpiece=totalpiece+1;
		}
			while (sommecafe <= 45);
			
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
