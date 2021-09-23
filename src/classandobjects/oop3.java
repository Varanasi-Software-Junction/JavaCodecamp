package classandobjects;
enum Division
{
    Fail,Third,Second,First
}
public class oop3{
    String name;
    int roll,phy,che,mat;
    public oop3(String name,int roll,int phy,int che,int mat)
    {
        this.name=name;
        this.roll=roll;
        this.phy=phy;
        this.che=che;
        this.mat=mat;
    }
    public boolean isPassed()
    {
        if(phy < 40 || che < 40 || mat < 40)
        return false;
        return true;
    }
    public int sum()
    {
        return(phy+che+mat);
        
    }
    public double percent()
    {
        double x=(phy + che + mat )/3.0;
        x=x*100;
        x=(int)x;
        x=x/100.0;
        return x;
    }
    public Division result()
    {
        if (!isPassed())
        return Division.Fail;
        double p=percent();
        if(p<50)
        return Division.Third;
        if(p<60)
        return Division.Second;
        return Division.First;
    }
    public String toString()
    {
        
       return"";
        //return " Name: " + name + "\n Roll: " + roll + "\n Physics: " + phy + "\n Chemistry: " + che + "\n Maths: " + mat + "\n Percentage: " +avg +"\n Total: "+sum() + "\n Results: " + isPassed();
    } 
    public static void main(String args[])
    {
        oop3 obj=new oop3("Shivank",21,89,97,91);
        System.out.println(obj.result());
        System.out.println(obj.percent());
        
    }
}