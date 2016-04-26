import java.io.*;

public class CopyJPGFile {
    public static void main(String[] args) {
            try (FileInputStream myFile = new FileInputStream(new File("rambo.jpg"))) {

                int bufferSize = 4096;
                byte[] buffer = new byte[bufferSize];

                    try(FileOutputStream outStream = new FileOutputStream(new File("my-copied-picture.jpg"))){

                    while (myFile.read(buffer) != -1){
                        outStream.write(buffer);
                    }
                }
        }
            catch (FileNotFoundException e) {
            e.printStackTrace();
        }
            catch (IOException e) {
            e.printStackTrace();
        }
    }
}
