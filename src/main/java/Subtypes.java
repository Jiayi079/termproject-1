class ClassA{
    public void a(){}
}

class ClassB extends ClassA{
    public void b(){}
}

class ClassC extends ClassB{
    public void c(){}
}

public class Subtypes {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        a.a();
        ClassB b = new ClassB();
        b.a();
        b.b();
        ClassC c = new ClassC();
        c.a();
        c.b();
        c.c();

        // Subtype polymorphism
        useA(a);
        useA(b);
        useA(c);

        ClassA ab = new ClassB();
        ab.a();
        //ab.b(); // doesn't work
        ClassA ac = new ClassC();
        ac.a();
        //ac.b(); // doesn't work
        //ac.c(); // doesn't work

        ClassC cc = (ClassC)ac; // because ac is type of ClassA, you can force it to become ClassC by using (ClassC)
        cc.c(); // now can do this

    }

    public static void useA(ClassA a){
        a.a();
        //a.b(); // unless param was ClassB or lower
    }
}
