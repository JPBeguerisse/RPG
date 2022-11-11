package RPG;

public abstract class Weapon {
	protected String name;
	protected double price;
	protected double damage;
	
	public Weapon(String name, double price, double damage)
	{
		this.name = name;
		this.price = price;
		this.damage = damage;
	}
	
	public abstract void attack(Destructible d);
	public abstract String ascii();
	
	public String toString()
	{
		return this.name + "\nPrix: " + this.price + "\nForce :" + this.damage;
	}
}



