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

public class Veicolo
{
    private String marca;
    private String modello;
    private String targa;
    private int nPorte;
    private String colore;
    private int cilindrata;
    private double prezzo;
    private Conducente conducente;

    public Veicolo(String marca, String modello, String targa, int nPorte, String colore, int cilindrata, double prezzo, Conducente conducente)
    {
        this.marca = marca;
        this.modello = modello;
        this.targa = targa;
        this.nPorte = nPorte;
        this.colore = colore;
        this.cilindrata = cilindrata;
        this.prezzo = prezzo;
        this.conducente = conducente;
    }

    public void setMarca(String nuovaMarca)
    {
        marca = nuovaMarca;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setModello(String nuovaModello)
    {
        modello = nuovaModello;
    }

    public String getModello()
    {
        return modello;
    }

    public void setTarga(String nuovaTarga)
    {
        targa = nuovaTarga;
    }

    public String getTarga()
    {
        return targa;
    }

    public void setNporte(int nuoveNPorte)
    {
        nPorte = nuoveNPorte;
    }

    public int getNporte()
    {
        return nPorte;
    }

    public void setColore(String nuovoColore)
    {
        colore = nuovoColore;
    }

    public String getColore()
    {
        return colore;
    
    }

    public void setCilindrata(int nuovaCilindrata)
    {
        cilindrata = nuovaCilindrata;
    }

    public int getCilindrata()
    {
        return cilindrata;
    }

    public void setPrezzo(double nuovoPrezzo)
    {
        prezzo = nuovoPrezzo;
    }

    public double getPrezzo()
    {
        return prezzo;
    }

    public void setConducente(Conducente nuovoConducente)
    {
        conducente = nuovoConducente;
    }
    
    public Conducente getConducente()
    {
        return conducente;
    }

    @Override
    public String toString()
    {
        return "Marca: " + marca + "\n"
 + "Modello: " + modello + "\n"
 + "Targa: " + targa + "\n"
 + "Numero di Porte: " + nPorte + "\n"
 + "Colore: " + colore + "\n"
 + "Cilindrata: " + cilindrata + "\n"
 + "Prezzo: " + String.format("%.2f", prezzo) + " euro\n"
 + "Conducente: " + (conducente != null ? conducente.getNome() + " " + conducente.getCognome() : "Nessuno");
    }
}
