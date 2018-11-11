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

    void test4() {
        ExtensionFunction.surround("test");
        ExtensionFunction.surround("test", "<", ">");
    }

    void test5() {
        OverloadSample t = new OverloadSample(1);
        t = new OverloadSample(1, 2);
        t.f(1);
        t.f(1, 2);
        t.f(1, 2, 3);
        t.g(1, 2);
    }

    void test6() {
        KotlinObject.INSTANCE.getNotStaticValue();
        KotlinObject.getStaticValue();
        KotlinObject.INSTANCE.notStaticFunction();

        // Error:
        // KotlinObject.INSTANCE.staticFunction();
        KotlinObject.staticFunction();

        KotlinClass.Companion.getNotStaticValue();
        KotlinClass.getStaticValue();
        KotlinClass.staticFunction();
        KotlinClass.Companion.staticFunction();
        KotlinClass.Companion.notStaticFucntion();
    }
}
