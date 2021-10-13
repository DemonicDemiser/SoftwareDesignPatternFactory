package com.company;

public class HuaweiSmartPhoneFactory implements SmartPhoneFactory{
    @Override
    public SmartPhone createSmartPhone() {
        return new Huawei();
    }
}
