
package searching2;

/**
 *
 * @author Shafique 
 */
public class dsa.lab1{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          int array[]={4,6,2,8,10};
        int search=8;
        boolean found=false;
        for(int i=0; i<array.length; i++){
        if(array[i]==search){
     System.out.println("Element "+search+"  found at Idex :"+i);
       found=true;
       break;
        }}
      if(found==false){
        System.out.println("Element "+search+" "+"not found");
      }}}
