package java_interop.calling_kotlin_from_java;

public class JavaClass {
    void test1() {
        TopLevelKt.function();
        TopLevelKt.getA();
    }

    void test2() {
        NameSpecified.getA1();
        NameSpecified.function1();
    }
}
