package RPG;

public abstract class Destructible {
	protected double life;
	protected double attaque;
	protected Position position;

	Personnage pers;

	
	public Destructible(double life, double attaque) {
		this.life = life;
		this.attaque = attaque;
	}
	//Methode qui diminue le nombre de vie du monstre et qui augmente le XP du joueur si le monstre est tué
	public abstract void hitMe(double damage); 
}
