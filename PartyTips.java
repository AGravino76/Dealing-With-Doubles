import java.util.Scanner;
public class TaskB
{
    public static void main(String[] args)
    {
        //Initialize the stuff
        Scanner keyboard = new Scanner(System.in);
        double priceInitial;
        double priceTipped;
        double priceTaxed;
        double priceFinal;
        int partySize;
        
        //Take the amount of money needed, take the number of people 
        System.out.print("How large was the party? ");
        partySize = keyboard.nextInt();
        
        System.out.print("How much was your order? ");
        priceInitial = keyboard.nextDouble();
        
        //Multiply the amounts by the tip, then that by the tax
        priceTipped = priceInitial*.20;
        priceTaxed = priceInitial*.0725;
        
        //Add them all up
        priceFinal = priceTipped + priceTaxed + priceInitial;

        //Result
        System.out.println("Your total pay including tax and tip is $" + priceFinal + ".");
        System.out.println("Splitting among " + partySize + " people, each person should pay $" 
        + priceFinal/partySize);
    }
}
