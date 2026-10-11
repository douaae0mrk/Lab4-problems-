package problem1;
import java.util.Scanner;
public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of sales people :  ");
        int SALESPEOPLE = scan.nextInt();
        int[] sales = new int[SALESPEOPLE];
        int sum;
        for (int i=0; i<sales.length; i++)
        {
            System.out.print("Enter sales for salesperson " + (i+1) + ": ");
            sales[i] = scan.nextInt();
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        int max_sale= 0;
        int max_sale_id = 0 ;
        int min_sale=-1 ;
        int min_sale_id=0  ;
        for (int i=0; i<sales.length; i++)
        {
            System.out.println(" " + (i+1)+ " " + sales[i]);
            sum += sales[i];
            if (sales[i]>max_sale){
                max_sale= sales[i];
                max_sale_id = i ;
            }
            if(min_sale== -1){
                min_sale= sales[i];
                min_sale_id=i;
            }
            if (sales[i]<min_sale){
                min_sale= sales[i];
                min_sale_id = i ;
            }
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sale: " + sum/SALESPEOPLE);
        System.out.println("\nSalesperson : "+ (max_sale_id+1)+ " had the highest sale with  $" + max_sale);
        System.out.println("\nSalesperson : "+ (min_sale_id+1) + " had the lowest sale with  $" + min_sale);
        System.out.print("Enter a value : ");
        int value = scan.nextInt();
        int sales_exceeded = 0 ;
        for (int i=0; i<sales.length; i++) {
            if (sales[i]>=value){
                System.out.println(" " + (i+1) + " " + sales[i]);
                sales_exceeded+=1;
            }

        }
        System.out.println("The total number of salespeople whose sales exceeded the value entered : " + sales_exceeded);

    }
}