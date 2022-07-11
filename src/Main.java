import java.util.*;
import Classes.*;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the group name:");
        List<Contact> L = new ArrayList<Contact>();
        Group G = new Group(sc.nextLine(), L);
        int num = 0;

        do {
            System.out.println("1.Add Contact");
            System.out.println("2.Delete Contact");
            System.out.println("3.Display Contacts");
            System.out.println("4.Exit");
            System.out.println("Enter your choice:");
            num = sc.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Enter the number of contacts");
                    int n = sc.nextInt();
                    sc.nextLine();
                    for(int i = 0; i < n; i++) {
                        G.getContactList().add(Contact.CreateContact(sc.nextLine()));
                    }
                    break;
                case 2:
                    System.out.println("Enter the name of the contact to be deleted: ");
                    String name = sc.next();
                    if (G.RemoveContactFromGroup(name)) {
                        System.out.println("Contact successfully deleted");;
                    }
                    else {
                        System.out.println("Contact not found in the group");
                    }
                    break;
                case 3:
                    System.out.println(String.format("%5s %20s %20s %20s %20s %20s","Name","Company","Title","Mobile","AlternateMobile","Email"));
                    G.DisplayContacts();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (num != 4);

    }
}