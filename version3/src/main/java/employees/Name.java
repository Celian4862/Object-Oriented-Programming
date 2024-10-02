package employees;

public class Name {
    private String fname;
    private String mname;
    private String lname;

    public Name() {}

    public Name(String lname) {
        this.lname = lname;
    }

    public Name(String lname, String fname) {
        this.fname = fname;
        this.lname = lname;
    }

    public Name(String lname, String fname, String mname) {
        this.lname = lname;
        this.fname = fname;
        this.mname = mname;
    }

    public void setName(String lname, String fname, String mname) {
        this.lname = lname;
        this.fname = fname;
        this.mname = mname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getFname() {
        return fname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getMname() {
        return mname;
    }

    public char getMnameInitial() {
        return mname.charAt(0);
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getLname() {
        return lname;
    }

    public void displayName() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
            .append(fname).append(" ")
            .append((getMname() == null) ? "" : getMname().charAt(0))
            .append(lname).append("\n");
        return sb.toString();
    }
}
