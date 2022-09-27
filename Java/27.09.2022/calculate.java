class Calculator {
    public void calculate(int x, int y) {
        System.out.println(x + y);
    }

    public void calculate(float x, int y) {
        System.out.println(x / y);
    }

    public void calculate(int x, int y, int z) {
        System.out.println(x * y * z);
    }
}

class calculate {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.calculate(2,3);
        calculator.calculate(1.0f,2);
        calculator.calculate(10,20,20);
    }
}