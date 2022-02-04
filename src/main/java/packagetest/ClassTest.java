package packagetest;

public class ClassTest {

    private int a;
    protected int b;
    int c;
    public int d;

    public static void main(String[] args) {
        // because we are in the same class, all works
        ClassTest classTest = new ClassTest();
        System.out.println(classTest.a);
        System.out.println(classTest.b);
        System.out.println(classTest.c);
        System.out.println(classTest.d);
    }
}
