package Test;
public class stringquestion {
    public static void main(String[] args) {
        {
            int sum=0;
        String n ="-3b45nmb122";
        n="a" + n + "a";
        int startpos=0,endpos;
        char[] chars=n.toCharArray();
        for(int i=0;i<=chars.length-2;i++)
        {
            char prev=chars[i];
            char curr=chars[i+1]; 
            if((!Character.isDigit(prev  ) && prev!='-') && (Character.isDigit(curr) || curr=='-'))
                  
            {
                startpos=i + 1;
                System.out.println("start " + (i + 1));
            }
            
             if(Character.isDigit(prev) && !Character.isDigit(curr))
                 {
               endpos=i;
               String number="";
               System.out.println("end " + i );
               for(int j=startpos;j<=endpos;j++)
               {
                   number = number + chars[j];
               }
                     System.out.println(number);
                     sum=sum + Integer.parseInt(number);
            }
        }
            System.out.println(" sum =" + sum);
        
        }   
    }
}
