import java.io.IOException;

public class App {
    public static void main(String[] args) {
        StartApp();
    }

    private static void StartApp() {
        Work work = new Work();
        try {
            System.out.println(work.work());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
