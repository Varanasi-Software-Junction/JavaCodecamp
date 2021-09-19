package practiceSaturdays;



public class palinString {
    public static void main(String[] args) {
        String m="malayalam";
        int flag=1;
        m=m.toLowerCase();
        for(int i=0;i<m.length()/2;i++)
        {
            if(m.charAt(i)==m.charAt(m.length()-1-i))
            continue;
            else 
            {
                System.out.println(m+" is not palindrome");
                flag=0;
                break;
            } 

        }
        if(flag==1)
        System.out.println(m+" is palindrome");

    }
    
}
