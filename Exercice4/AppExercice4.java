package Exercice4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class AppExercice4 {
    
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        List<String>listArgs = new ArrayList<String>(Arrays.asList(args));
        String identifiant = listArgs.remove(0);
        System.out.println(identifiant);
        final Comparator<String> ORDREMILITAIRE = new Comparator<String>() {
            
            public int compare(String s1, String s2)
            {
                int resultat = -1;
                if (s1.length()>s2.length())
                {
                    resultat =  1;
                }
                else if(s1.length()==s2.length() && s1.compareToIgnoreCase(s2)>0)
                {
                    resultat = 0;
                }
                return resultat;
            }
        };

        System.out.println("AFFICHAGE DES ARGUMENTS SANS TRI:");
        for (String element : listArgs) {
            System.out.println(element);
        }
        if(identifiant.equals("Comparaison"))
        {
            AppExercice4.triLexico(listArgs);
            AppExercice4.triMilitaire(listArgs,ORDREMILITAIRE);
            AppExercice4.triInverseLexico(listArgs);
        }
        else if(identifiant.equals("Lexico") || identifiant.equals("lexico"))
        {
            AppExercice4.triLexico(listArgs);
        }
        else if(identifiant.equals("Militaire") || identifiant.equals("militaire"))
        {
            AppExercice4.triMilitaire(listArgs, ORDREMILITAIRE);
        }
        else if(identifiant.equals("InverseL") || identifiant.equals("inverseL"))
        {
            AppExercice4.triInverseLexico(listArgs);
        }
        else
        {
            System.out.println("Le premier argument n'est pas un identifiant de tri exemple <Comparaison> retourne tous les tris.Sinon <Lexico> simplement le tri lexicographique,<InverseL> son inverse et <Militaire> le tri militaire");
        }
    }
    
    /** Tri en ordre lexicographique
     * @param listArgs
     */
    private static void triLexico(List<String> listArgs)
    {
        Collections.sort(listArgs);
        
        System.out.println("Tri Lexico:");
        for (String element : listArgs) {
            System.out.println(element);
        }
        System.out.println("FIN Tri Lexico:");
    }
    
    /** 
     * Tri en ordre Militaire
     * @param listArgs
     * @param ORDREMILITAIRE
     */
    private static void triMilitaire(List<String> listArgs,Comparator<String> ORDREMILITAIRE)
    {
            Collections.sort(listArgs,ORDREMILITAIRE);
            System.out.println("Tri Milittaire:");
            for (String element : listArgs) {
                System.out.println(element);
            }
            System.out.println("FIN Tri Milittaire:");
    }
    
    /** 
     * Tri en inverse de l'ordre lexicographique 
     * @param listArgs
     */
    private static void triInverseLexico(List<String> listArgs)
    {
        AppExercice4.triLexico(listArgs);
        Collections.reverse(listArgs);
        System.out.println("Tri Inverse Lexico:");
        for (String element : listArgs) {
            System.out.println(element);
        }
        System.out.println("FIN Tri Inverse Lexico");
    }
}
