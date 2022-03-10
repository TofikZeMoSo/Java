package Tofik.Assignments.Main;

import Tofik.Assignments.Data.DefaultInitialization;
import Tofik.Assignments.Singelton.NonstaticMemberstring;

public class Mainmethod {
    DefaultInitialization obj1 = new DefaultInitialization();

 //   obj1.printVar();
 //   obj1.printLocalvar();

 public static void main(String[] args) {
     NonstaticMemberstring obj2 = new NonstaticMemberstring();
     obj2.printString();
 }

}
