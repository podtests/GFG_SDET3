package in.gfg;

public class JavaDay3Demo extends AbstractDemo implements InterfaceDemo {


    // extends AbstractDemo
    public void method2() {
        System.out.println("I am JavaDay3Demo class");
    }


    public void iMethod1() {
        System.out.println("I am JavaDay3Demo class: iMethod1");
    }


    public void iMethod2() {
        System.out.println("I am JavaDay3Demo class: iMethod2");
    }

    public static void main(String[] args) {
        JavaDay3Demo j1 = new JavaDay3Demo();
        j1.method2();
        j1.iMethod1();
        j1.iMethod2();
    }
}
