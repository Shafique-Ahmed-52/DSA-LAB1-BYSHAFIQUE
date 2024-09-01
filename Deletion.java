/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsa.lab1;

/**
 *
 * @author Shfaique Ahmed
 */
public class Deletion {

    /
    public static void main(String[] args) {
    int array[]={8,16,24,32,40};
        System.out.println("Before Deleting: ");
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("After deleting :");
        int delindex=2;
        for(int i=delindex; i<array.length-1; i++){
        array[i]=array[i+1];
        }
        array[array.length-1]=0;
        for(int i=0; i<array.length; i++){
            System.out.println(array[i]);
        
        }
    }
  
    
}
