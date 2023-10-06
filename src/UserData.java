import java.time.LocalDate;

public class UserData {
    private String lastName;
    private String firstName;
    private String patronymic;
    private LocalDate dateOfBirth;
    private long phoneNumber;
    private Gender gender;

    public UserData(String firstName, String lastName, String patronymic, LocalDate dateOfBirth,
                    long phoneNumber, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.patronymic = patronymic;
        this.dateOfBirth = dateOfBirth;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Gender getGender() {
        return gender;
    }
}

