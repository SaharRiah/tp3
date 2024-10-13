package tp3;

public class Dict {
	public int nbMots;
	public MotDico[] dico;
	public String nom;
	public Dict(String nom,int n) {
		this.nom=nom;
		this.dico=new MotDico[n];
		this.nbMots=0;
		
	}
	public void ajouterMot (MotDico m) {
		if(nbMots<dico.length) {
			dico[nbMots]= m;
			nbMots++;
		}
		else
			System.out.println("taille de dico plein");
	}
	public void suppMot(String ch) {
	    if (nbMots == 0) {
	        System.out.println("Dictionnaire vide");
	        return;
	    }
	    int indexch = chercherMot(ch);
	    if (indexch == -1) {
	        System.out.println("Mot non trouvé : " + ch);
	        return;
	    }
	    for (int i = indexch; i < nbMots - 1; i++) {
	        dico[i] = dico[i + 1];
	    }
	    
	    // Effacer le dernier élément du tableau
	    nbMots--;
	    
	    System.out.println("Mot supprimé : " + ch);
	}
    public int chercherMot(String ch) {
        for (int i = 0; i < nbMots; i++) {
            if (dico[i].getMot().equals(ch)) {
                return i;
            }
        }
        return -1; // Mot non trouvé
    }
    public void listerDico() {
        System.out.println("Liste des mots dans le dictionnaire " + nom + ":");
        for (int i = 0; i < nbMots; i++) {
            System.out.println(dico[i].getMot() + ": " + dico[i].getDef());
        }
    }
    public int nbSynonymes(MotDico m) {
        int cmpt = 0;
        for (int i = 0; i < nbMots; i++) {
            if (m.synonyme(dico[i])) {
                cmpt++;
            }
        }
        return cmpt;
    }
}
	
	


