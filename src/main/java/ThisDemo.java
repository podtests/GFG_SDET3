public class ThisDemo {


    public String name;  //null

    public ThisDemo(String name) {
        this.name = name;
    }


    public ThisDemo() {
    }


    public ThisDemo getName() {
        //return new ThisDemo();
        return this;
    }

}
