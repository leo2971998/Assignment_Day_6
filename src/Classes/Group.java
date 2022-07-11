package Classes;

import java.util.List;

public class Group {
    private String name;
    private List<Contact> contactList;
    public Group() {
        contactList = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public Group(String name, List<Contact> contactList) {
        this.name = name;
        this.contactList = contactList;
    }

    public void AddContactToGroup(Contact contact) {
        this.contactList.add(contact);
    }
    public boolean RemoveContactFromGroup(String name) {
        boolean flag = false;
        for(int i = 0; i < contactList.size(); i++) {
            if (contactList.get(i).getName().contains(name)) {
                contactList.remove(i);
                flag = true;
            }
        }
        return flag;
    }

    public void DisplayContacts() {
        if (this.contactList.isEmpty()) {
            System.out.println("No contact to show");
        }
        else {
            for(int i = 0; i < this.contactList.size(); i++) {
                System.out.println(contactList.get(i).toString());
            }
        }
    }
}
