/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionspackage;

/**
 *
 * @author Lenovo
 */
public class ArrayDeclarations {
    public static void main(String[] args) {
        int[]a;
        int b[];
        int [] c=new int[10];
        int[] d={1,2,3,4,5};
        int[] e=new int[]{1,2,3,4,5};
        int[] f;
        f=new int[]{3,4,2};
        for(int x:new int[]{1,2,3,4})
            System.out.println(x);
    }
}
