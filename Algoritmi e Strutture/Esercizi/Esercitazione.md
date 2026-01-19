```python
INIZIO
# CODICE DI HOXHA ENRICO, HASA STIVEN E CESARETTI STEFANO

	# dichiarazione variabili, liste e coda
	# ipotizziamo che l'ID sia un codice fiscale univoco
	idPaziente <- 0
	nome <- ""
	codiceColore <- ""
	listaId <- Lista Vuota
	listaNome <- Lista Vuota
	listaCodiceColore <- Lista Vuota
	listaStato <- Lista Vuota
	listaStorico <- Lista Vuota
	queueAttesa <- Queue Vuota
	
	# inseriamo i pazienti aggiungendo le proprietà nelle corrispettive liste
	n <- 0
	LEGGI n
	PER i da 1 a n
		LEGGI idPaziente
		AGGIUNGI(listaId, idPaziente)
		# ipotizziamo che ogni paziente in qualsiasi stato esso sia venga inserito in un database, quindi sempre a prescindere dallo stato
		AGGIUNGI(listaStorico, idPaziente)
		
		LEGGI nome
		AGGIUNGI(listaNome, nome)
		# ipotizziamo che il codice colore venga scelto tra le tre opzioni, per ora un input qualsiasi per semplificare
		LEGGI codiceColore
		AGGIUNGI(listaCodiceColore, codiceColore)
		
		AGGIUNGI(listaStato, "attesa")
	
	# riordiniamo le liste per codice colore, inserendo prima il rosso, poi il giallo e in fine il verde. Questo verrebbe fatto con un for innestato e delle variabili di appoggio che controllano la priorità e riordinano le liste di conseguenza
	PER i da 1 a lunghezza(listaId)-1
			PER j da 1 a lunghezza(listaId)
			# codice di riordinamento per colore, evitato per via della lunghezza eccessiva
	
	# stampa dei pazienti in attesa e inserimento in coda
	SCRIVI "Pazienti in attesa: "
	PER i da 1 a lunghezza(listaId)	
		SE listaStato.get(i) == "attesa"
			enqueue(queueAttesa, listaId.get(i))
			SCRIVI listaNome.get(i), listaId.get(i), listaCodiceColore.get(i)
		
	# cambio stato dei pazienti in attesa in "visitato"
	PER i da 1 a lunghezza(queueAttesa)
		PER j da 1 a lunghezza(listaId)
			SE listaId.get(j) == queueAttesa.get(i)
				SOSTITUISCI(listaStato, "visitato", j)
	
	# stampa dei pazienti visitati, sostituzione del loro stato da "visitato" a "dimesso" e rimozione dalla coda
	SCRIVI "Pazienti visitati: "
	PER i da 1 a lunghezza(listaStato)
		SE listaStato.get(i) == "visitato"
			SCRIVI listaNome.get(i), listaId.get(i), listaCodiceColore.get(i)
			SOSTITUISCI(listaStato, "dimesso", i)
			dequeue(queueAttesa)
			
	# ricerca di un paziente tramite il suo id (codice fiscale) e stampa delle informazioni essenziali
	LEGGI idPaziente
	PER i da 1 a lunghezza(listaId)
		SE idPaziente == listaId.get(i)
			SCRIVI listaNome.get(i), listaStato.get(i), listaCodiceColore.get(i)
			esci dal ciclo
			
FINE
```