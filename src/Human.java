public class Human {
    private final String birthday;
    private final String fullName;
    private final String city;
    private String jobTitle;

    public Human(String birthday, String fullName, String city, String jobTitle) {
        this.birthday = birthday;
        this.fullName = fullName;
        this.city = city;
        this.jobTitle = jobTitle;
    }

    public void printMessage() {
        System.out.printf("Привет! Меня зовут %s. Я из города %s. Я родился в %s году. Будем знакомы!\n", fullName, city, birthday);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}
