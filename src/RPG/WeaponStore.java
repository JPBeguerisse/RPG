package RPG;

import java.util.ArrayList;
import java.util.Scanner;

public class WeaponStore {
	
	private ArrayList<Weapon> store = new ArrayList<>();	
	Weapon bow = new Bow();
	Weapon hammer = new Hammer();
	Weapon axe = new Axe();
	Weapon sword = new Sword();
	Weapon gun = new Shotgun();
	
	Scanner sc = new Scanner(System.in);

	
	//Constructeur store
	public WeaponStore(ArrayList<Weapon> store)
	{
		this.store = store;
		this.store.add(bow);
		this.store.add(hammer);
		this.store.add(axe);
		this.store.add(sword);
		this.store.add(gun);
	}
	
	
	//afficher les armes et leur prix 
	public void afficheStore() {
		int x = 0;
		System.out.println("Bienvenue dans votre boutique \n");
		for(Weapon w : store) {
			System.out.println(x+1 + " : " + w.ascii());
			x++;
		}
	}

	//Fonction pour acheter une arme qui prend en param la personne qui achète
	public void buyWeapon(Personnage pers)
	{
		int weaponNumber = -1;
		
		while(weaponNumber<0)
		{
			System.out.println("Saissez le numéro de l'arme que vous souhaitez acheté :");
			weaponNumber = sc.nextInt()-1; //-1 vu que  le tableau commence par 0 (si entre 1 donc egale [0])
			//sc.nextLine();
		}
		if(pers.XP - store.get(weaponNumber).price > 0 )
		{
			pers.inventaire.addObjet(store.get(weaponNumber)); //ajouter les armes acheter dans l'inventaire du joueur
			pers.XP -= store.get(weaponNumber).price;
			System.out.println(pers.inventaire.getContenu()); // afiche les armes dispo dans l'inventaire du joueur
			System.out.println("Il vous reste " + pers.XP + "XP");
			System.out.println();

		}else {
			System.out.println("XP insuffisant");
		}
				
	}
}
