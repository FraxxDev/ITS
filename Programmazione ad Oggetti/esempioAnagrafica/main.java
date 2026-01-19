package esempioAnagrafica;

public class main {
    public static void main(String[] args) {
        // Creazione di un oggetto persona
        persona persona1 = new persona("GiovanMario", "Rossi", 30);
        persona persona2 = new persona("Luca", "Bianchi", 25);
        persona persona3 = new persona("Giovanni", "Verdi", 21);

        // Stampa delle informazioni della persona
        System.out.println(persona1.getNome());
        persona1.setNome("Lorenzi");
        System.out.println(persona1.getNome());

        System.out.println(persona2.getCognome());
    }
}
