package ereditarieta;

public class Studente extends Persona{

    public Studente(String nome, String cognome, String classe) {
        super(nome, cognome);
        this.classe = classe;
    }

    private String classe;

    @Override
    public String toString() {
        return super.toString()+" "+classe;
    }

    public void studia(){
        System.out.println("sto studiando");
    }
}
