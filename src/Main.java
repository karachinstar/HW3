import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserInputReader inputReader = new UserInputConsoleReader(scanner);
        UserDataFileWriter fileWriter = new UserDataFileWriterImpl();
        boolean flag = false;
        String exit;
        while (!flag) {
            //System.out.println(exit);
            try {
                UserData userData = inputReader.readUserData();
                fileWriter.writeUserData(userData);
                System.out.println("Введите любой символ хотите добавить еще одного человека " +
                        "или N для выхода");
                exit = scanner.nextLine();
                if(exit.equals("n")|exit.equals("N")){
                    flag = true;
                }
                //System.out.println(exit);
            } catch (UserDataException | IOException e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }
}