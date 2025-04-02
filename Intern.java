public class Intern extends Employee{
    public Intern(String name, String email, int age, int salary) {
        super(name, email, age, salary);
    }

    @Override
    public void setSalary(int salary) {
        if (salary>20000){
            System.out.println("Lo siento, el límite es 20000");
            super.setSalary(20000);
        } else {
            super.setSalary(salary);
        }
    }
}
