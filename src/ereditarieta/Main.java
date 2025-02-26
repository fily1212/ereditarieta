package ereditarieta;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Daniele", "Saraceno");
        System.out.println(p);
        Studente s = new Studente("Giorgia", "Riva", "4L");
        System.out.println(s);
        s.setCodiceFiscale("RVIGRG....");
        System.out.println(s.getCodiceFiscale());
        Persona p2 = s;
        Persona p3 = new Studente("Orlando", "Simone", "4L");
        System.out.println(p3);
        //p3.studia();
        Studente s2 = (Studente)p3;
        s2.studia();

    }
}
