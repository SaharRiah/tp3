package tp3;

public class Compte {
	public int num;
	private float sold;
	private static int compteur = 0;
	public Compte() {
		compteur ++;
		this.num=compteur;
		sold=0;
	}
	public void deposer(float m) {
		this.sold += m;
	}
	public void retirer(float m) {
		this.sold -= m;
	}
	public float avoirSolde() {
		return this.sold;
		
	}
	 public void transferer(float m, Compte c) {
	        if (m > 0 ) {
	            this.retirer(m);  
	            c.deposer(m);  
	        } else if (m > this.sold) {
	            System.out.println("Solde insuffisant pour effectuer le transfert.");
	        } else {
	            System.out.println("Le montant à transférer doit être positif.");
	        }
	    }
	
	
	

}
