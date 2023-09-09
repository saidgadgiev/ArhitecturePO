package Homework3.srt;

public class Granta extends Car implements FuelStation{

    public static Granta granta;

    public Granta(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType,
            String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, transmissionType, engineVolume);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void move() {
        System.out.println("The car is moving.");
    }
    
    @Override
    public void service() {
        System.out.println("The car is being serviced.");
    }
    
    @Override
    public void switchGear() {
        System.out.println("The car's gear is being switched.");
    }
    
    @Override
    public void turnOnHeadlights() {
        System.out.println("The headlights are being turned on.");
    }
    
    @Override
    public void turnOnWipers() {
        System.out.println("The wipers are being turned on.");
    }

    @Override
    public void sweepStreet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sweepStreet'");
    }

    @Override
    public void turnOnFogLights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOnFogLights'");
    }

    @Override
    public void transportCargo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transportCargo'");
    }

    @Override
    public void refuel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refuel'");
    }
}
