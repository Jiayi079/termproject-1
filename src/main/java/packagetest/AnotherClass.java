package packagetest;

public class AnotherClass {
    public static void main(String[] args) {
        // because we are in different class/same package
        ClassTest classTest = new ClassTest();
        //System.out.println(classTest.a); // doesn't work
        System.out.println(classTest.b); // this works
        System.out.println(classTest.c); // this works
        System.out.println(classTest.d); // this works
    }
}
