package com.company;

public class Main {
    public static void main(String[] args) {
        SmartPhoneFactory factorySam = new SamsungSmartPhoneFactory();

        SmartPhone smartPhoneSam = factorySam.createSmartPhone();

        smartPhoneSam.writeDesc();

        SmartPhoneFactory factoryHua = new HuaweiSmartPhoneFactory();

        SmartPhone smartPhoneHua = factoryHua.createSmartPhone();

        smartPhoneHua.writeDesc();
    }
}
