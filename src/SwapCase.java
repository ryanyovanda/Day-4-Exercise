import java.util.Scanner;

//Write a code to swap the case of each character from string
public class SwapCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        StringBuffer newStr=new StringBuffer(str);

        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
            }
            else if (Character.isLowerCase(str.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
            }
        }
        System.out.println("New String: ");
        System.out.println(newStr);


    }
}
