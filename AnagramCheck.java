
 */
package dsa.lab1;

/**
 *
 * @author Shafique Ahmed
 */
public class AnagramCheck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
    String str1="listen";
        String str2="silent";
        char ch1[]=str1.toCharArray();
        char ch2[]=str2.toCharArray();
        arrays.sort(ch1);
        arrays.sort(ch2);
        boolean result=arrays.equals(ch1,ch2);
        if(result==true){
            System.out.println("String is Anagram: ");
        }
        else{
            System.out.println("String is not Anagram: ");
        }
        
        
        
    }}