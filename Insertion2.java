
//package insertion2;

/**
 *
 * @author Shafique Ahmed
 */
public class Insertion2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
    int[] array=new int [6];
        array[0]=100;
        array[1]=200;
        array[2]=300;
        array[3]=400;
        array[4]=500;
        for(int i=0; i<array.length; i++){
            System.out.println("BEfore Insertion "+i+":"+array[i]);
             }
        int middleelement=250;
        int index=2;
        for(int i=array.length-1; i>index; i--){
            array[i]=array[i-1];
        }
        array[index]=middleelement;
        System.out.println("");
        for(int i=0; i<array.length; i++){
            System.out.println("After insertion "+i+ ":"+array[i]);
}
        
    }
    
}
