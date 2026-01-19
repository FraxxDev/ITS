package esempioAnagrafica;

public class persona {
    private String nome;
    private String cognome;
    private int eta;

    public persona(String nome, String cognome, int eta)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    public void setNome(String nuovoNome)
    {
        nome = nuovoNome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setCognome(String nuovoCognome)
    {
        cognome = nuovoCognome;
    }

    public String getCognome()
    {
        return cognome;
    }

    public void setEta(int nuovaEta)
    {
        eta = nuovaEta;
    }

    public int getEta()
    {
        return eta;
    }

    public void stampaInformazioni() {
        System.out.println("Nome: " + nome + "\nCognome: " + cognome + "\nEta': " + eta + ".");
    }
}