// programma calcolatrice con costrutto switch-case
// dati due valori, a e b,
// realizzare una breve applicazione che,
// date le opzioni disponibili,
// permetta di eseguire l'operazione matematica scelta
// (es: "+". "-". "*", "/" , "0" per uscire)

import java.util.Scanner;
public class operazioniSwitch {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        int a = 0;
        int b = 0;

        int scelta = 0;
        boolean loop = true;

        while(loop)
        {
            System.out.print("Benvenuto nella calcolatrice, scegli un'opzione:\n\n0 - Interrompi il programma.\n1 - Somma due numeri.\n2 - Sottrai due numeri.\n3 - Moltiplica due numeri.\n4 - Dividi due numeri.\n\nScelta: ");
            scelta = input.nextInt();
            switch(scelta)
            {
                case 0:
                    System.out.println("Ciao ciao!");
                    loop = false;
                    break;
                
                case 1:
                    System.out.print("Inserisci il primo numero: ");
                    a = input.nextInt();
                    System.out.print("Inserisci il secondo numero: ");
                    b  = input.nextInt();
                    System.out.println("Il risultato della somma e' " + (a + b));
                    break;

                case 2:
                    System.out.print("Inserisci il primo numero: ");
                    a = input.nextInt();
                    System.out.print("Inserisci il secondo numero: ");
                    b  = input.nextInt();
                    System.out.println("Il risultato della differenza e' " + (a - b));
                    System.out.println("Il risultato inverso della differenza e' " + (b - a));
                    break;

                case 3:
                    System.out.print("Inserisci il primo numero: ");
                    a = input.nextInt();
                    System.out.print("Inserisci il secondo numero: ");
                    b  = input.nextInt();
                    System.out.println("Il risultato della moltiplicazione e' " + (a * b));
                    break;

                case 4:
                    System.out.print("Inserisci il primo numero: ");
                    a = input.nextInt();
                    System.out.print("Inserisci il secondo numero: ");
                    b  = input.nextInt();
                    if(b != 0)
                    {
                        System.out.println("Il risultato della divisione e' " + ((double)a / b));
                    }

                    else
                    {
                        System.out.println("La divisione per 0 non e' possibile.");
                    }

                    if(a != 0)
                    {
                        System.out.println("Il risultato inverso della divisione e' " + ((double)b / a));
                    }

                    else
                    {
                        System.out.println("La divisione per 0 (inversa) non e' possibile.");
                    }

                    break;

                default:
                    System.out.println("Per favore, inserisci un numero intero per scegliere.");
            }
        }
        input.close();
    }
}
