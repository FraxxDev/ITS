Parolacce: 17

# Documento dei Requisiti
Esempio: il cliente ha una piscina e vuole gestire le iscrizioni. Essi vende gli ingressi e per contare ogni ingresso tramite qr code, rimuovendo l'ingresso dai tot ingressi dell'utente.

## DOD_REQ_POOL.md
Versione 1.2.6 (1 = build quindi cambiamento importante, 2 = feature, 3 = bug fixes)

### Descrizione del Progetto:
Si vuole realizzare un sistema di gestione piscine che tenga traccia di Clienti e accessi.

### Stakeholders:
- Cliente: Utente che si reca fisicamente in piscina
- Gestore:  Colui che ha accesso al pannello di amministrazione dell'applicazione
- Sistema: Software per la gestione delle operazioni di ingresso

### Requisiti funzionali
1. M - L'UTENTE deve potersi iscrivere al SISTEMA inserendo:
	- Nome
	- Cognome
	- Data di Nascita
	- Email
	- Password
2. M - L'UTENTE deve poter modificare le informazioni del profilo:
	- Password
3. M - L'UTENTE deve poter eliminare il proprio profilo
4. M - Il GESTORE deve poter modificare le informazioni del profilo UTENTE:
	- Nome
	- Cognome
	- Data Nascita
	- Email
5. M - Il GESTORE deve poter eliminare un profilo UTENTE
6. M - Il GESTORE deve poter aggiungere ingressi a UTENTE se la modalità di pagamento è contanti.
7. M - L'UTENTE deve essere in grado di acquistare gli ingressi tramite pagamento con Carta di Credito
8. M - Il SISTEMA genera un QR Code che cambi ogni giorno per identificare gli ingressi
9. M - L'UTENTE scansionsa il QR Code e il sistema verifica:
	1.  SE UTENTE ha ingressi superiori a zero, apri tornello
	2. SE UTENTE ha ingressi uguali a zero, errore
10. 

### Requisiti non funzionali

0. La password utente deve essere sicure ecc...
1. Bisogna rispettare i criteri della regolamentazione GDPR per l'immagazzinamento dati degli utenti
2. ecc ...