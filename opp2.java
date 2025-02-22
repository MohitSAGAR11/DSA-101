
class student{
    String name;
    String rollno;
    String phone;
    String m1;
    String m2;
    String m3;
    student(String a , String b , String c){
        a = name;
        b = rollno;
        c = phone;
    }
    
    
void print(){
    System.out.print(name);
    System.out.print(rollno);
    System.out.print(phone);
}
    public double getCGR(){
    
            return (getRating(m1)*4 + getRating(m2)*3 + getRating(m3)*3)/10.0;
        
    }

    public int getRating(String g){
        if(g.equals("A*")){
            return 10;
        }
        else{
            return 9;
        }
    }

    
}
public class opp2 {
    public static void main(String[] args) {
        student s1 = new student("Mohit" , "10622" , "7007085013");
        s1.m1 = "A*";
        s1.m2 = "A*";
        s1.m3 = "A*"; 

        System.out.println(s1.getCGR());
               
    }
}
