package RPG;

public class Sword extends Weapon{
	private static final double damage = 55;
	private static final String name = "epés";
	private static final double price = 60;
	
	public Sword() {
		super(name, price, damage);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String ascii() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" +

				"         />_________________________________\n"
				+ "[########[]_________________________________>\n"
				+ "         \\>";
	}


	@Override
	public void attack(Destructible d) {
		// TODO Auto-generated method stub
		
	}

}
