public class Intern extends Employee {

    private static final double maxSalary = 20000;

    public Intern(String name, String mail, double salary, int age) {

        super (name, mail, salary, age);
        if (salary > maxSalary) {
            System.out.println("Input is INVALID !! Limit reached for an intern: " + getName() + " Rewriting to maximum salary!");

            setSalary(maxSalary);
        }


    }

    @Override
    public String toString() {
        return  "- Intern {Name = '" + getName() + "',E-mail = '" + getMail() + "',Age= " + getAge() + ", Salary =  " +getSalary();
    }
}

