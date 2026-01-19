/*
    Creare un sistema di gestione di una autoconcessionaria su un piccolo archivio di veicoli.
    I veicoli sono caratterizzati da:
        - Targa
        - Marca
        - Modello
        - Numero di porte
        - Colore
        - Cilindrata
        - Prezzo
        - Conducente (Nome e Cognome)

    Devono essere forniti tutti i metodi get/set.

    Opzionale: viene create anche la classe Conducente (da fare in un altro file) che ha come caratteristiche:
        - Nome
        - Cognome
        - Età
*/

package Autoconcessionaria;

public class Conducente
{
    private String nome;
    private String cognome;
    private int eta;
    
    public Conducente(String nome, String cognome, int eta)
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
}
