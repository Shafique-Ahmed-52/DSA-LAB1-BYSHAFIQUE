
//package dsa.lab1;

/**
 *
 * @author Shfaique Ahmed
 * roll no: 0052
 */
public class Insertion3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    int [] array=new int[6];
    array[0]=3;
    array[1]=6;
    array[2]=9;
    array[3]=12;
    array[4]=15;
    System.out.println("Before Insertion");
    for(int i=0; i<array.length; i++){
    System.out.println("Element index "+i+" : "+array[i]);
    }
    int element=18;
    array[array.length-1]=element;
        System.out.println("After insertion: ");
        for(int i=0; i<array.length; i++){
            System.out.println("Element index "+i+" : "+array[i]);
        
        }
        
    }
    }
    

