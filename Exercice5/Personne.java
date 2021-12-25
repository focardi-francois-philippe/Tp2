package Exercice5;

import java.util.Comparator;

public class Personne implements Comparable<Personne>,Comparator<Personne>{
    
    private int age;
    private String nom;
    private String prenom;
    
    public Personne(int age,String nom,String prenom)
    {
        this.age = age;
        this.nom = nom;
        this.prenom = prenom;
    }

    
    /** 
     * Compare d'abord l'age de la personne si age egal on appelle compareTo pour comparer les noms et prenoms des personnes
     * @param p personna a comparer 
     * @return int 1 si la reference de l'objet est plus agé que @p -1 si plus jeune si egal comparaison des noms et prenoms
     */
    @Override
    
    public int compareTo(Personne p) {
        int resultat = 0;
        if(this.age>p.age)
            resultat = 1;
        else if (this.age<p.age)
            resultat = -1;
        else
        {
            resultat = compare(this,p);
        }
    return resultat;
    }
    
    /** 
     * Compare nom Lexicalement  des deux personnes si nom identique comparaison des prenoms
     * @param p1 personne a comparer
     * @param p2 personne a comparer
     * @return int 1 si p1.nom > p2.nom  -1 si inverse ou si prenom de @p1 inferieur a prenom de @p2 0 si prenom et nom egaux
     */
    @Override
    public int compare(Personne p1, Personne p2) {
        int resultat = 0;
        if(p1.nom.compareToIgnoreCase(p2.nom)>0)
        {
            resultat = 1;
        }
        else if (p1.nom.compareToIgnoreCase(p2.nom)<0)
        {
            resultat = -1;
        }
        else 
        {
            if(p1.prenom.compareToIgnoreCase(p2.prenom)<0)
            {
                resultat = -1;
            }
        }
        return resultat;
            
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Nom: "+ nom +" Prenom: "+ prenom +" Age: " + age;
    }
}

