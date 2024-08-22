import java.util.Scanner;

public class square {
    int side;
    public void getSide()
    {
        System.out.println("Enter the side: ");
        Scanner sc=new Scanner(System.in);
        side=sc.nextInt();

    }

 public  void perimeter(){

     System.out.println(4*side);
    }
 public void area(){
     System.out.println(side*side);

 }
}
public void main(String []args)
{
    square s1=new square();
    square s2=new square();
    s1.getSide();
    s1.perimeter();
    s2.getSide();
    s2.area();

}
