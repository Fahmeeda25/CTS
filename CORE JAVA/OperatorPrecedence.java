public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        System.out.println("Result 1 (10 + 5 * 2): " + result1);

        int result2 = (10 + 5) * 2;
        System.out.println("Result 2 ((10 + 5) * 2): " + result2);

        int result3 = 20 - 8 / 2 + 3;
        System.out.println("Result 3 (20 - 8 / 2 + 3): " + result3);

        int result4 = 10 + 6 % 4;
        System.out.println("Result 4 (10 + 6 % 4): " + result4);
    }
}
