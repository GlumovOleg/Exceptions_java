import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class WriteUserDate {


    public void writeUserDate() throws IOException {

        String filePath = "HomeWork/HW3/Данные//" + UserDate.getLastName() + ".txt";
        File file = new File(filePath);
        if (!file.exists()) {
            boolean fileCreated = file.createNewFile();
            if (fileCreated) {
                System.out.println("Файл с именем" + file.getName() + " успешно создан");
            }
        }
        try (FileWriter fileWriter = new FileWriter(file, StandardCharsets.UTF_8, true)) {
            
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("<")
                    .append(UserDate.getLastName()).append("><")
                    .append(UserDate.getFirstName()).append("><")
                    .append(UserDate.getPatronymic()).append("><")
                    .append(UserDate.getBirthDate()).append("><")
                    .append(UserDate.getPhoneNumber()).append("><")
                    .append(UserDate.getGender()).append(">\n");
            fileWriter.write(stringBuilder.toString());

        } catch (IOException e) {
            throw new IOException(e);
        }
    }
}
