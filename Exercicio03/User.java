package Exercicio03;

public class User {

    private String Fname;
    private String Lname;

    public void SetFname(String Fname) {

        this.Fname = Fname.toUpperCase();
    }

    public String getFname() {
        return Fname;
    }

    public void SetLname(String Lname) {

        this.Lname = Lname.toUpperCase();
    }

    public String getLname() {
        return Lname;
    }
}
