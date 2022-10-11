public class Main {
    public static void main(String[] args) {
        task_1_1();
        task_1_3();
    }

    private static void task_1_1() {
        Human human1 = new Human(1987, "Максим", "Минск", "Брэнд-менеджер");
        human1.printMessage();
        Human human2 = new Human(1993, "Аня", "Москва", "Методист образовательных программ");
        human2.printMessage();
        Human human3 = new Human(1994, "Катя", "Калининград", "Продакт-менеджер");
        human3.printMessage();
        Human human4 = new Human(1995, "Артем", "Москва", "Директор по развитию бизнеса");
        human4.printMessage();
        Human human5 = new Human(-2342,null,null,null);
        human5.printMessage();
    }

    private static void task_1_3() {
        Car car1 = new Car("Lada", "Grande", 1.7, "Желтый", 2015, "Россия");
        car1.printInfo();
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "Черный", 2020, "Германия");
        car2.printInfo();
        Car car3 = new Car("BMW", "Z8", 3.0, "Черный", 2021, "Германия");
        car3.printInfo();
        Car car4 = new Car("Kia", "Sportage 4 поколение", 2.4, "Красный", 2018, "Южная Корея");
        car4.printInfo();
        Car car5 = new Car("Hyundai", "Avante", 1.6, "Оранжевый", 2016, "Южная Корея");
        car5.printInfo();
        Car car6 = new Car("", "", 0, "", 0, "");
        car6.printInfo();
    }
}