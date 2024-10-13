package tp3;

public class Maind {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//.1
		 Dict d1 = new Dict("Larousse", 10);
		//.2
	        MotDico mot1 = new MotDico();
	        mot1.setMot("rapide");
	        mot1.setDef("Qui va vite");

	        MotDico mot2 = new MotDico();
	        mot2.setMot("lent");
	        mot2.setDef("Qui va lentement");

	        MotDico mot3 = new MotDico();
	        mot3.setMot("vite");
	        mot3.setDef("D'une manière rapide");

	        d1.ajouterMot(mot1);
	        d1.ajouterMot(mot2);
	        d1.ajouterMot(mot3);
	        
	        d1.listerDico();
	        //.3

	        String motCherche1 = "rapideur";
	        int index1 = d1.chercherMot(motCherche1);
	        if (index1 == -1) {
	            System.out.println("\nMot non trouvé : " + motCherche1);
	        } else {
	            System.out.println("\nMot trouvé : " + motCherche1 + " - " + d1.dico[index1].getDef());
	        }

	        String motCherche2 = "vite";
	        int index2 = d1.chercherMot(motCherche2);
	        if (index2 != -1) {
	            System.out.println("\nMot trouvé : " + motCherche2 + " - " + d1.dico[index2].getDef());
	        }
	        System.out.println("\nNombre de synonymes de 'rapide' : " + d1.nbSynonymes(mot1));
	        d1.suppMot(motCherche2);
	        d1.listerDico();

	}

}
