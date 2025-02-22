class A { // A
    String name;
    int age;
    private String job;

    A() {
        System.out.println("constructor1 is called");
    }

    String job() {
        return this.job;
    }
}

class B extends A { // B using A
    String father;
    boolean educated;

    B() {
        System.out.println("constructor2 is called");
    }

}

class student {
    String name;
    String rollno;
    String phone;
    String m1;
    String m2;
    String m3;

    student(String a, String b, String c) {
        this.name = a;
        this.rollno = b;
        this.phone = c;
    }
}

class Mylist {
    int[] arr1 = new int[4];

    void add(int n) {
        if (arr1[arr1.length / 2] != 0) {
            int[] arr2 = new int[arr1.length * 2];
            for (int i = 0; i < arr1.length; i++) {
                arr2[i] = arr1[i];
            }
            arr1 = arr2;

            int i = 0;
            while (arr1[i] != 0) {
                i++;
            }
            arr1[i] = n;

        } else {
            int i = 0;
            while (arr1[i] != 0) {
                i++;
            }
            arr1[i] = n;
        }
    }

    void set(int index, int n) {
        if (index < arr1.length) {
            arr1[index] = n;
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    int size() {
        return arr1.length;
    }

    int get(int i){
        return arr1[i];
    }

    void sort() {
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - i - 1; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    int temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
    }
}

public class opp3 {
    // static it becomes the proprerty of the class instead of function and can be
    // called without calling the function
    public static void main(String[] args) {
        // A a1 = new A();
        // a1.name = "Mohit";
        // a1.age = 18;
        // B a2 = new B();
        // a2.name = "vimal";
        // a2.age = 20;
        // String job = a2.job();
        // System.out.println(job);

        Mylist list = new Mylist();
        list.add(0);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(4);
        list.sort();
        System.out.println(list.size());
        System.out.println(list.get(3));

    }
}
