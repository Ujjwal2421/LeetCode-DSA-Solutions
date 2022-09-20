package StackPractise;

import java.util.Random;

public class OTP {
    static char[] otp(int len){
        System.out.println("Generating OTP using Random Number");
        System.out.println("Your OTP is");;
        String number="1234567890";
        Random random=new Random();
        char[] otp=new char[len];
        for (int i = 0; i < len; i++) {
            otp[i]=number.charAt(random.nextInt(number.length()));
        }
        return otp;
    }
    public static void main(String[] args) {
        int len=4;
        System.out.println(otp(len));
    }
}
