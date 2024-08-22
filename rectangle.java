import java.util.Scanner;

public class rectangle {
        int l;
        int b;
        public void getSide()
        {
            System.out.println("Enter the Length: ");
            Scanner sc=new Scanner(System.in);
            l=sc.nextInt();
            System.out.println("Enter the Breath0");
            b=sc.nextInt();

        }

        public  void perimeter(){

            System.out.println(2*(l+b));
        }
        public void area(){
            System.out.println(l*b);

        }
    }
    public void main(String []args)
    {
        rectangle s1=new rectangle();
        rectangle s2=new rectangle();
        s1.getSide();
        s1.perimeter();
        s2.getSide();
        s2.area();

    }


