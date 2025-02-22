class A {
    int Grades = 1;
    String college = "SST";

    A(int Grades, String college) {
        this.Grades = Grades;
        this.college = college;
    }
}

class B extends A {
    String Name;
    String Rollno;

    B(int Grades, String college, String Name, String Rollno) {
        super(Grades, college);
        this.Name = Name;
        this.Rollno = Rollno;
    }
}

class C extends B {
    String fatherName;
    String motherName;

    C(int Grades, String college, String Name, String Rollno, String fatherName, String motherName) {
        super(Grades, college, motherName, Rollno);
        this.fatherName = fatherName;
        this.motherName = motherName;
    }
}

class Student {
    String name;
    String rollno;
    String phone;
    double m1;
    double m2;
    double m3;

    Student(String a, String b, String c) {
        this.name = a;
        this.rollno = b;
        this.phone = c;
    }

    void print() {
        System.out.print(name);
        System.out.print(rollno);
        System.out.print(phone);
    }

    public double getCGR() {

        return ((this.m1) * 4 + (this.m2) * 3 + (this.m3) * 3) / 10.0;

    }

}

public class opp4 {
    public static void main(String[] args) {
        Student a = new Student("Mohit", "10622", "9697100101");
        a.m1 = 90.0;
        a.m2 = 85.9;
        a.m3 = 98.9;
       getReportCard(a);

    }

   static  void getReportCard(Student a){
        System.out.println(a.name);
        System.out.println(a.rollno);
        System.out.println(a.phone);
        System.out.println(a.getCGR());
    }

}
