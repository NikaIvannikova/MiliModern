public class Main {
    public static void main(String[] args) {
        BonusMilesCalculate run = new BonusMilesCalculate();
        int resolt = run.calculate(10000);
        System.out.println(resolt);

        resolt = run.calculate(20000);
        System.out.println(resolt);

        resolt = run.calculate(50000);
        System.out.println(resolt);
    }


    }
