public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meters = 1.87;
        int kg = 98;
        int bmi = service.calculate(meters, kg);
        System.out.println(bmi);
    }
}
