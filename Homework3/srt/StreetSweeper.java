package Homework3.srt;
// Провести проверку принципа SRP.
public class StreetSweeper extends Car{

    public StreetSweeper(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType,
            String transmissionType, double engineVolume) {
        super(brand, model, color, bodyType, numberOfWheels, fuelType, transmissionType, engineVolume);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void sweepStreet() {
        System.out.println("The street is being swept.");
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
    
}
