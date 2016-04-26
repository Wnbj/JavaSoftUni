import java.io.*;

public class SumLines {
    public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("lines.txt"))){

            String line = reader.readLine();
            while (line != null){
                int sum = 0;
                for (int i = 0; i < line.length() ; i++) {
                    sum += line.charAt(i);
                }
                System.out.println(sum);
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
