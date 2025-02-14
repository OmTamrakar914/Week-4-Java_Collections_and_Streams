package checkedexceptions;
import java.io.*;

public class CompileTimeExceptions {
    public static void readingFile(String filepath){
        File inputFile = new File(filepath);
        try{
            inputFile.exists();

            try(BufferedReader br = new BufferedReader(new FileReader(inputFile))){
                String line;
                while((line = br.readLine())!= null) {

                }
                System.out.println("File Read Successfully!");
            }
        }catch (IOException e){
            System.out.println("Your Input File is not found!");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        String filepath = "src/main/java/checkedexceptions/data.txt";
        readingFile(filepath);
    }
}
