
package stringbracketedit;

import java.util.Scanner;

/**
 *
 * @author Yelloninja
 */
public class StringBracketEdit {

    public static void main(String[] args) {
        Scanner c = new Scanner(System.in);
        
        String fileName = c.nextLine();
        String newfileName = "";
        boolean inBracket = false;
        
        for(int i = 0; i<fileName.length(); i++){
            if(fileName.charAt(i)=='['){
                inBracket = true;
            }else if(fileName.charAt(i)== ']' && inBracket == true){
                inBracket = false;
            }
            
            if(!(fileName.charAt(i)== ']') && !inBracket)
                newfileName = newfileName + fileName.charAt(i);
        }
        System.out.println("Rename is : " + newfileName);
    }
}