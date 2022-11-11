package RPG;

public class Bow extends Weapon{
	private static final double damage = 35;
	private static final String name = "arc";
	private static final double price = 60;
	
	public Bow() {
		super(name, price, damage);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String ascii() {
		return super.toString() + "\n" +
		"	(			\n" +
		"	 \'			\n" +
		"	  )			\n" +
		"##----------->	\n" +
		" 	  )			\n" +
		" 	 /			\n" +
		" 	(			\n";

	}



	@Override
	public void attack(Destructible d) {
		// TODO Auto-generated method stub
		
	}

}
