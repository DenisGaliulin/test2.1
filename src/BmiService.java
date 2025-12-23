public class BmiService {

    public double calculate(double meters, double kg) {
        double bodyIndex;
        bodyIndex =  (kg / (meters * meters));

        return  (int) bodyIndex;
    }
}


