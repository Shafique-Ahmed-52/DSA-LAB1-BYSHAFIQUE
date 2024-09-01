
package dsa.lab1;

/**
 *
 * @author Shafique Ahmed
 */
public class Searching2 {

    
    public static void main(String[] args) {

      int array[]={11,22,33,44,55};
      int target=33;
     
      int left=0;
      int right=array.length-1;
      int middle; 
      boolean found=false;
      while(left<=right){
      middle=left+(right-left)/2;
      if(array[middle]==target){
     System.out.println("Elemen  "+target+" found at index : "+middle);
     found=true;
     break;
      }    
      if(array[middle]<target){
         left=middle+1;
        }
      else{
      right=middle-1;
      }
      }
      if(found==false){
          System.out.println("Element "+target+"not found:");
 }}}

    

