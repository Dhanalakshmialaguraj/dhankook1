public class ArmstrongNumber {
    public static void main(String[] args) {
        
        int lowerLimit = 1;
        int upperLimit = 1000;

        
        for (int number = lowerLimit; number < upperLimit; number++) {
            
            int numOfDigits = String.valueOf(number).length();
            int sum = 0;
            int originalNumber = number;

        
            while (number != 0) {
                int digit = number % 10;
                sum += Math.pow(digit, numOfDigits);
                number /= 10;
            }

            
            if (sum == originalNumber) {
                System.out.println(originalNumber + " is an Armstrong number.");
            }

            
            number = originalNumber;
        }
    }
}

