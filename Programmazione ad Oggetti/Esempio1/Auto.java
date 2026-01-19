package Esempio1;

public class Auto
{
    String modello;
    int velocita;
    int cilindrata;

    void accendiAuto()
    {
        System.out.println("Auto accesa.");
    }

    void spegniAuto()
    {
        System.out.println("Auto spenta.");
    }

    void stampaVelocita()
    {
        System.out.println("Velocita' attuale: " + velocita + " km/h.");
    }

    void accelera()
    {
        velocita += 10;
    }

    void frena()
    {
        velocita -= 10;
    }
}
