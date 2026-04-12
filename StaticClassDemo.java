public class StaticClassDemo {
    public static void main(String[] args) {
        StaticClassDemo.A a1 = new StaticClassDemo.A(3);
        System.out.println("a1 = A [value = " + a1.getValue() + "]");
    }
    static class A {
        private int value;
        public A(){}
        public A(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
    }
}
