package Autoconcessionaria;

import java.util.Scanner;

public class main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        Conducente c1 = new Conducente("Fabrizio", "Chianese", 62);
        Veicolo v1 = new Veicolo("Fiat", "Lancia", "IO2ERUER1", 5, "Bianco", 1100, 20000.0, c1);

        Veicolo[] magazzino = new Veicolo[10];
        magazzino[0] = v1;

        boolean loop = true;

        int scelta = 0;
        while(loop)
        {
            scelta = input.nextInt();
            switch(scelta)
        }

        System.out.println(v1.getConducente().getEta());
    }    
}
