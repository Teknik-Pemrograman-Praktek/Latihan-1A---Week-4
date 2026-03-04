import java.util.Scanner;

public class WeeklySales {
    public static void main(String[] args) {
        // deklarasi
        Salesperson[] salesList;
        int size;
        Scanner scan = new Scanner(System.in);

        // tanya jumlah salesnya
        System.out.print("\nEnter number of people: ");
        size = scan.nextInt();
        salesList = new Salesperson[size];

        System.out.println ("\nEnter the numbers...");

        // input data tiap sales person
        for (int i = 0; i < size; i++) {
            System.out.print("Enter first name: ");
            String firstName = scan.next();

            System.out.print("Last name: ");
            String lastName = scan.next();

            System.out.print("Enter total sales: ");
            int totalSales = scan.nextInt();

            salesList[i] = new Salesperson(firstName, lastName, totalSales);
        }


        // sort dan print
        Sorting.insertionSort(salesList);
        System.out.println ("\nRanking of Sales for the Week\n");
        for (Salesperson s : salesList)
            System.out.println (s);
    }
}