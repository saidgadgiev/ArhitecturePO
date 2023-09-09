package Homework3.srt;

public class Main {
    public static void main(String[] args) {
        Granta.granta = new Granta("Lada", "21170", "White", 
        "Liftback", 4, "Benzin", "MT", 1.6);
        Granta.granta.sweepStreet();
        Granta.granta.switchGear();
        Granta.granta.turnOnWipers();
        Granta.granta.sweepStreet();
        
    }
}
