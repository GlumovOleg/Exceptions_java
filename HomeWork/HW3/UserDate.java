import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


public class UserDate {
    private String[] dataSet;
    private static String lastName;
    private static String firstName;
    private static String patronymic;
    private static LocalDate birthDate;
    private static long phoneNumber;
    private static char gender;


    public class UserDataException extends RuntimeException {
        public UserDataException(String message) {
            super(message);
        }
    }

    public int parseData(String data) throws UserDataException {
        this.dataSet = data.split(" ");
        if (dataSet.length < 6) {
            return 1;
        }
        if (dataSet.length > 6) {
            return 2;
        }
        else {
            try {
                lastName = dataSet[0];
            } catch (UserDataException e) {
                System.out.println("Неверный формат фамилии"); 
            }
            try {
                firstName = dataSet[1];
            } catch (UserDataException e) {
                System.out.println("Неверный формат имени");
            }
            try {
                patronymic = dataSet[2];
            } catch (UserDataException e) {
                System.out.println("Неверный формат отчества");
            }
            try {
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy", Locale.ENGLISH);
                birthDate = LocalDate.parse(dataSet[3], dtf);
            } catch (UserDataException e) {
                System.out.println("Неверный формат дня рождения");
            }
            try {
                phoneNumber = Long.parseLong(dataSet[4]);
            } catch (UserDataException e) {
                System.out.println("Неверный формат номера телефона");
            }
            try {
                gender = dataSet[5].charAt(0);
            } catch (UserDataException e) {
                System.out.println("Неверный формат символа пола");
            }
        }
        return 0;
    }

    public static String getLastName() {
        return lastName;
    }

    public static String getFirstName() {
        return firstName;
    }

    public static String getPatronymic() {
        return patronymic;
    }

    public static LocalDate getBirthDate() {
        return birthDate;
    }

    public static long getPhoneNumber() {
        return phoneNumber;
    }

    public static char getGender() {
        return gender;
    }
}

