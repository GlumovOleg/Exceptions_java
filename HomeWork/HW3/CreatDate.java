import java.util.Scanner;

public class CreatDate {
        private String userData;
    
        public void creatDate() {
            System.out.println("Введите Фамилию, имя, отчество, дату рождения, номер телефона, пол (m или f) одной строкой через пробелы");
            Scanner keyboard = new Scanner(System.in);
            this.userData = keyboard.nextLine();
            keyboard.close();
        }
    
        public String getUserData() {
            return this.userData;
        }

}
