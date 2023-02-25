import java.io.IOException;

public class Work {

    public String work() throws IOException {
        
        CreatDate user = new CreatDate();
        user.creatDate();

        UserDate parse = new UserDate();
        if (parse.parseData(user.getUserData()) == 1) {
            return "Введено недостаточно данных";
        }
        if (parse.parseData(user.getUserData()) == 2) {
            return "Введено избыточное количество данных";
        } else {
            WriteUserDate record = new WriteUserDate();
            record.writeUserDate();
        }
        return "Операция выполнена";
    }
}
