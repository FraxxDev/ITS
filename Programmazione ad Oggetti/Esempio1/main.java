package Esempio1;

public class main
{
    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.modello = "Fiat Punto Turbo Jet";
        auto1.velocita = 60;
        auto1.cilindrata = 1300;

        auto1.accendiAuto();
        auto1.stampaVelocita();
        auto1.accelera();
        auto1.stampaVelocita();
        auto1.frena();
        auto1.stampaVelocita();
        auto1.spegniAuto();
    }    
}
