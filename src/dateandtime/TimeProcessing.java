/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateandtime;

/**
 *
 * @author Chmpak
 */
public class TimeProcessing {
    public static void main(String[] args) {
        int hr=13,min=45;//11:45 AM hr + : + min + AM
        String output=(hr<=11)? hr + ":" + min + " AM":(hr==12)? hr + ":" + min + " PM": + (hr-12) + ":" + min + " PM";
        
        
        System.out.println(output);
        
    }
}
