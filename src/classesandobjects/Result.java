package classesandobjects;

import java.util.Scanner;

public class Result {
    String name;
    int physics,chemistry,math;
    int rollnum;
    public static void main(String[] args) {
     Result r1=new Result("Rahul", 45, 55,54, 80); 
        System.out.println(r1);
        System.out.println(r1.getDivision());
         }
    
    public boolean isPassed()
    {
        if(physics<40 || chemistry<40 || math<40)
            return false;
        return true;
    }
    public int total()
    {
        return physics+chemistry + math;
    }
    public double percent()
    {
        return total()/3.0;
    }
    
    public Division getDivision()
    {
        
        if(!isPassed())
            return Division.Fail;
        double p=percent();
        if(p<50)
            return Division.Third;
        if(p<60)
            return Division.Second;
        return Division.First;
        
    }
    public Result(String name,int physics,int chemistry,int math  ,int rollnum)
    {
        this.rollnum=rollnum;
        this.name=name;
        this.physics=physics;
        this.chemistry=chemistry;
        this.math=math;
        
   }
    public Result()
    {
    Scanner scanner=new Scanner(System.in);    
    this.rollnum=Integer.parseInt(scanner.nextLine());    
    this.name=scanner.nextLine();
    this.physics=Integer.parseInt(scanner.nextLine());
    this.chemistry=Integer.parseInt(scanner.nextLine());
    this.math=Integer.parseInt(scanner.nextLine());
    scanner.close(); 
    }
     @Override
    public String toString() {
      return "rollnum = " +rollnum + ", name = " + name + ", physics = " + physics + ",chemistry =" + chemistry +", math =" +math;  
    }
}
