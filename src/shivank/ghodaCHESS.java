public class ghodaCHESS {
    public static void main(String[] args) {
        System.out.println("Enter position x: ");
        int x=8;
        System.out.println("Enter position y: ");
        int y=8;
        function(x+1,y+2);
        function(x-1,y+2);
        function(x+2,y-1);
        function(x-2,y+1);
        function(x-2,y-1);
        function(x+2,y+1);
        function(x-1,y-2);
        function(x+1,y-2);

    }
    public static void function(int x,int y){ 
        if(x<=8 && y<=8 && x>=1 && y>=1)
        {
    
        
        System.out.println(x+" "+y);
    }
    
}}
