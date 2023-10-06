import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserInputReader inputReader = new UserInputConsoleReader(scanner);
        UserDataFileWriter fileWriter = new UserDataFileWriterImpl();
        String exit = "";
        while (exit.equals("") || exit.equals("y")) {
            try {
                UserData userData = inputReader.readUserData();
                fileWriter.writeUserData(userData);
                System.out.println("Нажмите Y сли хотите добавить еще одного человека " +
                        "или N для выхода");
                exit = scanner.nextLine();
            } catch (UserDataException | IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}