public class Main {
    public static void main(String[] args) {
        task_1_1();
    }

    private static void task_1_1() {
        Human human1 = new Human("1987", "Максим", "Минск");
        Human human2 = new Human("1993", "Аня", "Москва");
        Human human3 = new Human("1994", "Катя", "Калининград");
        Human human4 = new Human("1995", "Артем", "Москва");

        human1.printMessage();
        human2.printMessage();
        human3.printMessage();
        human4.printMessage();
    }
}