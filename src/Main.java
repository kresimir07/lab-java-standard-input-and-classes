import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Marko","marko@test.com", 25000, 26 ));
        employees.add(new Intern("Marija","marija@test.com",19000,18  ));
        employees.add(new Intern("Mario","mario@test.com", 14000, 18 ));
        employees.add(new Intern("Mislav","mislav@test.com", 16000, 18 ));
        employees.add(new Intern("Matko","matko@test.com", 17000, 18 ));
//        Adding interns with salary > 20000
        employees.add(new Intern("Nikola","nikola@test.com", 29000, 28 ));
        employees.add(new Intern("Franjo","franjo@test.com", 38000, 28 ));
//        Continuing with employees
        employees.add(new Employee("Petar","petar@test.com", 31000, 20 ));
        employees.add(new Employee("Kruno","kruno@test.com", 33500, 21 ));
        employees.add(new Employee("Stjepan","stjepan@test.com", 36000, 27 ));
        employees.add(new Employee("Vladimir","vladimir@test.com", 31000, 20 ));

        try {

            FileWriter fileWriter = new FileWriter("Employee Database.txt", false);
            for (Employee employee : employees) {
                fileWriter.write("\n" + employee.toString());

            }

            System.out.println("File has been written with success ! ");
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
