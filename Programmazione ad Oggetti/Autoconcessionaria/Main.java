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

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Veicolo[] archivio = new Veicolo[10]; // Array di dimensione fissa

        // Creazione di oggetti Conducente
        Conducente c1 = new Conducente("Mario", "Rossi", 35);
        Conducente c2 = new Conducente("Luisa", "Bianchi", 28);
        Conducente c3 = new Conducente("Paolo", "Verdi", 42);

        // Inserimento di 6 oggetti Veicolo nell'array, con posizioni null in mezzo
        archivio[0] = new Veicolo("Fiat", "Panda", "AB123CD", 5, "Rosso", 1200, 12500.00, c1);
        archivio[1] = new Veicolo("Fiat", "Tipo", "FG456HI", 5, "Bianco", 1600, 18000.00, c1);
        archivio[2] = new Veicolo("Ford", "Fiesta", "EF456GH", 5, "Blu", 1400, 15000.00, c2);
        archivio[3] = new Veicolo("Ford", "Focus", "JK123LM", 5, "Nero", 1800, 20000.00, c2);
        archivio[4] = new Veicolo("Volkswagen", "Golf", "IL789MN", 5, "Nero", 1600, 22000.00, c3);
        archivio[5] = new Veicolo("Volkswagen", "Polo", "NO987PQ", 5, "Grigio", 1000, 16000.00, c3);

        int scelta;
        boolean running = true;

        while (running) {
            System.out.println("\n--- Menu Autoconcessionaria ---");
            System.out.println("1. Visualizza tutte le auto");
            System.out.println("2. Conta auto totali e per marca");
            System.out.println("3. Analisi prezzi (media, max, min)");
            System.out.println("4. Cerca auto per targa");
            System.out.println("5. Visualizza auto per conducente");
            System.out.println("6. Modifica dati auto (prezzo, colore)");
            System.out.println("7. Ordina archivio per prezzo");
            System.out.println("0. Esci");
            System.out.print("Scegli un'opzione: ");
            scelta = input.nextInt();
            input.nextLine(); // Consuma il newline

            switch (scelta) {
                case 1: // Visualizza tutte le auto
                    System.out.println("\n--- Auto presenti nell'archivio ---");
                    for (int i = 0; i < archivio.length; i++) {
                        if (archivio[i] != null) {
                            archivio[i].stampaScheda();
                            System.out.println("--------------------");
                        }
                    }
                    break;

                case 2: // Conta auto totali e per marca
                    int contatore = 0;
                    for (int i = 0; i < archivio.length; i++) {
                        if (archivio[i] != null) {
                            contatore++;
                        }
                    }
                    System.out.println("\nNumero totale di auto inserite: " + contatore);

                    System.out.print("Inserisci la marca da cercare: ");
                    String cercaMarca = input.nextLine();
                    int contatoreMarca = 0;
                    for (int i = 0; i < archivio.length; i++) {
                        if (archivio[i] != null && archivio[i].getMarca().equalsIgnoreCase(cercaMarca)) {
                            contatoreMarca++;
                        }
                    }
                    System.out.println("Numero di auto della marca '" + cercaMarca + "': " + contatoreMarca);
                    break;

                case 3: // Analisi prezzi
                    double somma = 0.0;
                    double prezzoAlto = 0.0;
                    Veicolo veicoloAlto = null;
                    double prezzoBasso = Double.MAX_VALUE;
                    Veicolo veicoloBasso = null;
                    int autoPresenti = 0;

                    for (int i = 0; i < archivio.length; i++) {
                        if (archivio[i] != null) {
                            somma += archivio[i].getPrezzo();
                            autoPresenti++;

                            if (archivio[i].getPrezzo() > prezzoAlto) {
                                prezzoAlto = archivio[i].getPrezzo();
                                veicoloAlto = archivio[i];
                            }

                            if (archivio[i].getPrezzo() < prezzoBasso) {
                                prezzoBasso = archivio[i].getPrezzo();
                                veicoloBasso = archivio[i];
                            }
                        }
                    }

                    if (autoPresenti > 0) {
                        double media = somma / autoPresenti;
                        System.out.println("\nPrezzo medio delle auto: " + String.format("%.2f", media) + " euro");
                        System.out.println("Auto con prezzo più alto:");
                        System.out.println("  Targa: " + veicoloAlto.getTarga() + ", Marca: " + veicoloAlto.getMarca() + ", Modello: " + veicoloAlto.getModello() + ", Prezzo: " + String.format("%.2f", veicoloAlto.getPrezzo()) + " euro");
                        System.out.println("Auto con prezzo più basso:");
                        System.out.println("  Targa: " + veicoloBasso.getTarga() + ", Marca: " + veicoloBasso.getMarca() + ", Modello: " + veicoloBasso.getModello() + ", Prezzo: " + String.format("%.2f", veicoloBasso.getPrezzo()) + " euro");
                    } else {
                        System.out.println("Nessuna auto presente per l'analisi dei prezzi.");
                    }
                    break;

                case 4: // Cerca auto per targa
                    System.out.print("Inserisci la targa da cercare: ");
                    String cercaTarga = input.nextLine();
                    Veicolo targaTrovata = null;
                    for (int i = 0; i < archivio.length; i++) {
                        if (archivio[i] != null && archivio[i].getTarga().equalsIgnoreCase(cercaTarga)) {
                            targaTrovata = archivio[i];
                            break;
                        }
                    }
                    if (targaTrovata != null) {
                        System.out.println("\nAuto trovata:");
                        targaTrovata.stampaScheda();
                    } else {
                        System.out.println("Nessuna auto trovata con targa: " + cercaTarga);
                    }
                    break;

                case 5: // Visualizza auto per conducente
                    System.out.print("Inserisci il nome del conducente da cercare: ");
                    String cercaPerConducente = input.nextLine();
                    boolean trovatoConducente = false;
                    System.out.println("\nAuto associate al conducente '" + cercaPerConducente + "':");
                    for (int i = 0; i < archivio.length; i++) {
                        if (archivio[i] != null && archivio[i].getConducente() != null && archivio[i].getConducente().getNome().equalsIgnoreCase(cercaPerConducente)) {
                            archivio[i].stampaScheda();
                            System.out.println("--------------------");
                            trovatoConducente = true;
                        }
                    }
                    if (!trovatoConducente) {
                        System.out.println("Nessuna auto trovata per il conducente '" + cercaPerConducente + "'.");
                    }
                    break;

                case 6: // Modifica dati auto
                    System.out.print("Inserisci la targa dell'auto da modificare: ");
                    String targaModifica = input.nextLine();
                    Veicolo autoDaModificare = null;
                    for (int i = 0; i < archivio.length; i++) {
                        if (archivio[i] != null && archivio[i].getTarga().equalsIgnoreCase(targaModifica)) {
                            autoDaModificare = archivio[i];
                            break;
                        }
                    }

                    if (autoDaModificare != null) {
                        System.out.println("\nAuto selezionata per la modifica:");
                        autoDaModificare.stampaScheda();

                        System.out.print("Inserisci il nuovo colore (lascia vuoto per non modificare): ");
                        String nuovoColore = input.nextLine();
                        if (!nuovoColore.isEmpty()) {
                            autoDaModificare.setColore(nuovoColore);
                        }

                        System.out.print("Inserisci il nuovo prezzo (lascia 0 per non modificare): ");
                        double nuovoPrezzo = input.nextDouble();
                        input.nextLine(); // Consuma il newline
                        if (nuovoPrezzo > 0) {
                            autoDaModificare.setPrezzo(nuovoPrezzo);
                        } else if (nuovoPrezzo < 0) {
                            System.out.println("Il prezzo non può essere negativo. Prezzo non modificato.");
                        }

                        System.out.println("\nAuto modificata con successo:");
                        autoDaModificare.stampaScheda();
                    } else {
                        System.out.println("Nessuna auto trovata con targa: " + targaModifica);
                    }
                    break;

                case 7: // Ordina archivio per prezzo
                    Veicolo temp;
                    for (int i = 0; i < archivio.length - 1; i++) {
                        for (int j = 0; j < archivio.length - 1 - i; j++) {
                            // Sposta i null alla fine
                            if (archivio[j] == null && archivio[j + 1] != null) {
                                temp = archivio[j];
                                archivio[j] = archivio[j + 1];
                                archivio[j + 1] = temp;
                            }
                            // Ordina per prezzo se entrambi non sono null
                            else if (archivio[j] != null && archivio[j + 1] != null) {
                                if (archivio[j].getPrezzo() > archivio[j + 1].getPrezzo()) {
                                    temp = archivio[j];
                                    archivio[j] = archivio[j + 1];
                                    archivio[j + 1] = temp;
                                }
                            }
                        }
                    }
                    System.out.println("\nArchivio ordinato per prezzo crescente:");
                    for (int i = 0; i < archivio.length; i++) {
                        if (archivio[i] != null) {
                            System.out.println("  Marca: " + archivio[i].getMarca() + ", Modello: " + archivio[i].getModello() + ", Prezzo: " + String.format("%.2f", archivio[i].getPrezzo()) + " euro");
                        }
                    }
                    break;

                case 0: // Esci
                    running = false;
                    System.out.println("Uscita dal programma. Arrivederci!");
                    break;

                default:
                    System.out.println("Opzione non valida. Riprova.");
                    break;
            }
        }

        input.close(); // Chiude lo scanner
    }
}
