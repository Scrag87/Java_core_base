package java_core.lesson7;

public class InnerClassFabric {
    private int a;

    static public InnerClass1 getInnerClass1Instance(int a) {
        return new InnerClass1(a);
    }

    static public InnerClass2 getInnerClass2Instance(int a) {
        return new InnerClass2(a);
    }

    public static void main(String[] args) {


        InnerClass1 instance = InnerClassFabric.getInnerClass1Instance(1);
    }

    private static class InnerClass1 {
        int b;

        public InnerClass1(int b) {
            this.b = b;
        }
    }

    private static class InnerClass2 {
        int b;

        public InnerClass2(int b) {
            this.b = b;
        }
    }

}
