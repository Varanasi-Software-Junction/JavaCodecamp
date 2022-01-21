/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Lenovo
 */
public class ToStringExample {
    public static void main(String[] args) {
        ToStringExample example=new ToStringExample();
        System.out.println(example.toString());
    }

    @Override
    public String toString() {
        return "Hello";
    }
    
}