import java.util.function.BinaryOperator;
public class MethodReference{
    public static void main(String arg[]){
        BinaryOperator <Integer> max = Math::max;
        System.out.println("maximum of 25 and 56 is: "+max.apply(25, 56));

        BinaryOperator <Double> power = Math::pow;
        System.out.println("5 to the power 2.5 is: "+power.apply(5.0, 2.5));

        BinaryOperator <Integer> min = Math::min;
        System.out.println("minimum of 20 and 46 is: "+min.apply(20, 46));
    }
}