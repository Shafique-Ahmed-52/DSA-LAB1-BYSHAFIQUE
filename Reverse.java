
//package dsa.lab1;

/**
 *
 * @author  Shafique Ahmed
 * Aror university Sukkur
 */
public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
     int array[]={1,3,5,7,9};
        System.out.println("Array Element: ");
     for(int i=0; i<array.length; i++){
         System.out.println(array[i]);
     }
        System.out.println("Reverse Array: ");
    for(int i=array.length-1; i>=0; i--){
        System.out.println(array[i]);
    
    }
   
    }
 
}
