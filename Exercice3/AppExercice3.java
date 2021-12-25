package Exercice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class AppExercice3 {
    public static void main(String[] args) {
        System.out.println("Premiere Version avec un arrayList deuxieme avec un TreeSet");
        Scanner scan = new Scanner(System.in);
        final int NOMBREMAX = 1001;
        Random nombreAleatoire = new Random();
        int i = 0;
        boolean finProgramme = true;
        int version = -1;
            try {
                int nombreElementChoisis = Integer.parseInt(args[0]);
                if(nombreElementChoisis<0)
                    nombreElementChoisis = nombreElementChoisis*-1;
                while(finProgramme)
                {
                    finProgramme = false;
                    System.out.println("Quel version souhaitez vous utiliser 1 ou 2?");
                    version = scan.nextInt();
                    if (version ==1)
                    {
                        ArrayList<Integer> listeDeNombres = new ArrayList<Integer>();
                        while(i < nombreElementChoisis)
                        {
                            listeDeNombres.add(nombreAleatoire.nextInt(NOMBREMAX));
                            i++;
                        }
                        System.out.print(listeDeNombres.get(0));
                        System.out.println("Liste pas triées");
                        for (Integer nombre : listeDeNombres) {
                            System.out.println(nombre);
                        }
                        Collections.sort(listeDeNombres);
                        System.out.println("Liste triées");
                        for (Integer nombre : listeDeNombres) {
                            System.out.println(nombre);
                        }
                    }
                    else if(version ==2)
                    {
                        System.out.println("Version n°2 avec un TreeSet");
                        TreeSet<Integer> tree = new TreeSet<Integer>();
                        while (i < nombreElementChoisis)
                        {
                            tree.add(nombreAleatoire.nextInt(NOMBREMAX));
                            i++;
                        }
                        for (Integer element : tree) {
                            System.out.println(element);
                        }
                    }
                    else
                    {
                        System.err.println("Le nombre saisit ne correspond a aucune version");
                        finProgramme = true;
                    }
                    
                }
            } catch (NumberFormatException e) {
                //TODO: handle exception
                scan.close();
                throw new NumberFormatException("L'argument du programme doit etre un nombre entier");
                
            }
            catch (InputMismatchException e) {
                //TODO: handle exception
                scan.close();
                throw new NumberFormatException("La valeur saisit n'est pas bon taper 1 pour la premiere version ou 2 pour la seconde");
            }
            scan.close();
    }
    
}
