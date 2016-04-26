import java.io.*;

public class AllCapitals {
    public static void main(String[] args) {
        StringBuilder allCapitols = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader("lines.txt"))) {

            String line = reader.readLine();
            while (line != null) {
                allCapitols.append(line.toUpperCase() + "\r\n");
                line = reader.readLine();
            }
            try (PrintWriter writer = new PrintWriter(new FileWriter("lines.txt"))) {
                writer.append(allCapitols);
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
