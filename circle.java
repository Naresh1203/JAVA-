import java.util.Scanner;

public class circle {
    int radius;
    public void getradius(){
        System.out.println("Enter the Radius:");
        Scanner sc=new Scanner(System.in);
        radius=sc.nextInt();

    }
    public void circumference()
    {
        System.out.println(2*3.14f*radius);

    }
    public void area(){
        System.out.println(3.14f*radius*radius);

    }
}

public void main(String[] args) {
    circle c1=new circle();
    circle c2=new circle();
    c1.getradius();
    c1.area();
    c2.getradius();
    c2.circumference();


}
