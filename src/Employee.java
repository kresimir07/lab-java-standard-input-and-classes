public class Employee {
    private String name;
    private String mail;
    private int age;
    double salary;

    public Employee(String name, String mail, double salary, int age) {
        this.name = name;
        this.mail = mail;
        this.salary = salary;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;

    }
    public String toString(){
        return "- Employee {Name = '" + name + "', E-mail = '" + mail + "', Age = " + age + ", Salary = " + salary + "}";
    }

}