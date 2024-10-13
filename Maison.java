package tp3;

public class Maison {
	private String type;
	private String adr;
	private int nbchambre;
	private float surface;
	public Maison (String t,String a, int n, float s) {
		this.type=t;
		this.adr=a;
		this.nbchambre=n;
		this.surface=s;
	}
	public Maison (String t,String a, int n) {
		this.type=t;
		this.adr=a;
		this.nbchambre=n;
	}
	public void setSurface(float s) {
		this.surface=s;
	}
	public void calculPrix(float pmc) {
		float prix = surface*pmc;
		 System.out.println("le prix ="+prix);
	}
	public void calculPrix() {
		float prix = surface*2200;
		 System.out.println("le prix ="+prix);
	}
	public String toChaine() {
		return "Un(e) "+type+" de "+surface+"m² avec "+nbchambre+" chambres.";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Maison m1 = new Maison("duplex","Tunis",4,210);
	     Maison m2 = new Maison("villa","Nabeul",5);
	     System.out.println(m1.toChaine());
	     System.out.println(m2.toChaine());
	     m2.setSurface(230);
	     m1.calculPrix(100);
	     m2.calculPrix(200);
	     

	}
	
	
	

}
