public class ReverseString {
    public static void main(String[] args) {
        String st1 = "Hello";
        StringBuilder sb1 =  new StringBuilder(st1);
        sb1.reverse();
        System.out.print(sb1.toString());  
    }
}