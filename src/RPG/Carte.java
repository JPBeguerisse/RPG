package RPG;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Carte {
	public static final int NB_ROW = 5;
	public static final int NB_COL = 5;
	
	private static Random random = new Random();
	private Object grille [][] = new Object[NB_ROW][NB_COL];
	private ArrayList<Monster> monster = new ArrayList<Monster>();
	private ArrayList<Obstacle> obstacle = new ArrayList<Obstacle>();
	private Personnage p;
	
	//Constructeur
	/*public Carte ()
	{
		grille = new Object[NB_COL][NB_ROW];
		for(int i = 0 ; i < NB_ROW ; ++i)
		{
			for(int j = 0 ; j < NB_COL ; ++j)
				grille[i][j] = null;
				grille[2][0] = p;

		}
		
		int l = random.nextInt(NB_ROW);
		int c = random.nextInt(NB_COL);
		grille[l][c] = new Monster(new Position(l, c));
		monster.add((Monster) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Monster(new Position(l, c));
		monster.add((Monster) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Monster(new Position(l, c));
		monster.add((Monster) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Obstacle(new Position(l, c));
		obstacle.add((Obstacle) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Obstacle(new Position(l, c));
		obstacle.add((Obstacle) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Obstacle(new Position(l, c));
		obstacle.add((Obstacle) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
	}*/
	
	public void jouer()
	{
		
		int l = random.nextInt(NB_ROW);
		int c = random.nextInt(NB_COL);
		grille[l][c] = new Monster(new Position(l, c));
		monster.add((Monster) grille[l][c]);

		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Monster(new Position(l, c));
		monster.add((Monster) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Monster(new Position(l, c));
		monster.add((Monster) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Obstacle(new Position(l, c));
		obstacle.add((Obstacle) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Obstacle(new Position(l, c));
		obstacle.add((Obstacle) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		grille[l][c] = new Obstacle(new Position(l, c));
		obstacle.add((Obstacle) grille[l][c]);
		
		while (grille[l][c] != null) {
			c = random.nextInt(NB_COL);
			l = random.nextInt(NB_ROW);
		}
		
		
		positionnerPersonnage(p.getPositionRow(), p.getPositionCol());
		
		afficherCarte();

		int rep = 0;
		do {	
			Scanner sc = new Scanner(System.in);
			System.out.println("Donnez la ligne où vous souhaitez vous placer: ");
			int lig = sc.nextInt() -1;
			
			System.out.println("Donnez la colonne où vous souhaitez vous placer: ");
			int col = sc.nextInt() -1;
			positionnerPersonnage(lig, col);
			
			//ajouter une position l c par défaut pour l personnage lors de sa creation
		
			afficherCarte();
			System.out.println();
			System.out.println("1: pour vous déplacer");
			rep = sc.nextInt();
		}while(rep == 1);
		
	}
	
	
	public Personnage getP() {
		return p;
	}


	public void setP(Personnage p) {
		this.p = p;
	}


	//Position le personnage sur un position par lgn colonne
	public void positionnerPersonnage(int l, int c)
	{ 
		if(l >= 0 && l < NB_ROW || c >= 0 && c < NB_COL)
		{
			
			for(int i = 0; i < NB_ROW; i++) 
			{
				for(int j = 0 ; j < NB_COL; j++)
				{	
					// effacer d'abord l'ancien case de p
					if(grille[i][j] == p)
					{
						grille[i][j] =  "A";

					}
					
					grille[l][c] = p;

				}
			}
		}
		
	}
	
	
	public void afficherCarte()
	{
		
		grille[0][4] = "A";

		for(int i = 0; i < NB_ROW; i++)
		{
			System.out.println("-------------------");
			for(int j = 0; j < NB_COL; j++)
			{
				
				
				if(grille[i][j] == p)
				{
					grille[i][j] = "P";
				}
				
				for(int k = 0; k<monster.size(); k++) {
					
					if(grille[i][j] == monster.get(k))
					{
						grille[i][j] = "M";
					}		
				}
				
				for(int k = 0; k<obstacle.size(); k++) {
					
					if(grille[i][j] == obstacle.get(k))
					{
						grille[i][j] = "O";
					}		
				}
				
				if(grille[i][j] == null)
				{
					grille[i][j] = " ";
				}
				
				System.out.print(grille[i][j] + " | ");
			}
			System.out.println();
		}
		System.out.println("-------------------");
	}

	

	
	//Ascenceur
	
	public Object getCase(int l, int c){
		return grille[l][c];
	}
	
	public void setCase(int l, int c, Object element){
		this.grille[l][c] = element;
	}
	
	public static Random getRandom() {
		return random;
	}

	public static void setRandom(Random random) {
		Carte.random = random;
	}

	public Object[][] getGrille() {
		return grille;
	}

	public void setGrille(Object[][] grille) {
		this.grille = grille;
	}

	public ArrayList<Monster> getMonster() {
		return monster;
	}

	public void setMonster(ArrayList<Monster> monster) {
		this.monster = monster;
	}

	public ArrayList<Obstacle> getObstacle() {
		return obstacle;
	}

	public void setObstacle(ArrayList<Obstacle> obstacle) {
		this.obstacle = obstacle;
	}

	public static int getNbrRows() {
		return NB_ROW;
	}

	public static int getNbrCols() {
		return NB_COL;
	}

	
	
	
}
