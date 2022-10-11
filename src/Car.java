public class Car {
    private final String brand;
    private final String model;
    private final double motorVolume;
    private final String color;
    private final int year;
    private final String country;

    public Car(String brand, String model, double motorVolume, String color, int year, String country) {
        this.brand = (brand.equals("")) ? "default" : brand;
        this.model = (model.equals("")) ? "default" : model;
        this.country = (country.equals("")) ? "default" : country;
        this.motorVolume = (motorVolume <= 0) ? 1.5 : motorVolume;
        this.color = (color.equals("")) ? "Белый" : color;
        this.year = (year <= 0) ? 2000 : year;
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
