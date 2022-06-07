package activities;
import java.util.ArrayList;
import java.util.List;

public class LambdaExample{
    public static void main(String[] args) {
        // Create a ArrayList
        List<String> Lambdalist=new ArrayList<String>();
        // Add values to the list
        Lambdalist.add("Ricky");
        Lambdalist.add("Logos");
        Lambdalist.add("Daryl");
        Lambdalist.add("Glenn");
        Lambdalist.add("Carl");

        // Loop through ArrayList
        Lambdalist.forEach(
                // lambda expression
                (names)->System.out.println(names)
        );
    }
}