package Homework3.srt;

public class CargoTruck extends Car {

    public CargoTruck(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType,
            String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, transmissionType, engineVolume);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void sweepStreet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sweepStreet'");
    }

    @Override
    public void turnOnFogLights() {
        System.out.println("The fog lights are being turned on.");
    }

    @Override
    public void transportCargo() {
        System.out.println("Cargo is being transported.");
    }

    @Override
    public void move() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void service() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'service'");
    }

    @Override
    public void switchGear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'switchGear'");
    }

    @Override
    public void turnOnHeadlights() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOnHeadlights'");
    }

    @Override
    public void turnOnWipers() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOnWipers'");
    }
    
}
