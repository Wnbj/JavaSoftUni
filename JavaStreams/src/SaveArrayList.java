import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class SaveArrayList {
    public static void main(String[] args) {
        Random rndm = new Random();
        ArrayList<Double> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Double rndmDouble = rndm.nextDouble() + i / rndm.nextDouble();
            list.add(rndmDouble);
        }
        try(ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("doubles.list"));
            ObjectInputStream load = new ObjectInputStream(new FileInputStream("doubles.list"))){
            obj.writeObject(list);

            ArrayList<Double> result = (ArrayList<Double>) load.readObject();
            System.out.println(result.toString());
        }
         catch (Exception e) {
            e.printStackTrace();
        }
    }
}
