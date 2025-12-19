public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double meters = 1.87;
        double kg = 98;
        double bodyIndex = service.calculate(meters, kg);
        System.out.println("Индекс Массы Тела: " + bodyIndex);
    }
}