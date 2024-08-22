
import java.util.Scanner;

public class Proper_Employee {
    Scanner sc=new Scanner(System.in);
    int salary;
    String name;

public int Salary()
    {

        System.out.println("Enter the Salary: ");
         salary=sc.nextInt();
        return salary;

    }
    public int getSalary()
    {

        return salary;
    }
    public String name(){
    System.out.println("Enter the Employee name: ");
    name=sc.next();
    return name;
    }
    public String getname() {
        return name;
    }
    public String setname(String n){
            name=n;
            return name;
        }



    }

public  void main(String[] args) {
    Proper_Employee harry= new Proper_Employee();
    harry.Salary();
    System.out.println( harry.getSalary());
    harry.name();
    System.out.println(harry.getname());

    System.out.println(harry.setname("NARESH"));

}

