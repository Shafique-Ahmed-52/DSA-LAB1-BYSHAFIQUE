
package insertion;

/**
 *
 * @author Shfique Ahmed
 */
public class Insertion {

    
    public static void main(String[] args) {
    int arr[]=new int[6];
    arr[0]=5;
    arr[1]=15;
    arr[2]=25;
    arr[3]=35;
    arr[4]=45;
    arr[5]=55;
        System.out.println("Before Insertion");       
        for(int i=0; i<arr.length; i++){
            System.out.println("Element at Index "+i+":"+arr[i]);
              }
      int newElement=5;
        for(int i=arr.length-1; i>0; i--){
    arr[i]=arr[i-1];
        
        }
        arr[0]=newElement;
        System.out.println("After Insertion");
        for(int i=0; i<arr.length; i++){
            System.out.println("After insertion"+i+" : "+arr[i]);
        }
    }
}
