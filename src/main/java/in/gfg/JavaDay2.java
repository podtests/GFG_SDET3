package in.gfg;

public class JavaDay2 {

    public static void main(String[] args) {

        Animal a1 = new Animal();
        a1.eat();
        a1.eat(5);

        Cat c1 = new Cat();

        System.out.println(c1.x);
        c1.eat();

        c1.setZ(10);
        System.out.println(c1.getZ());

        /*
        System.out.println("For S1:");

        Student.z = 100;

        Student s1 = new Student();
        s1.age = 30;
        s1.play();

        System.out.println("For S2:");
        Student s2 = new Student();
        s2.z = 50;
        s2.play();
*/


    }

    public void Array1D() {
        int x =5;

        //1D array
        int[] arr1 = new int[5];

        int[] arr2 = {5, 6, 7, 8 , 9};

        int[] arr3 = new int[]{1, 2, 4, 5};


        System.out.println("Length of Array is: "+arr2.length); //5


        arr1[0] = 4;

        System.out.println(arr1[0]); //4

        //for Each loop
        for(int y=0; y < arr3.length;y++) {
            System.out.println("Y is" +y);  //0 1 2 3

            System.out.println(arr3[y]);  //arr3[1]
        }

        for (int z :arr3) {

            System.out.println(z);
            //
        }
    }

    public void Array2D() {
        //2D

        int[] x = new int[5];


        String[] s1 = new String[5];

        //2D
        String[][]  s2 = new String[2][3] ;

        s2[0][0] = "A00";
        s2[0][1] = "A01";
        s2[0][2] = "A02";
        s2[1][0] = "A10";
        s2[1][1] = "A11";
        s2[1][2] = "A12";

        //2D  nested for loops
        for(int y =0; y <2; y++) {
            for (int z = 0; z < 3; z++) {
                System.out.println(s2[y][z]);
            }

        }

    }
}
