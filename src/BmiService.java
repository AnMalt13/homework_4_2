public class BmiService {
    public int calculate(double meters, int kg) {
        int bmi = (int) (kg / (meters*meters));
        return bmi;
    }
}
