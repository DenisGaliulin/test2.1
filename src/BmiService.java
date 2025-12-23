public class BmiService {

    public int calculate(double meters, double kg) {

        double bodyIndex =  kg / (meters * meters);

        return  (int) bodyIndex;
    }
}


