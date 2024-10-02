package employees;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date() {}

    public Date(int year) {
        this.year = year;
    }

    public Date(int year, int month) {
        this.month = month;
        this.year = year;
    }

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String getDate() {
        return year + "." + month + "." + day;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getMonth() {
        return month;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder()
            .append(getYear()).append(".")
            .append(getMonth()).append(".")
            .append(getDay());
        return sb.toString();
    }
}
