public class Car {
    private final String brand;
    private final String model;
    private final double motorVolume;
    private final String color;
    private final int year;
    private final String country;

    public Car(String brand, String model, double motorVolume, String color, int year, String country) {
        this.brand = brand;
        this.model = model;
        this.motorVolume = motorVolume;
        this.color = color;
        this.year = year;
        this.country = country;
    }

    public void printInfo() {
        System.out.println(brand + " "
                + model + ", "
                + "сборка в " + country + ", "
                + "цвет кузова: " + color + ", "
                + "объём двигателя - " + motorVolume + " литра, "
                + "год выпуска - " + year + " год");

    }
}
