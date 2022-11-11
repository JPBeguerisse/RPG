package RPG;

public class Monster extends Destructible{

	public Monster(Position p) {
		super(100, 10);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void hitMe(double damage) {
		// TODO Auto-generated method stub
		this.life =- damage;
		pers.XP += 10;
	}
	
	
}
