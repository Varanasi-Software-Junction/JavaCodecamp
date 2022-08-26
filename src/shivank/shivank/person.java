package shivank.shivank;

import java.util.Comparator;

public class person 
{
    String name,address;
    int age;

    person(String name,String address,int age) 
{   
    this.name=name;
    this.address=address;
    this.age=age;

}
@Override
public String toString()
{
    return name+" "+address+" "+age;
}
    
    
    public static void main(String[] args) {
        person a[]={new person("Shivank","Bhagalpur",20),new person("Vishal","Varnaasi",23),new person("Puneet","Dinapur",22)};
        for(int i=0;i<a.length;i++)
        {person obj=(a[i]);
        System.out.println(obj);}
        for(int i=0;i<a.length-1;i++)
        {
           // if(compare(a[i],a[i+1]))
        }
    }
}
class AgeComparator implements Comparator<person>
{
    
    
    @Override
    public int compare(person o1, person o2) {
        if(o1.age>o2.age)
        return 1;
        if(o1.age<o2.age)
        return -1;
        return 0;
    }

    
    
}
