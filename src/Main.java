import java.util.Scanner;


public class Main
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        String indet;

        // TODO: F to C conversion
        //  Ask user for temp in F. Read it in. Convert to C. Display output.
        System.out.println("Let's convert temperature!");
        System.out.print("What's the temperature in Fahrenheit? ");

        indet = reader.nextLine();
        float Temp_F = Float.parseFloat(indet);

        Float Temp_C = (Temp_F - 32.0f) / 1.0f; //conversion
        System.out.println("That's " + (String.format("%.2f", Temp_C)) + " Celsius\n");

        // TODO: compute height of building
        //  Assume 20ft away. Ask how tall. Ask for angle of elevation.
        //  Compute height of building using Math.tan(). Display output.


        System.out.println("Let's roughly compute the height of a building.");
        System.out.println("Assume you are standing 20ft away.");
        System.out.print("How tall are you (ft)? ");

        indet = reader.nextLine();
        Float Height = Float.parseFloat(indet);

        System.out.print("Looking at the top, what is the angle of elevation (in deg)? ");
        indet = reader.nextLine();
        float Deg = Float.parseFloat(indet);
        double Var = Math.toRadians(Deg);
        double result = (20 * Math.tan(Var)) + Height; //Conversion = 20 * Tan(Deg) = Height of building

        String p1 = String.format("%.2f", result);
        String p2 = String.format("%.2f", (result/3.2808));
        System.out.println("The Building is roughly " + p1 + "ft (" + p2 + "m) tall\n");

        // TODO: compute probability of coveted loot.
        //  Ask for drop rate as percentage. Convert to fraction (divide by 100).
        //  Ask how many runs. Compute probability w/ formula provided.
        System.out.println("Let's compute probability of dropped loot.");
        System.out.print("What is the drop rate (%) of the loot you want? ");

        indet = reader.nextLine();
        float drop_rate = Float.parseFloat(indet);

        System.out.print("How many times do you plan on defeating the mod? ");
        indet = reader.nextLine();
        int defeats = Integer.parseInt(indet);
        double failrate = 1 - (Math.pow(1 - drop_rate, defeats));
        p1 = String.format("%.2f", failrate * 100);
        System.out.println("The probability of getting the loot in " + defeats + " runs is " + p1 + "%");

    }
}
