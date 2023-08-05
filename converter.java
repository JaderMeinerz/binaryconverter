import java.util.Scanner;

/**
 * converter
 */
public class converter {
    public static void main(String[] args) {
            String binary;
            Scanner s = new Scanner(System.in);
            int decimal = 0;
            System.out.println("Enter the binary: ");
            binary = s.nextLine();

            if(binary.length()>8){
                System.out.println("The binary must have max 8 digits");
            }else{                
                for (int i = 0; i < binary.length(); i++) {
                    char temp = binary.charAt(i);
                    int atual = Integer.parseInt(String.valueOf(temp));
                    int expo = (int) Math.pow(2, ((binary.length()-i-1)));
                    int converter = atual * expo;  
                    decimal += converter; 
                    
                }
                
                System.out.println("The decimal equivalent is: " + decimal);
            }    
            
            
        }
    
}
