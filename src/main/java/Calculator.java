public class Calculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        System.out.println(cal.add(1, 3));
        System.out.println(cal.subtract(1, 3));
        System.out.println(cal.multiple(1, 3));
        System.out.println(cal.divide(1, 3));
    }

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiple(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}
