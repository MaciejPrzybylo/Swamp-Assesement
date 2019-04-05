
public class Player extends Entity {

public void moveN() {
	int newY = (int) getY();
	setY(newY+=1);
	}
public void moveS() {
	int newY = (int) getY();
	setY(newY-=1);
	}
public void moveW() {
	int newY = (int) getX();
	setX(newY+=1);
}
public void moveE() {
	int newY = (int) getX();
	setX(newY-=1);
}
}
