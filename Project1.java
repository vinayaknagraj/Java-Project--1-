import java.util.*; //importing packages

public class Project { // class creation

    private double assessment_value_percent;

    // constructor to intialize variables
    public Project(double assessment_value_percent) {
        this.assessment_value_percent = assessment_value_percent; // "this" to refer to instance variable
                                                                  // variable
    }

    // method that returns double data type
    public double property() {
        return assessment_value_percent;
    }

    public static double property_value = 0; // global variables declared as a public static
    public static double assessment_value = 0; // global variables declared as a public static

    public static void main(String[] args) { // method/function creation

        var takeinput = new Scanner(System.in); // Scanner Class
        String[] nameSurname = new String[2]; // Array Creation to take name
        System.out.print("Enter your name: ");
        nameSurname[0] = takeinput.nextLine();
        System.out.print("Enter your surname: ");
        nameSurname[1] = takeinput.nextLine();
        System.out.print("Enter your roll number: ");
        System.out.print("The Roll Number shall be above zero ");
        int rollno = 0;
        rollno = takeinput.nextInt();

        // if-else statement
        if (rollno > 0) {
            System.out.println("You Are Allowed To Proceed Ahead ");
        }

        else {
            System.out.println("Enter Roll Number Above 0 ");
        }

        // creating loop for displaying name
        for (int i = 0; i < 1; i++) {
            System.out.println("Your Full Name Is " + nameSurname[i] + " " + nameSurname[i + 1]);
        }

        Project obj = new Project(60 / 100); // instance of the object being created
        double property_tax = 0; // static variables

        System.out.println("Enter the property's actual value:"); // Print Statement
        property_value = takeinput.nextDouble(); // Accepting values from user Scanner Class
        System.out.println("Enter the property's actual value entered is: Rs " + property_value);
        assessment_value = property_value * obj.assessment_value_percent; // instance of the method being called
        System.out.println("The Assessment Value is: RS " + assessment_value);
        property_tax = assessment_value * 0.0064;
        System.out.println("The Property Tax is: Rs " + property_tax);
        myMethod("Our Names - Vinayak Nagaraj, Aryajit Dutta, Luke Issac");
        myMethod(36.0, 09.0, 55.0);

    }

    // method overloading with different parameters
    public static void myMethod(String str) {
        System.out.println(str);
    }

    public static void myMethod(double prn1, double prn2, double prn3) {
        System.out.println("Our Respective Roll Number is " + prn1 + " " + prn2 + " " + prn3);
    }
}