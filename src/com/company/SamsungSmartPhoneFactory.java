package com.company;

public class SamsungSmartPhoneFactory implements SmartPhoneFactory{
    @Override
    public SmartPhone createSmartPhone() {
        return new Samsung();
    }
}
