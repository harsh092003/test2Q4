public class test4 {
    public static void main(String[] args) {
        int num1 = 78;
        System.out.println(" your first number is "+ num1);
       int num2 =89;
        System.out.println(" your second number is "+num2);
        int num3 = 99;
        System.out.println(" your third number is "+num3);
        
        int largestNo;

        if (num1 >= num2) {
            if (num1 >= num3) {
                largestNo = num1;
            } else {
                largestNo = num3;
            }
        } else {
            if (num2 >= num3) {
                largestNo = num2;
            } else {
                largestNo = num3;
            }
        }

        System.out.println("The largest number is: " + largestNo);
    }
}


