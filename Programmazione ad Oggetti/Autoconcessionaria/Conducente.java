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

    public void stampaConducente()
    {
        System.out.println("Nome: " + nome + "\n"
                         + "Cognome: " + cognome + "\n"
                         + "Età: " + eta);
    }
}
