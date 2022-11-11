package RPG;

public class Shotgun extends Weapon{
	private static final double damage = 70;
	private static final String name = "fusil";
	private static final double price = 150;
	public Shotgun() {
		super(name, price, damage);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String ascii() {
		// TODO Auto-generated method stub
		return super.toString() + "\n" +
 
				",______________________________________       \n"
				+ "|_________________,----------._ [____]  \"\"-,__  __....-----=====\n"
				+ "               (_(||||||||||||)___________/   \"\"                |\n"
				+ "                  `----------'        [ ))\"-,                   |\n"
				+ "                                       \"\"    `,  _,--....___    |\n"
				+ "                                               `/           \"\"\"\"";
	}

	@Override
	public void attack(Destructible d) {
		// TODO Auto-generated method stub
		
	}

}
