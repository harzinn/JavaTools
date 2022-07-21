import java.io.*;

public class SerializeDemo {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nick", "Home", 123456789, 101);
        Employee employee2 = new Employee("Test", "NotHome", 77, 2);
        Employee employee3 = new Employee("Noone", "NoWhere", 0, 404);
        Employee test123 = new Employee("Dave", "Lab", 1, 500);

        try {
            FileOutputStream fileOut =
            new FileOutputStream("employee.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(employee1);
            out.writeObject(employee2);
            out.close();
            fileOut.close();
            System.out.printf("Data is saved");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
