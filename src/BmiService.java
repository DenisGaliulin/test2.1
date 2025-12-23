public class BmiService {

    public double calculate(double meters, double kg) {
        int bodyIndex;
        bodyIndex = (int) (kg / (meters * meters));

        return bodyIndex;
    }
}


