import java.util.*;
public class devinette{
	public static void main (String[]args){
		
	int i=(int) (50*Math.random());
	int nombreEssais = 1;
	int lectureClavier=0;
	int lectureClavier2=0;
	//fin variable
	
		Scanner clavier=new Scanner(System.in);
		System.out.println("Entrer un nombre");
		lectureClavier=clavier.nextInt();
	
		
			while (lectureClavier != i && lectureClavier2 != i){
			Scanner clavier2=new Scanner(System.in);
			System.out.println("Entrer un nombre");
			lectureClavier2=clavier2.nextInt();
			nombreEssais = nombreEssais + 1;	
		
					if (lectureClavier2<i)
					{
					System.out.println("Trop bas !");
					}	
					else {
					System.out.println("Trop haut !");
					}
				
			}
		
		System.out.println("Bravo, vous avez trouve !");
		System.out.println("Le nombre etait :"+ i);
		System.out.println("Vous avez trouve au bout de :"+nombreEssais+" essais !");
		
		}
	}
	
}