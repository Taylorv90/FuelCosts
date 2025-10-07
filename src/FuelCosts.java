import java.util.Scanner;
public class FuelCosts
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double tankSize = 0.0;
        double mpg = 0.0;
        double pricePerGal = 0.0;
        double miles100cost = 0.0;
        double fullTankDistance = 0.0;


        boolean done = false;
        String trash = " ";

        do
        {
            System.out.print("Enter tank size: ");
            if(in.hasNextDouble())
            {
                tankSize = in.nextDouble();
                in.nextLine();
                if(tankSize <= 0)
                {
                    System.out.println("Tank size needs to be greater than 0");
                }else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " please entre a valid input");
            }
        }while(!done);

        done = false;

        do
        {
            System.out.print("Enter the miles per gallon: ");
            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                if(mpg <= 0)
                {
                    System.out.println("Miles per gallon needs to be greater than 0");
                }else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " please entre a valid input");
            }
        }while(!done);

        done = false;

        do
        {
            System.out.print("Enter the price per gallon: ");
            if(in.hasNextDouble())
            {
                pricePerGal = in.nextDouble();
                in.nextLine();
                if(pricePerGal <= 0)
                {
                    System.out.println("Price per gal needs to be greater than 0");
                }else
                {
                    done = true;
                }
            }
            else
            {
                trash = in.nextLine();
                System.out.println("Illegal number: " + trash + " please entre a valid input");
            }
        }while(!done);

        //  double miles100cost = 0.0;
        //  double fullTankDistance = 0.0;

        miles100cost = (100/mpg)*pricePerGal;
        fullTankDistance = tankSize * mpg;

        System.out.printf("The cost to drive 100 miles is $%.2f\n", miles100cost);
        System.out.printf("The distance that can be driven on a full tank is " + fullTankDistance);

    }
}
