class MyClassA{
    public void sayHello(){
        System.out.println("hello?");
    }
}

class MyClassB{
    public void sayHello(){
        System.out.println("hello!");
    }
}

interface InterfaceA{
    void sayHello();

    default void sayHello2(){
        System.out.println("hello 2");
    }
}

interface InterfaceB{
    void sayHello();
}

public class MyClass {
    public static void main(String[] args) {

    }
}
