public class Lottery {
    private int lotteryNumber;
    private int lotteryNumber1;
    private int lotteryNumber2;
    private int lotteryNumber3;
    private int lotteryNumber4;
    private int lotteryNumber5;
    private int lotteryNumber6;
    private int lotteryNumber7;
    private int lotteryNumber8;
    private int lotteryNumber9;
    private int lotteryNumber10;
    private int number1;
    private int number2;
    private int number3;
    private int number4;
    private int number5;
    private int number6;
    private int number7;
    private int number8;
    private int number9;
    private int number10;






    public Lottery() {
        lotteryNumber1 = (int) (Math.random() * 10 + 1);
        lotteryNumber2 = (int) (Math.random() * 10 + 1) * 10;
        lotteryNumber3 = (int) (Math.random() * 10 + 1) * 100;
        lotteryNumber4 = (int) (Math.random() * 10 + 1) * 1000;
        lotteryNumber5 = (int) (Math.random() * 10 + 1) * 10000;
        lotteryNumber6 = (int) (Math.random() * 10 + 1) * 100000;
        lotteryNumber7 = (int) (Math.random() * 10 + 1) * 1000000;
        lotteryNumber8 = (int) (Math.random() * 10 + 1) * 10000000;
        lotteryNumber9 = (int) (Math.random() * 10 + 1) * 100000000;
        lotteryNumber10 = (int) (Math.random() * 10 + 1) * 1000000000;
        lotteryNumber = lotteryNumber1 + lotteryNumber2 + lotteryNumber3 + lotteryNumber4 +
                lotteryNumber5 + lotteryNumber6 + lotteryNumber7 + lotteryNumber8 +
                lotteryNumber9 + lotteryNumber10;
    }
    public boolean zeroChecker(int checkedNumber){
        if (digitExtractor(checkedNumber, 1) == 0 || digitExtractor(checkedNumber, 1) == 0 ||
                digitExtractor(checkedNumber, 1) == 0 ||
                digitExtractor(checkedNumber, 1) == 0 ||
                digitExtractor(checkedNumber, 1) == 0 ||
                digitExtractor(checkedNumber, 1) == 0 ||
                digitExtractor(checkedNumber, 1) == 0 ||
                digitExtractor(checkedNumber, 1) == 0 ||
                digitExtractor(checkedNumber, 1) == 0 ||
                digitExtractor(checkedNumber, 1) == 0) {
            return true;
        }
        return false;
    }

    public static int digitExtractor (int userNumber, int digitPlacement) {
        //Digit placment reffers to the digits placment in the number, for instance 3 in the number 65432165 would be 1
        int returnNumber = (userNumber % ((int)(Math.pow(10, digitPlacement)))
                / ((int)(Math.pow(10, digitPlacement - 1))) * ((int) (Math.pow(10, digitPlacement - 1))));
         return (returnNumber);
    }

    public void scoreCalculator (int userNumber) {
        int score;

       // if


    }

}
