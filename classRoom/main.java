package classRoom;
class MaxOfThree {
    public static void main(String[] args) {

        int a = 5, b = 10, c = 7;

        int max = (a > b) 
                    ? ((a > c) ? a : c) 
                    : ((b > c) ? b : c);

        System.out.println("Maximum value is: " + max);
    }
}
