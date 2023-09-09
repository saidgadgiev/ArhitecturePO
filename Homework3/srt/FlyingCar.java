package Homework3.srt;
// 6. Создать конкретный автомобиль путём наследования класса «Car», определить метод «движение» - «полёт». Провести проверку принципа LSP.
public class FlyingCar extends Car {

    public FlyingCar(String brand, String model, String color, String bodyType, int numberOfWheels, String fuelType,
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
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'turnOnFogLights'");
    }

    @Override
    public void transportCargo() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transportCargo'");
    }

    @Override
    public void move() {
        System.out.println("The car is flying.");
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
