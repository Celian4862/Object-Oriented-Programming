package Version_1;

public class PieceWorkerEmployee {
    private int totalPiecesFinished;
    private double ratePerPiece;
    private String empName;
    private int empID;

    public PieceWorkerEmployee() {}

    public PieceWorkerEmployee(int totalPiecesFinished, double ratePerPiece, String empName, int empID) {
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
        this.empName = empName;
        this.empID = empID;
    }

    public void setFinishedPieces (int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public int getFinishedPieces () {
        return this.totalPiecesFinished;
    }

    public void setRate (double ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    public double getRate() {
        return this.ratePerPiece;
    }

    public void setName (String name) {
        this.empName = name;
    }

    public String getName () {
        return this.empName;
    }

    public void setID(int id) {
        this.empID = id;
    }

    public int getID() {
        return this.empID;
    }

    public double computeSalary() {
        double salary = totalPiecesFinished * ratePerPiece;
        salary += ((int) totalPiecesFinished / 100) * (10 * ratePerPiece);
        return salary;
    }

    public void displayHourlyEmployee() {
        System.out.println("Employee ID: " + empName);
        System.out.println("Employee name: " + empID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Total hours worked: ").append(this.totalPiecesFinished).append("\n");
        sb.append("Rate per hour: ").append(this.ratePerPiece).append("\n");
        sb.append("Employee name: ").append(this.empName).append("\n");
        sb.append("Employee ID: ").append(this.empID).append("\n");
        return sb.toString();
    }
}