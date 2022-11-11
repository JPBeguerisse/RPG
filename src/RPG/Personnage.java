package RPG;

import java.util.ArrayList;
import java.util.Scanner;

public class Personnage {
	protected String name;
	protected double mana;
	protected double XP;
	private ArrayList<Weapon> contenu = new ArrayList<>();
	protected Position position;
	private int positionRow;
	private int positionCol;


	public void setPosition(Position position) {
		this.position = position;
	}


	static Scanner sc = new Scanner(System.in);

	protected Inventaire inventaire = new Inventaire(contenu);

	public Personnage(String name, double mana, double XP) {
		this.name = name;
		this.mana = mana;
		this.XP = XP;
		this.positionRow = 4;
		this.positionCol = 0;
	}
	
	
	

	public static Personnage createPersonnage()
	{
		
		String name = null ;
		Personnage pers;
		
		System.out.println("Choississez votre personnage en tapant son nom :\n"
				+ "Guerrier\n"
				+ "Sorcier\n"
				+ "Ou taper le nom d'un nouveau personnage :");
				name=sc.next();
		
		if(name.equalsIgnoreCase("Guerrier")) {
			pers = new Guerrier();
		}
		else if(name.equalsIgnoreCase("Sorcier")) {
			pers = new Sorcier();
		}else {
			pers = new Personnage(name, 100, 250);
		}
		
		System.out.println(pers.toString());
		return pers;
		
	}
	
	
	
	public double buy(Weapon w) {
		return this.XP - w.price;
	}
	
	public double getMana() {
		return mana;
	}


	public void setMana(double mana) {
		this.mana = mana;
	}


	public double getXP() {
		return XP;
	}


	public void setXP(double xP) {
		XP = xP;
	}

	
	
	public Inventaire getInventaire() {
		return this.inventaire;
	}

	public void setInventaire(Inventaire inventaire) {
		this.inventaire = inventaire;
	}
	
	public Position getPosition() {
		return position;
	}
	
	
	public int getPositionRow() {
		return positionRow;
	}


	public void setPositionRow(int positionRow) {
		this.positionRow = positionRow;
	}


	public int getPositionCol() {
		return positionCol;
	}


	public void setPositionCol(int positionCol) {
		this.positionCol = positionCol;
	}

	
	public String toString()
	{
		return "Voici les détails de votre personnage :\n"
				+ "Nom: " +this.name 
				+ "\nVie: " +this.mana
				+ "\nXP: " +this.XP
				//+ "\nArmes: " +this.inventaire
				;
	}
}

	
