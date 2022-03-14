
import java.util.Scanner;
import java.util.regex.Pattern;

public class CustomException {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter UserName: ");
        String userName = Sc.nextLine();

        try{
            if(userName.length() < 5) {
                throw new UserNameLengthLess("username length can not be less than 5");
            }
            if(userName.length() > 20) {
                throw new UserNameLengthMore("username length can not be more than 20");
            }
           if(!Pattern.matches("(?=.*[0-9]).{5,20}",userName)) {
            throw new UserNameInvalid("your username invalid it must contain atleast one number");
        }
            System.out.println("Your UserName is valid");
    }
        catch (Exception E) {
            System.out.println(E.getMessage());
        }
        finally {
            System.out.println("We Are finally in Finally block");
        }
        }
}