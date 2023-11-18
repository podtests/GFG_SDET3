package in.gfg;

public class JavaDemo {

    public static void main(String[] args) {
        JavaDemo  d1 = new JavaDemo();
        d1.doWhile();
        //ifElseDemo(false);
    }


    public void switchdemo() {
        int x =2;
        switch (x) {
            case 1:  {
                System.out.println(1);
                break;
            }
            case 2: {
                System.out.println(2);
                break;

            }
            case 3: {
                System.out.println(3);
                break;

            }
            default: {
                System.out.println(100);
                break;
            }


        }
    }
    public  void ifElseDemo(boolean isValid) {

        if (isValid == true) {
            System.out.println("It is Valid");
        }
        else {
            System.out.println("It is InValid");
        }

    }


    public void forLoopClassicDemo() {

        int x = 0;
        for( ; ; ) {
            if (x ==5) {
                break;
            }
            System.out.println("Akhil Jain");
            x++;
        }
        System.out.println("Cam out of loop");


    }


    public void whileLoopDemo() {
        int x =0;
        while(x<5) {
            System.out.println("Akhil Jain");
            x++;

        }
    }

    public void doWhile() {
        int x=0 ;

        do {  //0 - P

            System.out.println("Akhil Jain");
            x++;
        }while(x <5);
    }
    public void dataType() {
        int a1 = 5;
        float a2 = 5.6f;

        char c1 = 'A';

        boolean isValid = true;

        String firstName = "Akhil";


        System.out.println(a1);
        System.out.println(a2);
        System.out.println(c1);
        System.out.println(firstName);
        if (isValid == true ) {
            System.out.println("It is True");
        }
    }
}
