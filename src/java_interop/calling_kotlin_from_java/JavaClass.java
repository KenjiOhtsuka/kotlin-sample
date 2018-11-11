package java_interop.calling_kotlin_from_java;

public class JavaClass {
    void test1() {
        TopLevelKt.function();
        TopLevelKt.getA();
    }

    void test2() {
        NameSpecified.getNamedA();
        NameSpecified.namedFunction();
    }

    void test3() {
        MultiFileClass.getValue1();
        MultiFileClass.getValue2();
        MultiFileClass.function1();
        MultiFileClass.function2();
    }
}
