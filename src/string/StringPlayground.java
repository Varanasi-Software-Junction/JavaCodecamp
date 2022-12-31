package string;

import java.util.Arrays;

public class StringPlayground {
    public static void main(String[] args) {
        String s="This is a train";
        String[] parts=s.split(" ");
        System.out.println(Arrays.toString(parts));
        String reverse="";
        for(String  string:parts )
            reverse=string +  " " + reverse;
        System.out.println(reverse);
    }
}
