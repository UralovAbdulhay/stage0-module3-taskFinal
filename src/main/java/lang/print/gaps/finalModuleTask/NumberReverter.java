package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {

        int revertNum = number % 10;
        revertNum = revertNum * 10 + (number / 10) % 10;
        revertNum = revertNum * 10 + (number / 100) % 10;

        System.out.println(revertNum);

    }
}
