import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.regex.Pattern;

public class ContributorManager {
    
    public static void main(String [] args) {
        Scanner inputFile = null;
        String name = null;
        String city = null;
        String country = null;
        String phone = null;
        double contribution = 0;
        int id = 0;
        Contributor c = null;
        Stack stack = new Stack();
        Node node = null;
        
        //open contributors file
        try {
            inputFile = new Scanner(new File("contributors.csv"));
            inputFile.useDelimiter(Pattern.compile("(\\n)|(\\r)|,"));
        }
        catch (FileNotFoundException e) {
            System.err.println("Error opening file.");
        }
 
        //create contributors object for each row, and add to the stack
        while (inputFile.hasNext()) {
            name = inputFile.next();
            city = inputFile.next();
            country = inputFile.next();
            phone = inputFile.next();
            contribution = inputFile.nextDouble();
            id = inputFile.nextInt();
            inputFile.nextLine(); //advance to the next line
            
            c = new Contributor(name, city, country, phone, contribution, id); 
            node = new Node(c); //create a node using the contributor object
            stack.push(node); //add the node to the top of the stack
        }
        
        stack.pop(); //remove the last node from the top of the stack
              

        stack.print(); //print the contents of the entire stack
    }
}
