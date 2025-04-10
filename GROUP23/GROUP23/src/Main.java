import java.util.Scanner;
class human {
    String Name;
    String Gender;
    String Voice;

    public static void main(String[] args) {
        Male omale = new Male();
        Female ofemale = new Female();
        human ohuman = new human();
        int choice;
        Scanner SC = new Scanner(System.in);
        System.out.println(" 2 choices \n 1:male \n 2:female");
        System.out.println("enter your choice");
        choice = SC.nextInt();
        switch (choice) {
            case 1:
                System.out.println("choice is male");
                omale.DisplayMale();
                break;
            case 2:
                ofemale.DisplayFemale();
                break;

        }
    }
}





