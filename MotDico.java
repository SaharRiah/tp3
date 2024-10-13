package tp3;
public class MotDico {
	public int num;
	public String mot;
	public String def;
	private static int compteur = 0;
	public MotDico(){
		compteur++;
		this.num=compteur;
		this.mot=" ";
		this.def=" ";
	}
	public String getMot() {
		return mot;
	}
	public String getDef() {
		return def;
	}
	void setDef(String s) {
		this.def=s;
	}
	void setMot(String s) {
		this.mot=s;
	}
	public boolean synonyme(MotDico m) {
		return m.def.equals(this.def);
	}
	
	

}
