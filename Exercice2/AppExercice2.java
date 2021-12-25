package Exercice2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;

import java.util.Map;
import java.util.Scanner;

public class AppExercice2{
    
    public static void main(String[] args) {
        if(args.length==2)
        {
            try{
                File file = new File(args[0]);   
                Scanner scan = new Scanner(file);
                Map<Integer,ArrayList<String>> maMap = new HashMap<>();
                ArrayList<String> dictionnaire = new ArrayList<String>();
                ArrayList<String> anagramme = new ArrayList<String>();
                String mot = null;
                char[] motChar =null;
                char[] motAcomparer = null;
                int key = 0;
                //Lecture du fichier complet et stocker dans un arrayList
                while(scan.hasNext())
                    dictionnaire.add(scan.next());
                scan.close();
                while(dictionnaire.size()>0)//Tant que la liste n'est pas vide suppression de l'element des qu'il est comparé
                {
                    mot = dictionnaire.get(0);
                    motChar = mot.toCharArray(); //Transtype un String en tableau de Char Utile pour faciliter l'ordre alphabetique
                    anagramme.add(mot);
                    dictionnaire.remove(0);//Une fois le mot utiliser supprimer de la liste
                    for (String element : dictionnaire) {
                        if(mot!=element && (mot.length() == element.length()))
                        {
                            motAcomparer = element.toCharArray(); //Transtype un String en tableau de Char Utile pour faciliter l'ordre alphabetique
                            Arrays.sort(motChar); //Met dans l'odre alphabetique
                            Arrays.sort(motAcomparer);
                            if(Arrays.equals(motChar,motAcomparer))
                            {
                                anagramme.add(element);
                            }
                        }
                    }try {
                        if(anagramme.size()>=Integer.parseInt(args[1]))
                        {
                                
                                maMap.put(key,(ArrayList<String>)anagramme.clone());
                                key++;
                        }
                        anagramme.clear();
                    } catch (NumberFormatException e) {
                        e = new NumberFormatException("Le deuxieme argument est different d'un nombre");
                        e.getMessage();
                    }
                }
                for (Map.Entry<Integer,ArrayList<String>> m : maMap.entrySet()) {
                    System.out.println(String.valueOf(m.getValue().size())+ ": = "+ m.getValue());
                }
            }catch(FileNotFoundException e)
            {
                e = new FileNotFoundException("Nom du fichier innexistant");
                System.out.println(e.getMessage());
            }
        }
        else
        {
            System.out.println("Nombre d'argument différent  de 2");
        }
        
    }
}
