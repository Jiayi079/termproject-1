import packagetest.ClassTest;
public class HelloWorld extends ClassTest{

    public static void main(String args[]){
        System.out.println("Hello World");
        System.out.println("Hello");

        // because we are in different class/package
        ClassTest classTest = new ClassTest();
        //System.out.println(classTest.a); // doesn't work
        //System.out.println(classTest.b); // doesn't work
        //System.out.println(classTest.c); // doesn't work
        System.out.println(classTest.d); // this works

        // after add "extend ClassTest" in class
        HelloWorld hello = new HelloWorld();
        //System.out.println(hello.a); // doesn't work
        System.out.println(hello.b); // this works, because hello extends Class Test
        //System.out.println(hello.c); // doesn't work
        System.out.println(hello.d); // this works, because always public
    }
}
