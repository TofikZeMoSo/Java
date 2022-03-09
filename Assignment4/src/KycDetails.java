
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;



public class KycDetails {
    public static void main(String[] args)throws ParseException {
        int numberOfTestCases;
        System.out.println("Enter Number Of Tests");
        Scanner S = new Scanner(System.in);
        numberOfTestCases = S.nextInt();





        while(numberOfTestCases>0) {
            String date1=S.next();
            String date2=S.next();
            Date SignupDate = new SimpleDateFormat("dd-MM-yyyy").parse(date1);
            Date CurrentDate = new SimpleDateFormat("dd-MM-yyyy").parse(date2);

                if(CurrentDate.compareTo(SignupDate)>0) {
                    Date start, end, cal;
                    cal = SignupDate;
                    cal.setYear(CurrentDate.getYear());

                    Calendar calendar = Calendar.getInstance();
                    calendar.setTime(cal);
                    calendar.add(Calendar.DATE, 30);
                    end = calendar.getTime();
                    calendar.add(Calendar.DATE, -60);
                    start = calendar.getTime();

                    if (end.compareTo(CurrentDate) > 0)
                        end = CurrentDate;
                    SimpleDateFormat print = new SimpleDateFormat("dd-MM-yyyy");
                    System.out.println(print.format(start) + " " + print.format(end));
                }
                    else{
                        System.out.println("No Range");

                }
                    numberOfTestCases--;
        }
    }

}
