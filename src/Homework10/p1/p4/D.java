package Homework10.p1.p4;
import Homework10.p1.*;
import static Homework10.p1.p2.B.*;
import Homework10.p1.p2.p3.C;
import Homework10.p1.p4.p5.E;

public class D {
    public static void main(String[] args) {
        A directoryA = new A("Ivan", "Borovikov"); // p1
        int staticSum = s; // p2
        System.out.println(staticSum);
        C directoryC = new C();  // p3
        directoryC.info();
        E directoryE = new E(); // p5
        directoryE.sum(10.2, 20);




    }
}
