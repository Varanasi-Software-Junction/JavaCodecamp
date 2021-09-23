package classandobjects;
class Over{

    double add(int a,int b,int c)
    {
        double w=a+b+c;
        return w;
        

    }
    float add(Float a,Float b)
    {
        return a+b;
    }
    float add(int a,Float b)
    {
        return a+b;
    }
    float add(Float a,int b)
    {
        return a+b;
    }
    int add(int a,int b)
    {
        return a+b;
    }
    int sum(int... a)
    {
int x=0;
for(int n:a)
x+=n;
return x;
    }
    public static void main(String... args)
    {
        
    Over q=new Over();
    System.out.println(q.sum(1,2,4,5,7));
    
    System.out.println(q.add(2,4));
    System.out.println(q.add(2,4.9f));
        

    }

}