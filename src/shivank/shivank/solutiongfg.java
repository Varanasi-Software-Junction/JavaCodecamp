package shivank;
class solutiongfg {

    public static boolean isValid(String s) {
        
        // Write your code here
        char ch[]=s.toCharArray();
        int falg=0;
        int pos=0,k=0;
        for(int i=0;i<ch.length;i++)
        {
            
            if(ch[i]!='.' && i!=ch.length-1)
            continue;
            if(ch[i]=='.' || i==ch.length-1)
            {
                pos=i;
            
            if(i==ch.length-1)
            pos+=1;
            String s1=s.substring(k,pos);
            System.out.println(s1);
            k=pos+1;
            int y=Integer.parseInt(s1);
            if(y<0 || y>255)
            break;
            else 
            falg++;
        
                
            }
            
        
        }
        if(falg==4)
        return true;
        return false;
    }
    public static void main(String[] args) {
        
        String s="1.255.1.34";
        if(isValid(s))
        System.out.println("true");
        System.out.println(s.charAt(1));
    }
}