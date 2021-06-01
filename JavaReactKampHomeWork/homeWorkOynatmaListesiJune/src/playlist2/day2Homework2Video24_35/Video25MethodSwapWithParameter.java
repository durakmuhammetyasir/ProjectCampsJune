package playlist2.day2Homework2Video24_35;

public class Video25MethodSwapWithParameter {
    //PassByValue
    public static void main(String[] args){

        IntContainer k = new IntContainer(42);
        IntContainer q = new IntContainer(44);
        System.out.println("k = " + k.getValue() + "\nq = " + q.getValue());

        swap(k,q);
        System.out.println("k = " + k.getValue());
        System.out.println("q = " + q.getValue());
        int id = 57;
        /* #1 */
        System.out.println("@1 : " + id);
        increment(id);
        /* #4 */
        System.out.println("@4 : " + id);
    }
    static void increment(int num) {
        /* #2 */
        System.out.println("@2 : " + num);
        num = num + 2;
        System.out.println("@3 : " + num);
        /* #3 */

    }
    public static class IntContainer {
        private int value;
        public IntContainer(int value) {
            this.value = value;
        }
        public int getValue() {
            return value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    }
    static void swap(IntContainer a, IntContainer b) {
        IntContainer temp = new IntContainer(a.getValue());
        a.setValue(b.getValue());
        b.setValue(temp.getValue());
    }
}

    /*
    The following are a few of the commonly used mechanisms to pass parameters to a method:
    •	 Pass by value
    •	 Pass by constant value
    •	 Pass by reference
    •	 Pass by reference value
    •	 Pass by result
    •	 Pass by result value
    •	 Pass by name
    •	 Pass by need
    */

