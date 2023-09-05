import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.*;
import java.util.Scanner;

/*public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number-");
    short a =sc.nextShort();
    System.out.println("your number is-"+a);

        }
    }

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number-");
    long a =sc.nextLong();
    System.out.println("your number is-"+a);

        }
    }

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number-");
    double a =sc.nextDouble();
    System.out.println("enter second number -");
    double b =sc.nextDouble();
        double c=a+b;
        System.out.println(+c);
        }
    }

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("write-");
        String a =sc.nextLine();
        System.out.println(a);

    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number-");
        boolean a =sc.nextBoolean();
        System.out.println(a);

    }
}

class Test
{
    int a=10;
    void display()
    {
        System.out.println(a);
    }
    public static void main(String arg[]){
        Test t=new Test();
        Test t1=new Test();
        System.out.println("the value of object t is-");
        System.out.println(t.a);
        t.display();
        System.out.println("the value of object t1 is-");
        System.out.println(t1.a);
        t1.display();

    }
}

class Student
{
    Scanner sc =new Scanner(System.in);
    int Rollno;
    String name;
    void get(){
        Rollno = sc.nextInt();
        name = sc.nextLine();

    }
        public static void main(String[]args){
        Student s1 =new Student();
        Student s2=new Student();
        s1.get();
        s2.get();


        }


}

class Test{
    int a,b;
    Test() {
        a = 5;
        b = 10;
    }
    Test(int x,int y) {
        a = x;
        b = y;
    }
    Test(Test t4){
        a=t4.a;
        b=t4.b;
    }
    void display(){
        System.out.println(a+b);
    }
    public static void main(String[]args){
        Test t= new Test();
        Test t2= new Test(10,20);
        Test t3= new Test(t2);
        t.display();
        t2.display();
        t3.display();
    }
    }


class Test{
    int a;
    Test() {
        a = 12;

    }
    Test(int x) {
        a = x;

    }
    Test(Test t4){
        a=t4.a;

    }
    void display(){
        System.out.println(3.14*a*a);
    }
    public static void main(String[]args){
        Test t= new Test();
        Test t2= new Test(15);
        Test t3= new Test(t2);
        t.display();
        t2.display();
        t3.display();
    }
}

class main{
    public static void main(String[]args){
        int  n=5;
        for(int i=n;i>=1;i--){
            for (int j=1;j<=(n-i);j++){
                System.out.print(" ");

            }
            for (int k=1;k<=(2*i)-1;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        for(int i=2;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)-1;k++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}


class main {
    public static void main(String[]args) {
        int number,num=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number:- ");
        number = sc.nextInt();
        for(int i=1;i<=10;i++){
            num=number*i;

                System.out.println(num+" ");
            }
        }


        }

*/
