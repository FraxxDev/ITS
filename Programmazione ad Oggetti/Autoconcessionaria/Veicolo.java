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

    

    A partire dalla classe "Auto", organizzare i veicoli della concessionaria all’interno di un array di dimensione fissa (ad esempio 10 elementi).
    L’array rappresenta l’archivio delle auto disponibili.
    Non tutte le posizioni dell’array devono essere necessariamente occupate (le posizioni non utilizzate possono contenere "null"; no ArrayList...)

    Visualizzazione e conteggio
    Scrivere una procedura che permetta di stampare tutte le auto presenti nell’archivio, ignorando le posizioni vuote.
    A partire dall’archivio, calcolare e stampare:

        il numero totale di auto inserite
        il numero di auto per marca (scegliere alcune marche di esempio da considerare)

    Analisi dei prezzi
    Utilizzando una scansione dell’array:

        calcolare il prezzo medio delle auto presenti
        individuare e stampare l’auto con il prezzo più alto
        individuare e stampare l’auto con il prezzo più basso
        Per ciascuna auto individuata è sufficiente stampare targa, marca, modello e prezzo.

    Ricerca per scansione
    Implementare una ricerca tramite scansione dell’array che consenta di:

        cercare un’auto a partire dalla targa
        se l’auto viene trovata, stampare la scheda completa
        se non viene trovata, visualizzare un messaggio adeguato

    Implementare inoltre una ricerca che permetta di:
    visualizzare tutte le auto associate a uno stesso conducente

    Modifica dei dati
    Realizzare una funzionalità che consenta di modificare i dati di un’auto a partire dalla targa:

        aggiornamento del prezzo
        aggiornamento del colore

    Le modifiche devono avvenire esclusivamente tramite i metodi setter.

    Aggiungere controlli minimi di validità, ad esempio:

        il prezzo non può essere negativo
        il numero di porte deve essere maggiore di zero
        la cilindrata deve essere maggiore di zero

    Ordinamento dell’archivio
    Ordinare le auto presenti nell’archivio in base al prezzo crescente, utilizzando un algoritmo semplice (ad esempio bubble sort).

        L’ordinamento deve considerare solo le posizioni effettivamente occupate dell’array.
        Al termine dell’ordinamento, ristampare l’archivio per verificarne il corretto funzionamento.


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
        if (nuoveNPorte > 0) {
 nPorte = nuoveNPorte;
        } else {
 System.out.println("Errore: Il numero di porte deve essere maggiore di zero.");
        }

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
        if (nuovaCilindrata > 0) {
 cilindrata = nuovaCilindrata;
        } else {
 System.out.println("Errore: La cilindrata deve essere maggiore di zero.");
        }
    }

    public int getCilindrata()
    {
        return cilindrata;
    }

    public void setPrezzo(double nuovoPrezzo)
    {
        if (nuovoPrezzo > 0) {
 prezzo = nuovoPrezzo;
        } else {
 System.out.println("Errore: Il prezzo non può essere negativo.");
        }
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

    public void stampaScheda()
    {
 System.out.println("Marca: " + marca + "\n"
 + "Modello: " + modello + "\n"
 + "Targa: " + targa + "\n"
 + "Numero di Porte: " + nPorte + "\n"
 + "Colore: " + colore + "\n"
 + "Cilindrata: " + cilindrata + "\n"
 + "Prezzo: " + String.format("%.2f", prezzo) + " euro\n"
 + "Conducente: " + (conducente != null ? conducente.getNome() + " " + conducente.getCognome() : "Nessuno"));
    }
}
