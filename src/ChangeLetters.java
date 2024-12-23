import java.io.*; // import klas do pracy na plikach

public class ChangeLetters {
    public static void main(String[] args) {

        String input = "input.txt";  //wskazanie pliku wchodzącego
        String output = "output.txt"; //wskazanie pliku wychodzącego

        try (
                BufferedReader reader = new BufferedReader(new FileReader(input));
                BufferedWriter writer = new BufferedWriter(new FileWriter(output))
        ) {
          String line;

          while ((line = reader.readLine()) != null) {

              String modifiedLine = line.replace(" ","-"); // zmiana spacji na myślniki

              writer.write(modifiedLine);
              writer.newLine();
          }
            System.out.println("Operacja wykonana poprawnie");
        } catch (IOException e) {

            System.out.println("Błąd" + e.getMessage());
        }

    }
}