import java.io.*;

public class DeserializeDemo {
    public static void main(String[] args) {
        Employee employee1 = null;
        Employee employee2 = null;

        try {
            FileInputStream fileIn = new FileInputStream("employee.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            employee1 = (Employee) in.readObject();
            employee2 = (Employee) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException ex) {
            ex.printStackTrace();
            return;
        } catch (ClassNotFoundException e) {
            System.out.println("Employee class not found");
            e.printStackTrace();
            return;
        }

        displayResults(employee1, employee2);

    }

    private static void displayResults(Employee employee1, Employee employee2) {
        System.out.println("Employee data");
        System.out.println(employee1.name);
        System.out.println(employee1.address);
        System.out.println(employee1.SSN);
        employee1.mailCheck();
        System.out.println("\n");
        System.out.println(employee2.name);
        System.out.println(employee2.address);
        System.out.println(employee2.SSN);
        employee2.mailCheck();
    }
}
