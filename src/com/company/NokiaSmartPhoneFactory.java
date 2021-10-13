package com.company;

public class NokiaSmartPhoneFactory implements SmartPhoneFactory{
    @Override
    public SmartPhone createSmartPhone() {
        return new Nokia();
    }
}
