package shivank;

public class practiceGeneric<hi>{
    hi z;
    practiceGeneric(hi z)
    {
        this.z=z;
        
    }
    public void car()
    {
        System.out.println(z.getClass());
    }
    public static void main(String args[])
    {
        //practicestatic a=new practicestatic();
        //practice.car();
        practiceGeneric<String> h=new practiceGeneric<>("Hi");
        h.car();

    }
}
