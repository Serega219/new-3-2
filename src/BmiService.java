public class BmiService {
    public int calculate(double weight, double heightInM) {
        double index = weight / (heightInM * heightInM);
        return (int) index;
    }
}
