import java.util.Scanner;

/**
 * Questa classe implementa l'algoritmo Bubble Sort per ordinare un array di numeri interi.
 */
public class bubbleSort
{
    public static void main(String[] args) {
        int n = 0;
        int temp = 0; // Variabile temporanea per lo scambio degli elementi

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci il numero di elementi dell'array: ");
        n = input.nextInt();
        
        int[] array = new int[n];

        System.out.print("Inserisci gli " + n + " elementi dell'array: ");
        for (int i = 0; i < n; i++)
        {
            array[i] = input.nextInt();
        }

        // Algoritmo Bubble Sort
        // Il ciclo esterno scorre l'array da 0 a n-1
        for(int i = 0; i < n; i++)
        {
            // Il ciclo interno confronta gli elementi adiacenti e li scambia se sono nell'ordine sbagliato
            // n - i - 1 è l'ottimizzazione per non confrontare gli elementi già ordinati alla fine dell'array
            for(int j = 0; j < n - i - 1; j++)
            {
                if(array[j] > array[j + 1])
                {
                    // Scambio degli elementi
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

        System.out.println("\n\nArray ordinato: ");
        for(int i = 0; i < n; i++)
        {
            System.out.print(array[i] + " ");
        }

        input.close(); // Chiude lo scanner per rilasciare le risorse
    }    
}
