public class ArithmeticTest {
    public static void main(String[] args){
        int number1 = 69;
        int number2 = 8;
//
        int sum, difference, product, quotient, remainder;
        sum = number1 + number2;
        difference = number1 - number2;
        product = number1 * number2;
        quotient = number1 / number2;
        remainder = number1 % number2;
        System.out.print("The sum, difference, product, quotient, remainder of ");
        System.out.print(number1);
        System.out.print(" and ");
        System.out.print(number2);
        System.out.print(" are: ");
        System.out.print(sum);
        System.out.print(", ");
        System.out.print(difference);
        System.out.print(", ");
        System.out.print(product);
        System.out.print(", ");
        System.out.print(quotient);
        System.out.println(remainder);
        ++number1;
        --number2;
        product = number1*number2;
        System.out.println("The new number1 is: "+ number1);
        System.out.println("The new number2 is: "+ number2);
        System.out.println("The new product of " +number1 +" and " + number2 +" is " +product);
        System.out.println("Enter to finish...");
    }
}
