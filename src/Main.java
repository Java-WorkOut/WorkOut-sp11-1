public class Main {
    public static void main(String[] args) {
        task_1_1();
    }

    private static void task_1_1() {
        Car car1 = new Car("Lada", "Grande", 1.7, "Желтый", 2015, "Россия");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        Car car3 = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2.4, "Красный", 2018, "Южная Корея");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        car1.printInfo();
        car2.printInfo();
        car3.printInfo();
        car4.printInfo();
        car5.printInfo();
    }
}