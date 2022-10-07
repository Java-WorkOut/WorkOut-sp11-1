public class Human {
    private String birthday;
    private String fullName;
    private String city;
    private String jobTitle;

    public Human(String birthday, String fullName, String city, String jobTitle) {
        this.birthday = birthday;
        this.fullName = fullName;
        this.city = city;
        this.jobTitle = jobTitle;
    }

    public void printMessage() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %s году. Я работаю на должности %s. Будем знакомы!\n", fullName, city, birthday, jobTitle);
    }
}
