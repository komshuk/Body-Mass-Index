public class BmiService {
    public double calculate(int weight) {
        double height = 1.75;
        return weight / (height * height);
    }
}
