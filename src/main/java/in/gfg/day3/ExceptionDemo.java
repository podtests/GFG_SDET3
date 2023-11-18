package in.gfg.day3;

public class ExceptionDemo {

    public int calculate(int x) {
        int z;
        int[] arr1 = new int[]{1, 2};
        try {
            z = 100 / x;
            System.out.println(arr1[7]);
        }catch(ArithmeticException e) {
            System.out.println("ArithmeticException ");
            z = 10;
        }

        catch(Exception e) {
            System.out.println("Exception ");
            z = 1;
        }

         return z;
    }

    public int calculate2(int x) throws ArithmeticException{
        int z;
        int[] arr1 = new int[]{1, 2};
            z = 100 / x;
            System.out.println(arr1[7]);
        return z;
    }



    public static void main(String[] args) {
        ExceptionDemo d1 = new ExceptionDemo();
        System.out.println(d1.calculate(10));
        try {
            d1.calculate2(10);
        }
        catch (Exception e){
            System.out.println();
        }
    }
}
