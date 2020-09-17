package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ITelephone timsPhone;
        timsPhone = new DeskPhone(123456);
        timsPhone.powerOn();
        timsPhone.callPhone(123456);
        timsPhone.answer();

        timsPhone = new Mobilephone(234567);
        //timsPhone.powerOn();
        timsPhone.callPhone(234567);
        timsPhone.answer();
    }
}
