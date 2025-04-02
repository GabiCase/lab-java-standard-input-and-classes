import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        Intern intern1 = new Intern("Lucas", "locasmail", 40, 1234);
        Intern intern2 = new Intern("Ana", "anemail", 35, 11345);
        Intern intern3 = new Intern("Juan", "juanmail", 25, 1456);
        Intern intern4 = new Intern("Sofia", "sofiaemail", 28, 11567);
        Intern intern5 = new Intern("Pedro", "pedroemail", 30, 1678);
        Intern intern6 = new Intern("Marta", "martaemail", 22, 21789);
        Intern intern7 = new Intern("Carlos", "carlosmail", 32, 41890);
        Intern intern8 = new Intern("Laura", "lauraemail", 27, 21901);
        Intern intern9 = new Intern("Fernando", "fernandomail", 29, 2012);
        Intern intern10 = new Intern("Elena", "elenamail", 31, 2123);

        Intern[] interns = {
                intern1, intern2,
                intern3, intern4,
                intern5, intern6,
                intern7, intern8,
                intern9, intern10};

        var employeesFile= new FileWriter("employees.txt",true);

        for( Intern intern : interns){
            employeesFile.write("Name: " + intern.getName() + "\n"
                                    + "email: " + intern.getEmail() + "\n"
                                    + "age: " + intern.getAge() + "\n"
                                    + "salary: " + intern.getSalary() + "\n" + "==============="+ "\n");
        }
        employeesFile.close();
    }
}
