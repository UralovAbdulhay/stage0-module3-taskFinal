package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        sum += number % 10;
        sum += (number / 10) % 10;
        sum += (number / 100) % 10;
        sum += (number / 1000) % 10;
        System.out.println(sum);
    }
}
