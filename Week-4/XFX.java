import java.util.Scanner;
/**
 * Write a description of class XFX here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class XFX{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("XFX Cinema Ticket System");
        System.out.println("Enter age group (Child/Adult/Senior): ");
        String ageGroup = sc.nextLine();
        System.out.println("Enter movie language (Nepali/Hindi/English): ");
        String language = sc.nextLine();
        System.out.println("Do you have a student ID? (yes/no): ");
        String student = sc.nextLine();
        System.out.println("Is it a festival day? (yes/no): ");
        String festival = sc.nextLine();
        double price = 0;
        if(ageGroup.equalsIgnoreCase("Child")){
            price = 150;
        }
        
        
        else if(ageGroup.equalsIgnoreCase("Adult")){
            price = 250;
        }
        
        else if(ageGroup.equalsIgnoreCase("Senior")){
            price = 200;
        }
        

        if(language.equalsIgnoreCase("Hindi")){
            price += 50;
        }
        
        else if(language.equalsIgnoreCase("English")){
            price += 100;
        }

        if(student.equalsIgnoreCase("yes")){
            price = price - (price * 0.2);
        }

        if(festival.equalsIgnoreCase("yes")){
            price = price - (price * 0.15);
        }

        System.out.println("Final ticket price is: Rs " + price);
    }
}
