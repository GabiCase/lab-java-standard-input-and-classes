public class Employee {
    private String name;
    private String email;
    private int age;
    private int salary;

    public Employee(String name, String email, int age, int salary){
        this.setName(name);
        this.setEmail(email);
        this.setAge(age);
        this.setSalary(salary);
    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public int getSalary(){
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
}
