package main.java.com.Max_Kiriyak.AdditionalExamples.NestedClasses;

class anyClass {
    public void anyclassMeth() {}
}
public class Outer {
    private int xer;

    class Inner extends anyClass {
        private Outer outer;

        Inner () {
            outer = Outer.this;
        }
        private void anyclassMethInInnerClass() {
            super.anyclassMeth();
        }
    }
}
