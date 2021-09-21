public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 60;
        double index = service.calculate(weight);
        System.out.println(index);
    }
}
