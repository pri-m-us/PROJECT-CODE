import java.util.Scanner;
class Male{
    String Name;
    String Voice;
    String Gender;
    void DisplayMale() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name");
        Name = sc.nextLine();
        System.out.println("enter voice");
        Voice = sc.nextLine();
        System.out.println("enter gender");
        Gender = sc.nextLine();
        System.out.println("name:" + Name);
        System.out.println("voice:" + Voice);
        System.out.println("gender:" + Gender);
    }

}





