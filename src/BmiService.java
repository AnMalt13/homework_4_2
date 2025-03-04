public class BmiService {
    public double calculate(double meters, int kg) {
        double bmi = kg / (meters*meters);
        return bmi;
    }
}
