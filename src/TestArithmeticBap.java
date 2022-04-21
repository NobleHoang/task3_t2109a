public class TestArithmeticBap {
    public static void main(String[] args){
        int number1 = 69;
        int number2 = 8;
        int sum, difference, product, quotient, remainder;
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;
        System.out.println("The sum, difference, product, quotient, remainder of "+ number1 +" and: " + number2 + " are "
                + sum + ", "+difference + ", "+ product +", " + quotient + ", " + remainder);

        ++number1;
        --number2;
        product = number1*number2;

        System.out.println("The new number1 is: "+ number1);
        System.out.println("The new number2 is: "+ number2);
        System.out.println("The new product of " +number1 +" and " + number2 +" is " +product);

        System.out.println("Enter to finish...");
    }
}

