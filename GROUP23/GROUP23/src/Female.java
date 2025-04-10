import java.util.Scanner;
class Female{
    String Name;
    String Voice;
    String Gender;
    void DisplayFemale() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        Name = sc.nextLine();
        System.out.println("enter your voice");
        Voice = sc.nextLine();
        System.out.println("enter your  gender");
        Gender = sc.nextLine();
        System.out.println("name:" + Name);
        System.out.println("voice:" + Voice);
        System.out.println("gender:" + Gender);
    }

}





