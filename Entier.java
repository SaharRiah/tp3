package tp3;

public class Entier {
	private int n;
	
	public Entier(int n) {
		this.n = n;
	}
	public static int factoriel (int n) {
		if(n==0) {
			return 1;
		}
		else
			return n*factoriel(n-1);
		
	}
	public static void absolu (int n) {
		if(n<0) {
			System.out.println("|"+n+"|="+n*(-1));	
	}
		else
			System.out.println(n);
			
	}
	public static void comparer (int e1, int e2) {
		if(e1<e2) {
			System.out.println(e1+"inférieur à "+e2);	
	}
		else 
			System.out.println(e1+"supérieur à "+e2);
	}
	public static void premier (int n) {
		if(n<=1) {
			System.out.println(n+"n'est un nombre premier");	
	}
		int d=0;
		for(int i=2 ; i < (n/2) ; i++) {
			if(n%i== 0) 
			  d++;
		}
			if(d==0) {
				System.out.println(n+"est un  nombre premier ");
			
				
			}
			else
			
				System.out.println(n+"n'est pas un nombre premier ");
		
	}
	

}
