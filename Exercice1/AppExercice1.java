package Exercice1;
import java.time.LocalDate;

/**
 * App
 */
public class AppExercice1 {

    public static void main(String[] args) {
        //TEST MaClasseGenerique
        MaClasseGenerique<Integer,String> hMaClasseGenerique = new MaClasseGenerique<Integer,String>(5,"Francois");
        MaClasseGenerique<Integer,LocalDate> hMaClasseGenerique2 = new MaClasseGenerique<Integer,LocalDate>(5,LocalDate.of(2021,12,11));

        System.out.println("hMaClasseGenerique1");
        System.out.println(hMaClasseGenerique.getAttribut1());
        System.out.println(hMaClasseGenerique.getAttribut2());

        System.out.println("hMaClasseGenerique2");
        System.out.println(hMaClasseGenerique2.getAttribut1());
        System.out.println(hMaClasseGenerique2.getAttribut2());


        hMaClasseGenerique.setAttribut1(80);
        hMaClasseGenerique.setAttribut2("aaaaaaa");

        hMaClasseGenerique.setAttribut1(12);
        hMaClasseGenerique2.setAttribut2(LocalDate.of(2001, 5, 28));

        System.out.println("hMaClasseGenerique1");
        System.out.println(hMaClasseGenerique.getAttribut1());
        System.out.println(hMaClasseGenerique.getAttribut2());

        System.out.println("hMaClasseGenerique2");
        System.out.println(hMaClasseGenerique2.getAttribut1());
        System.out.println(hMaClasseGenerique2.getAttribut2());

        //FIN TEST MaClasseGenerique
    }
}