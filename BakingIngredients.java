import java.util.Scanner;
public class TaskA
{
    public static void main(String[] args)
    {
        //Initialize counts and divide
        //24 shortbread using 125g butter or 4oz
        //55g sugar or 2oz
        //180g plain flour or 6oz
        int shortbreadCount;
        double butterCountG = 125.0/24.0, sugarCountG = 55.0/24.0, flourCountG = 180.0/24.0;
        double butterCountO = 4.0/24.0, sugarCountO = 2.0/24.0, flourCountO = 6.0/24.0;
        
        //Scanner object
        Scanner keyboard = new Scanner(System.in);
        
        //Asks for shortbread amount
        System.out.print("How many shortbread do you want to make? ");
        shortbreadCount = keyboard.nextInt();
        
        //Result
        System.out.println("Here is how much you need in grams; Butter: " + butterCountG*shortbreadCount + 
        "g, Sugar: " + sugarCountG*shortbreadCount + "g, Flour: " + flourCountG*shortbreadCount + "g.");
        System.out.println("And here is how much you need in ounces; Butter: " + butterCountO*shortbreadCount + 
        "oz, Sugar: " + sugarCountO*shortbreadCount + "oz, Flour: " + flourCountO*shortbreadCount + "oz.");
    }
}
