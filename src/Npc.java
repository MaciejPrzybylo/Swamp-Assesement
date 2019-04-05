
public abstract class Npc {
private int npcHp;

abstract public void  say ();

public Npc (int hp) {
	this.setNpcHp(hp);
}

public int getNpcHp() {
	return npcHp;
}

public void setNpcHp(int npcHp) {
	this.npcHp = npcHp;
}

}
