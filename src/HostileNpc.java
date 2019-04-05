
public class HostileNpc extends Npc {
private int dmg;
	public HostileNpc(int hp, int dmg) {
		super(hp);
		this.setDmg(dmg);
		// TODO Auto-generated constructor stub
	}

	public void say() {
	int	randomSay = (int) (10 * Math.random());

		if (randomSay <= 5) {
			switch (randomSay) {
			case 1:
				System.out.println("Grrr");
				break;
			case 2:
				System.out.println("rawwrr");
				break;

			case 3:
				System.out.println("Earth is flat");
				break;

			case 4:
				System.out.println("Vaccines dont work");
				break;

			case 5:
				System.out.println("I love photosysthesis");
				break;
			}
		} if (randomSay > 5) {
			System.out.println("Arr Grr Rawr");
		}
	}

	public int getDmg() {
		return dmg;
	}

	public void setDmg(int dmg) {
		this.dmg = dmg;
	}
}
