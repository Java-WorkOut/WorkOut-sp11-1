public class Human {
    private Integer yearOfBirth;
    private final String fullName;
    private String town;
    private String jobTitle;

    public Human(Integer yearOfBirth, String fullName, String town, String jobTitle) {
        setYearOfBirth(yearOfBirth);
        this.fullName = (fullName == null || fullName.equals("")) ? "Информация не указана" : fullName;
        this.setTown(town);
        this.jobTitle = (jobTitle == null || jobTitle.equals("")) ? "Информация не указана" : jobTitle;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(Integer yearOfBirth) {
        this.yearOfBirth = (yearOfBirth == null || yearOfBirth < 0) ? 0 : yearOfBirth;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = (town == null || town.equals("")) ? "Информация не указана" : town;

    }

    public void printMessage() {
        System.out.printf("Привет! " +
                "Меня зовут %s. " +
                "Я из города %s. " +
                "Я работаю на должности %s. " +
                "Я родился в %s году. " +
                "Будем знакомы!\n", fullName, town, jobTitle, yearOfBirth);
    }

}
