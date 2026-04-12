public class CustomerID{
    static int count =0;
    int id;
    CustomerID(){
        count++;
        id = count;
    }

    void displayID(){
        System.out.println("Customer ID: " + id);
    }

// class Main {
    public static void main(String[] args) {
        CustomerID c1 = new CustomerID();
        CustomerID c2 = new CustomerID();
        CustomerID c3 = new CustomerID();
        c1.displayID();
        c2.displayID();
        c3.displayID();
        
    }   
}