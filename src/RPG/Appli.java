package RPG;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Appli {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
				int rep = 0, menu = -1;
				
				String name;
				Personnage pers = null;
				Scanner sc = new Scanner(System.in);
				Carte c = new Carte();
				System.out.println("Welcome RPG");

				Personnage p = Personnage.createPersonnage();
				c.setP(p);
				System.out.println();
				try {
					do {
						
						System.out.println("**************MENU************");
						System.out.println("1 pour acheter un arme");
						System.out.println("2 voir votre inventaire");
						System.out.println("3 pour jouer");
	
						menu=sc.nextInt();
							
						if(menu==1)
						{
							ArrayList<Weapon> w = new ArrayList<>();
							WeaponStore store = new WeaponStore(w);
							store.afficheStore();
							store.buyWeapon(p);
							System.out.println("1 pour acheter encore une arme: ");
							System.out.println("0 Menu principale: ");
							//AFfficher inventaire
	
							//jouer
							menu = sc.nextInt();
						}else if(menu==2)
						{
							System.out.println(p.inventaire.getContenu()); 
							System.out.println("0 Menu principale: ");
							menu=sc.nextInt();
						}
						else if(menu==3)
						{	
							System.out.println("Votre objectif est d'affronter les monstres et les obstales"
									+ " pour arrivé au point A");
							c.jouer();
							System.out.println("0 Menu principale: ");
							menu=sc.nextInt();
						}
					}while(menu==0);
				}catch(InputMismatchException e)
				{
					System.out.println("Saisie invalide; Veuillez taper un numéro");
				}
				
	}
}
