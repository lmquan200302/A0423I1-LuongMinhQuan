package com.example.caculator.Service;

import com.example.caculator.Model.Caculatorl;

public class CaculatorServiceImp implements CaculatorService{
    @Override
    public void cong(Caculatorl caculatorl) {
        double result = caculatorl.getNum1() + caculatorl.getNum2();
    }

    @Override
    public void tru(Caculatorl caculatorl) {
        double result = caculatorl.getNum1() - caculatorl.getNum1();

    }

    @Override
    public void nhan(Caculatorl caculatorl) {
        double result = caculatorl.getNum1() * caculatorl.getNum2();

    }

    @Override
    public void chia(Caculatorl caculatorl) {
        double result = caculatorl.getNum1() / caculatorl.getNum2();

    }


}
