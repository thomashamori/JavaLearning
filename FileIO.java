import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("writing to a file");
            writer.close();
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
