package main.java.com.Max_Kiriyak.AdditionalExamples.NestedClasses;

public class NestedAnonymous {
    NestedAnonymous () {}
    void method() {
        System.out.println("method of NestedAnonymous object");
    }

    public static void main(String[] args) {
        NestedAnonymous outer = new NestedAnonymous(){
            {
            super.method();
            method();
            nmethod();
            }
            @Override
            void method() {
                System.out.println("method of anonymous class");
            }
            void nmethod() {
                System.out.println("nmethod of anonymous class");
            }
        };
        outer.method();
    }
}
