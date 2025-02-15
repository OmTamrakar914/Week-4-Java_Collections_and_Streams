package datastreams;
import java.io.*;

public class StoreandRetrievePrimitiveData {
    private static final String fileName = "studentsdata.txt";

    public static void saveStudent(int roll, String name, double gpa) {
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {
            dos.writeInt(roll);
            dos.writeUTF(name);
            dos.writeDouble(gpa);
            System.out.println("Student data saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readStudent() {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {
            System.out.println("Roll: " + dis.readInt());
            System.out.println("Name: " + dis.readUTF());
            System.out.println("GPA: " + dis.readDouble());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        saveStudent(101, "OM", 9.8);
        readStudent();
    }
}
