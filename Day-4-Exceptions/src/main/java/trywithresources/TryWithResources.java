package trywithresources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {
    public static void trywithResource(String filePath){
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line;
            line = reader.readLine();
            System.out.println(line);
        }catch (IOException e){
            System.out.println("Error reading file!");
        }
    }
    public static void main(String[] args) {
        String filePath = "src/main/java/trywithresources/input.txt";
        trywithResource(filePath);
    }
}
