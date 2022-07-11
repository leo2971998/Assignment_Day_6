package Classes;
import java.util.*;
public class Contact {
    private String name;
    private String company;
    private String title;
    private String mobile;
    private String alternatemobile;
    private String email;

    public Contact() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAlternatemobile() {
        return alternatemobile;
    }

    public void setAlternatemobile(String alternatemobile) {
        this.alternatemobile = alternatemobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Contact(String name, String company, String title, String mobile, String alternatemobile, String email) {
        this.name = name;
        this.company = company;
        this.title = title;
        this.mobile = mobile;
        this.alternatemobile = alternatemobile;
        this.email = email;
    }

    public static Contact CreateContact(String detail) {
        String[] str = new String[6];
        str = detail.split(",");
        Contact C = new Contact(str[0], str[1], str[2], str[3], str[4], str[5]);
        return C;
    }

    @Override
    public String toString() {
        return String.format("%5s %20s %20s %20s %20s %20s",this.name,this.company,this.title,this.mobile,this.alternatemobile,this.email);
    }
}


