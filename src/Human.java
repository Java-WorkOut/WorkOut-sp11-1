public class Human {
    private String birthday;
    private String fullName;
    private String city;

    public Human(String birthday, String fullName, String city) {
        this.birthday = birthday;
        this.fullName = fullName;
        this.city = city;
    }

    public void printMessage() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %s году. Будем знакомы!\n", fullName, city, birthday);
    }
}
