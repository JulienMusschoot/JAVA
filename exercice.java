import java.util.*;
	public class exercice {
		public static void main (String[]args){
			
			int valeur1 , valeur2; // declaration des variables
			Scanner lectureClavier= new Scanner(System.in); // initialiser ma lecture d'entée
			System.out.println("Veuillez entrer votre premier nombre : ");
			valeur1=lectureClavier.nextInt();
			System.out.println("Veuillez entrer votre deuxieme nombre : ");
			valeur2=lectureClavier.nextInt();
			
			if (valeur1<valeur2) System.out.println("Voici vos nombres dans l'ordre croissant : "+valeur1+"et "+valeur2);
				
				
			
			else System.out.println("Voici vos nombres dans l'ordre croissant : "+valeur2+"et "+valeur1);
				

			
			
			
			
			
			
			
		}
	
	
	
	
}