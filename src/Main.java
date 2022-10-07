public class Main {
    public static void main(String[] args) {
        task_1_1();
    }

    private static void task_1_1() {
        Human human1 = new Human("1987", "Максим", "Минск", "Бренд-менеджер");
        Human human2 = new Human("1993", "Аня", "Москва", "Методист образовательных программ");
        Human human3 = new Human("1994", "Катя", "Калининград", "Продакт-менеджер");
        Human human4 = new Human("1995", "Артем", "Москва", "Директор по развитию бизнеса");
        human1.printMessage();
        human2.printMessage();
        human3.printMessage();
        human4.printMessage();
    }
}