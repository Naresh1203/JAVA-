public class employee {

    public int id;
    public String name;

    public void getSalary(float Salary) {
        System.out.println(Salary);

    }

    public void getDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {

        employee em=new employee();
        em.id=35;
        em.name="Naresh";
        em.getDetails();
        em.getSalary(5000);

    }
}
