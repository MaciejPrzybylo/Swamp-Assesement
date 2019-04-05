
public class Compass extends Entity{

public double getLoc() {
	double loc;
int	pY=(int) SwampApp.bob.getY(),
	pX=(int) SwampApp.bob.getX(),
	tY=(int) SwampApp.magic.getY(),
	tX=(int) SwampApp.magic.getX(),
	h,
	w;

if(pY>=tY) {
	 h = pY-tY;
}
else {
	h = tY-pY;	
}

if (pX>=tX) {
	 w = pX-tX;
}else {
	w=tX-pX;
}
	 h = (int) Math.pow(h, 2);

	 w = (int) Math.pow(w, 2);
	
	
	int c = h + w;
	loc = (int) Math.pow(c, 2);
	return loc;
}



}
