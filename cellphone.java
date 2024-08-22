public class cellphone {

    public void ringing(){
        System.out.println("PHONE IS RINGING");
    }
    public void vibrating() {
        System.out.println("PHONE IS VIBRATING");
    }
    public void calling (){
        System.out.println("PHONE IS CALLING");}
}

public  void main(String[] args) {
    cellphone p1= new cellphone();
    cellphone p2=new cellphone();
    cellphone p3=new cellphone();
    p1.calling();;
    p2.vibrating();
    p3.ringing();


}
