package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public static void calculateSum(int number) {
        int result = 0;
        for (int i = 0; i <= number; i++) {
            System.out.println(i);
        }
        System.out.println(result);
    }
    public static void main(String[] args){
        calculateSum(2345);
    }

}
