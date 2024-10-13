package tp3;

public class Banque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     Compte co1 = new Compte();
	     Compte co2 = new Compte();
	     System.out.println("Num du compte co1 : " + co1.num + ", Solde : " + co1.avoirSolde() + " DT");
	     System.out.println("Num du compte co2 : " + co2.num + ", Solde : " + co2.avoirSolde() + " DT");
	     co1.deposer(1200);
         co2.deposer(500);  
         System.out.println("Après dépôt :");
         System.out.println("Solde du compte co1 : " + co1.avoirSolde() + " DT");
         System.out.println("Solde du compte co2 : " + co2.avoirSolde() + " DT");
         co2.transferer(700, co1);
	     System.out.println("Après transfert :");
	     System.out.println("Solde du compte co1 : " + co1.avoirSolde() + " DT");
	     System.out.println("Solde du compte co2 : " + co2.avoirSolde() + " DT");
	        if (co1.avoirSolde() < 0) {
	            System.out.println("Le compte co1 est en rouge avec un solde de " + co1.avoirSolde() + " DT");
	        }
	        if (co2.avoirSolde() < 0) {
	            System.out.println("Le compte co2 est en rouge avec un solde de " + co2.avoirSolde() + " DT");
	        }

	}

}
