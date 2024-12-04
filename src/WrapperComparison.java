public class WrapperComparison {
    public static void main(String[] args) {
        // Typ podstawowy i wrapper dla int
        int number = 10;
        Integer numberWrapper = number;
        System.out.println("Czy wartości int i Integer są równe? " + (number == numberWrapper));

        // Typ podstawowy i wrapper dla double
        double decimal = 5.5;
        Double decimalWrapper = decimal;
        System.out.println("Czy wartości double i Double są równe? " + (decimal == decimalWrapper));

        // Typ podstawowy i wrapper dla boolean
        boolean flag = true;
        Boolean flagWrapper = flag;
        System.out.println("Czy wartości boolean i Boolean są równe? " + (flag == flagWrapper));
    }
}