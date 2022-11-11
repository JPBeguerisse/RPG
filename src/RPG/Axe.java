package RPG;

public class Axe extends Weapon{
	private static final double damage = 40;
	private static final String name = "hache";
	private static final double price = 90;
	
	public Axe() {
		super(name, price, damage);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public String ascii() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" +
 
				"  ,:\\      /:.\n"
				+ " //  \\_()_/  \\\\\n"
				+ "||   |    |   ||\n"
				+ "||   |    |   ||\n"
				+ "||   |____|   ||\n"
				+ " \\\\  / || \\  //\n"
				+ "  `:/  ||  \\;'\n"
				+ "       ||\n"
				+ "       ||\n"
				+ "       XX\n"
				+ "       XX\n"
				+ "       XX\n"
				+ "       XX\n"
				+ "       OO\n"
				+ "       `'\n"
				+ "";
	}




	@Override
	public void attack(Destructible d) {
		// TODO Auto-generated method stub
		d.hitMe(damage);
	}

}
