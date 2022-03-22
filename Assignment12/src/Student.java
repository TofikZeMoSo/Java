import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.lang.String;
import java.util.stream.Collectors;
import java.util.Set;
import java.util.Map;


public class Student {
    int id,age;
    String name,gender,engDepartment;
    int yearOfEnrollment;
    double perTillDate;

    public Student(int id, String name, int age, String female, String engDepartment, int yearOfEnrollment, double perTillDate) {
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }
   public String toString(){//overriding the toString() method
        return engDepartment;
    }
    public String getName() {
        return name;
    }
    public void getDetails(int id, String name, int age, String female, String engDepartment, int yearOfEnrollment, double perTillDate) {
        return;
    }

}

class JavaStreamExample {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();

        studentList.add(new Student(111,"Jiya Brein",17,"Female","Computer Science",2018,70.8));
        studentList.add(new Student(122,"Paul Niksui",18,"Male","Mechanical",2016,50.2));
        studentList.add(new Student(133,"Martin Theron",17,"Male","Electronic",2017,90.3));
        studentList.add(new Student(144,"Murali Gowda",18,"Male","Electrical",2018,80));
        studentList.add(new Student(155,"Nima Roy",19,"Female","Textile",2016,70));
        studentList.add(new Student(166,"Iqbal Hussain",18,"Male","Security",2016,70));
        studentList.add(new Student(177,"Manu Sharma",16,"Male","Chemical",2016,70));
        studentList.add(new Student(188,"Wang Liu",20,"Male","Computer Science",2018,80));
        studentList.add(new Student(199,"Amelia Zoe",18,"Female","Computer Science",2015,85));
        studentList.add(new Student(200,"Jaden Dough",18,"Male","Electronic",2019,82));
        studentList.add(new Student(211,"Jasna Kaur",20,"Female","Textile",2016,83));
        studentList.add(new Student(222,"Nitin Joshi",19,"Male","Electronic",2015,60.4));
        studentList.add(new Student(233,"Jyoti Reddy ",16,"Female","Computer Science",2017,45.6));
        studentList.add(new Student(244,"Nicolus Den",16,"Male","Electronic",2018,95.8));
        studentList.add(new Student(255,"Ali Baig",17,"Male","Electronic",2017,88.4));
        studentList.add(new Student(266,"Sanvi Pandey",17,"Female","Electric",2019,72.4));
        studentList.add(new Student(177,"Anuj Chettiar",18,"Male","Computer Science",2017,57.5));
        List<String> Department = new ArrayList<String>();
        for(int i=0; i< studentList.size(); i++) {
            Department.add(studentList.get(i).engDepartment);
        }
        for(int i=0; i< Department.size(); i++) {
            System.out.println(Department.get(i));
        }

        // Converting product List into Set
       /* Set<String> departmentNameList = departmentNameList.stream()
                        //  .filter(product->product.price < 30000)   // filter product on the base of price
                        .map(student -> student.engDepartment)
                        .collect(Collectors.toSet());   // collect it as Set(remove duplicate elements)

        System.out.println(departmentNameList); */


        List<String> yearOfJoin =            //2.get names
                studentList.stream()
                .filter(p->p.yearOfEnrollment > 2018)
                        .map(Student::getName)
                .collect(Collectors.toList());
        System.out.println(yearOfJoin);


        Map<String,Integer> Details =            //2.get names
                studentList.stream()
                        .filter(p->p.engDepartment =="")
                        .map(Student::getDetails)
                        .collect(Collectors.toList());
        System.out.println(yearOfJoin);

    }
}


