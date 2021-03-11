package mr223_assign4;
import java.io.*;
import java.util.*;

public class ObscureLovecraft {

    public static void main(String[] args) {

        System.out.println("Obscure \n=======\n1. Make Obscure\n2. Make readable\n3. Print obscure\n4. Print readable\n0. Exit");
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {

                while (!sc.hasNextInt()) {
                    System.out.println("This is not an option");
                    sc.next();
                }
                int userCall = sc.nextInt();

                switch (userCall) {
                    case 1:
                        readFile();
                        break;
                    case 2:
                        changingObscure();
                        break;
                    case 3:
                        displayObscure();
                        break;
                    case 4:
                        revealReadable();
                        break;
                    case 0:
                        System.out.println("Bye, bye!");
                        System.exit(0);
                    default:
                }
            }

            catch (Exception message) {
                System.out.println(message.getMessage());
            }

        }

    }

    public static void readFile() {

        File path = new File("./src/mr223_assign4/lovecraft.txt");

        if (path.exists()) {

            try (BufferedReader bufReading = new BufferedReader(new FileReader(path))) {
                StringBuilder build = new StringBuilder();
                String sentence;

                while ((sentence = bufReading.readLine()) != null) {
                    build.append(EncryptDecrypt.encryptLine(sentence));
                }

                File fileInformation = new File("./src/mr223_assign4/obscure.txt");
                try (BufferedWriter notes = new BufferedWriter(new FileWriter(fileInformation))) {
                    notes.write(build.toString());
                }

                bufReading.close();
                System.out.println("Done!");

            }

            catch (IOException message) {
                message.printStackTrace();
            }
        }

        else
            System.out.println("file was not identified");

    }
    public static void changingObscure() {

        File path2 = new File("./src/mr223_assign4/obscure.txt");

        if (path2.exists()) {

            try (BufferedReader reader = new BufferedReader(new FileReader(path2))) {

                StringBuilder buffReading = new StringBuilder();
                String sentence2;

                while ((sentence2 = reader.readLine()) != null) {
                    buffReading.append(EncryptDecrypt.decryptLine(sentence2));
                }

                File userEntry = new File("./src/mr223_assign4/readableLovecraft.txt");
                try (BufferedWriter implement = new BufferedWriter(new FileWriter(userEntry))) {
                    implement.write(buffReading.toString());
                }

                reader.close();
                System.out.println("Done!");
            }

            catch (IOException message) {
                message.printStackTrace();
            }
        } else
            System.out.println(" file was not found");
    }

    public static void displayObscure() {
        showingFiles("./src/mr223_assign4/obscure.txt");
    }

    public static void revealReadable() {
        showingFiles("./src/mr223_assign4/readableLovecraft.txt");
    }

    public static void showingFiles(String path) {
        File fileData = new File(path);

        if (fileData.exists()) {

            try (BufferedReader information = new BufferedReader(new FileReader(fileData))) {

                String sentence;

                while ((sentence = information.readLine()) != null) {
                    System.out.println(sentence);
                }
                information.close();
                System.out.println("Done!");
            }

            catch (IOException message) {
                message.printStackTrace();
            }

        } else
            System.err.println("file was not identified");
    }
}
