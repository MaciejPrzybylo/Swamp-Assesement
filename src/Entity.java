
public abstract class Entity {
private int y;
private int x;
	
public Entity() {
setX(10 * Math.random());
setY(10 * Math.random());
}

public double getY() {
	return y;
}

public void setY(double y) {
	this.y = (int) y;
}

public double getX() {
	return x;
}

public void setX(double x) {
	this.x = (int) x;
}
}
