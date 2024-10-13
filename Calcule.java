package tp3;

public class Calcule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=Entier.factoriel(5);
		System.out.println("fact("+5+")="+x);
		Entier.absolu(-20);
		Entier.comparer(2, 5);
		Entier.premier(6);
		Entier.premier(7);
		Entier e = new Entier(10);
		e.premier(10);
	}

}
