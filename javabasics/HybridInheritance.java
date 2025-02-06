package javabasics;

//Parent Interface 1
interface Parent1 {
 void method1();
}

//Parent Interface 2
interface Parent2 {
 void method2();
}

//Child Class implementing multiple interfaces
class Child implements Parent1, Parent2 {
 @Override
 public void method1() {
     System.out.println("Method1 from Parent1");
 }

 @Override
 public void method2() {
     System.out.println("Method2 from Parent2");
 }
}

//Main Class
public class HybridInheritance {
 public static void main(String[] args) {
     Child child = new Child();
     child.method1(); // Calls method from Parent1
     child.method2(); // Calls method from Parent2
 }
}

