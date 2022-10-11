public class Human {
    private final int birthday;
    private final String fullName;
    private final String city;
    private String jobTitle;

    public Human(int birthday, String fullName, String city, String jobTitle) {
        this.birthday = (birthday < 0) ? 0 : birthday;
        this.fullName = fullName;
        this.city = city;
        this.jobTitle = jobTitle;
    }

    public Human(int birthday, String fullName, String city) {
        this(birthday, fullName, city, null);
    }

    public Human(int birthday, String fullName) {
        this(birthday, fullName, null, null);
    }

    public Human(int birthday) {
        this(birthday, null, null, null);
    }

    public Human(String fullName, String city, String jobTitle) {
        this(0, fullName, city, jobTitle);
    }

    public Human(String fullName, String city) {
        this(0, fullName, city, null);
    }

    public Human(String fullName) {
        this(0, fullName, null, null);
    }


    public void printMessage() {
        String fullNameMessage = (fullName == null) ? "Информация не указана" : "Меня зовут " + fullName;
        String cityMessage = (city == null) ? "Информация не указана" : "Я из города " + city;
        String jobTitleMessage = (jobTitle == null) ? "Информация не указана" : "Я работаю на должности " + jobTitle;
        String birthdayMessage = (birthday == 0) ? "Информация не указана" : "Я родился в " + birthday + " году";
        System.out.printf("Привет! %s. %s. %s. %s. Будем знакомы!\n", fullNameMessage, cityMessage, jobTitleMessage, birthdayMessage);
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getBirthday() {
        return birthday;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCity() {
        return city;
    }
}
