package RPG;

public class Obstacle extends Destructible {

	public Obstacle(Position p) {
		super(100, 5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void hitMe(double damage) {
		
		this.life =- damage;
		pers.XP += 5;
		
	}
	
}
