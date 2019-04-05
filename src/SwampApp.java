import java.util.Scanner;

public class SwampApp {
	static Scanner sc = new Scanner(System.in);
	static boolean play = true;
	static Player bob = new Player();
	static FriendlyNpc pFn = new FriendlyNpc(0);
	static HostileNpc hostileNpc = new HostileNpc(0, 0);
	static Compass magic = new Compass();

	public static void main(String[] args) {
		System.out.println("Welcome to Deadly Swamp");
		System.out.println("Where do you want to go?");
		while (play == true) {
			if (magic.getLoc() == 0.0) {
				play = false;
				System.out.println("You won");
				sc.close();

			} else {
				// UNDER CONSTRUCTION RANDOM ENCOUNTERS
				int pMoves = 0;
				int enc = pMoves % 3;
				if (enc == 2) {
					int r = (int) (10 * Math.random());
					if (r > 5) {
						hostileNpc.say();
					}
					// END OF CONSTRUCTION

				}

				System.out.println("Player y" + bob.getY());
				System.out.println("Player x" + bob.getX());
				System.out.println("Tresure y" + magic.getY());
				System.out.println("Tresure x" + magic.getX());
				String action = sc.next().toLowerCase();

				switch (action) {
				case "north":
					bob.moveN();
					System.out.println("Where do you want to go now?");
					System.out.println("You touch your magic cabbage and you feel that treasure is still: "
							+ magic.getLoc() + "meters away");
					pMoves++;
					break;
				case "south":
					bob.moveS();
					System.out.println("Where do you want to go now?");
					System.out.println("You touch your magic cabbage and you feel that treasure is still: "
							+ magic.getLoc() + "meters away");
					pMoves++;
					break;

				case "west":
					bob.moveW();
					System.out.println("Where do you want to go now?");
					System.out.println("You touch your magic cabbage and you feel that treasure is still: "
							+ magic.getLoc() + "meters away");
					pMoves++;
					break;

				case "east":
					bob.moveE();
					System.out.println("Where do you want to go now?");
					System.out.println("You touch your magic cabbage and you feel that treasure is still: "
							+ magic.getLoc() + "meters away");
					pMoves++;
					break;

				case "done":
					play = false;
					System.out.println("YOU LOSE!");
					sc.close();
					break;

				default:
					break;

				}
			}

		}
	}
}
