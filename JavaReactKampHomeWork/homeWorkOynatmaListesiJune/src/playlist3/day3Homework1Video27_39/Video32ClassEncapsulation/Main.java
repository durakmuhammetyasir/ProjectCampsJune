package playlist3.day3Homework1Video27_39.Video32ClassEncapsulation;



public class Main {
    public static void main(String[] args) {
        OuterClass myOuter1 = new OuterClass();
        OuterClass.InnerClass myInner1 = myOuter1.new InnerClass();
        System.out.println(myInner1.myInnerMethod());

        OuterClass1.InnerClass myInner2 = new OuterClass1.InnerClass();
        System.out.println(myInner2.y);

        OuterClass2 myOuter2 = new OuterClass2();
        OuterClass2.InnerClass myInner3 = myOuter2.new InnerClass();
        System.out.println(myInner3.y + myOuter2.x);
    }
}