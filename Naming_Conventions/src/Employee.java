public class Employee {

    //    private String n; //(n=name)      this is the wrong way to declare the name of variables
    private double s;  //(s= salary)   because it is hard to understand who's name or salary we are talking about
//    private String a; //(a=address)


    private String employeeAddress;  //this is the right way to declare the name of variables
    private double employeeSalary;   //because it is noe simple to understand who's name or salary we are talking about
    private String employeeName;


//    public void employeeLevel()  // difficult to understand the functioning of method
//    {
//        if(s>0 && s<50000)
//        {
//            System.out.println("level 1");
//        }
//        else if(s>50000 && s<100000)
//        {
//            System.out.println("level 2");
//        }
//        else
//        {
//            System.out.println("level 3");
//        }
//    }

    public void defineEmployeeLevelBySalary()
    {
        if(employeeSalary>0 && employeeSalary<50000)
        {
            System.out.println("level 1");
        }
        else if(employeeSalary>50000 && employeeSalary<100000)
        {
            System.out.println("level 2");
        }
        else
        {
            System.out.println("level 3");
        }
    }

}

