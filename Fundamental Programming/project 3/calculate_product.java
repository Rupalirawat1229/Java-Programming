public class calculate_product {
    public static void main(String[] args) {
        int product = 1;
        int number = 1;

        while (number <= 5) {
            product *= number;
            number++;
        }

        System.out.println("Product of numbers from 1 to 5: " + product);
    }
}

