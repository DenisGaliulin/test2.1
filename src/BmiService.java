public class BmiService {

    public double calculate(double meters, double kg) {
        double bodyIndex;
        bodyIndex = kg / (meters * meters);

        bodyIndex = (int) bodyIndex;

        return bodyIndex;
    }
}


