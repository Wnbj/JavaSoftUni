import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountCharacterTypes {
    public static void main(String[] args) {
            try (BufferedReader reader = new BufferedReader(new FileReader("words.txt"))){
                String line = reader.readLine();
                String vowelsPattern = "[aoueiAOUEI]";
                String marksPatters = "[,.!?]";
                Pattern pattVowels = Pattern.compile(vowelsPattern);
                Pattern pattMarks = Pattern.compile(marksPatters);
                int counterVowels = 0;
                int counterConsonants = 0;
                int counterMarks = 0;

                while (line != null){
                    List<String> wordsList = Arrays.asList(line.split("\\s"));
                    Matcher matchVowels = pattVowels.matcher(line);
                    Matcher matchMarks = pattMarks.matcher(line);

                    for (int i = 0; i < wordsList.size(); i++) {
                        for (int j = 0; j < wordsList.get(i).length(); j++) {
                            if (matchVowels.find()){
                                counterVowels ++;
                            }
                            else if (matchMarks.find()){
                                counterMarks++;
                            }
                            else{
                                counterConsonants++;
                            }
                        }
                    }
                    line = reader.readLine();
                }
                String finalString = "Vowels: " + counterVowels +
                        "\r\nConsonants: " + counterConsonants +
                        "\r\nPunctuation: " + counterMarks;

                try (PrintWriter writer = new PrintWriter(new FileWriter(new File("count-chars.txt")))) {
                    writer.append(finalString);
                }
                catch (IOException e){
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
