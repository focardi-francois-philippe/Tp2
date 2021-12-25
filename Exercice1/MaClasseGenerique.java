package Exercice1;
public class MaClasseGenerique<T,E>{
    private T attribut1;
    private E attribut2;
    public MaClasseGenerique(T attribut1,E attribut2)
    {
        this.attribut1 = attribut1;
        this.attribut2 = attribut2;
    }

    /**
     * @return the attribut1
     */
    public T getAttribut1() {
        return attribut1;
    }
    /**
     * @return the attribut2
     */
    public E getAttribut2() {
        return attribut2;
    }
    /**
     * @param attribut1 the attribut1 to set
     */
    public void setAttribut1(T attribut1) {
        this.attribut1 = attribut1;
    }
    /**
     * @param attribut2 the attribut2 to set
     */
    public void setAttribut2(E attribut2) {
        this.attribut2 = attribut2;
    }


}
