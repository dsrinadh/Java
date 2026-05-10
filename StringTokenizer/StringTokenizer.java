import java.util.StringTokenizer;

public class BankingApplication {
    public static void main(String[] args) {

        // Transaction record
        String transaction =
        "TX123,Name,5000,Deposit,2025-04-01";

        // Using StringTokenizer
        StringTokenizer st = new StringTokenizer(transaction, ",");

        // Extracting details
        String transactionId = st.nextToken();
        String customerName = st.nextToken();
        String amount = st.nextToken();
        String transactionType = st.nextToken();
        String date = st.nextToken();

        // Displaying details
        System.out.println("Transaction ID : " + transactionId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Amount         : ₹" + amount);
        System.out.println("Transaction Type : " + transactionType);
        System.out.println("Date           : " + date);
    }
}
