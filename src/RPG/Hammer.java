package RPG;

public class Hammer extends Weapon{
	private static final double damage = 20;
	private static final String name = "marteau";
	private static final double price = 50;
	public Hammer() {
		super(name, price, damage);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String ascii() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" +

				"             		    +---+\n" 
				+ " ___________________________|   |\n"
				+ "{___________________________|   |\n"
				+ "             		    :___;";
	}

	@Override
	public void attack(Destructible d) {
		// TODO Auto-generated method stub
		
	}

}
