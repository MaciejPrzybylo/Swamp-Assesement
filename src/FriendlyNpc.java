
public class FriendlyNpc extends Npc {

	public FriendlyNpc(int hp) {
		super(hp);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void say() {
		int random = (int) (10 * Math.random());

		if (random <= 5) {
			switch (random) {
			case 1:
				System.out.println("Yoo fam whats upppp!");
				break;
			case 2:
				System.out.println("Whatssss Uppppppppppppp");
				break;

			case 3:
				System.out.println("Wanna buy some drugs");
				break;

			case 4:
				System.out.println("Carpets i got a fresh Carpets for sale");
				break;

			case 5:
				System.out.println("Elo");
				break;
			}
		} if (random > 5) {
			System.out.println("Greetings Traveller");
		}
		
	}

}
