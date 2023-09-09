package Homework3.srt;
// 1.Спроектировать абстрактный класс «Car» у которого должны быть 
// свойства: марка, модель, цвет, тип кузова, число колёс, тип топлива, 
// тип коробки передач, объём двигателя; методы: движение, обслуживание, 
// переключение передач, включение фар, включение дворников.
public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private String bodyType;
    private int numberOfWheels;
    private String fuelType;
    private String transmissionType;
    private double engineVolume;
    
    // 2. Расширить абстрактный класс «Car», добавить метод: подметать улицу.
    public abstract void sweepStreet();
    // Расширить абстрактный класс «Car», добавить метод: включение противотуманных фар, перевозка груза.
    public abstract void turnOnFogLights();
    public abstract void transportCargo();

    public Car(String brand, String model, String color, String bodyType,
               int numberOfWheels, String fuelType, String transmissionType, double engineVolume) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.bodyType = bodyType;
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
        this.transmissionType = transmissionType;
        this.engineVolume = engineVolume;
    }
    
    public abstract void move();
    
    public abstract void service();
    
    public abstract void switchGear();
    
    public abstract void turnOnHeadlights();
    
    public abstract void turnOnWipers();
}