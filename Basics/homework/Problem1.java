import java.util.Scanner;
class Problem1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        char favLetter = sc.next().charAt(0);
        boolean JavaLove = true;
        double priceOfCoffee = sc.nextInt();
        System.out.println("My name is "+name+" ,"+ "I am "+age +" years old" + " , "+ "and it is "+JavaLove+ " that i Love Java.");


    }
}