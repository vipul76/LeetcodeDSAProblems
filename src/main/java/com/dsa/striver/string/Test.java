package com.dsa.striver.string;

public class Test {

    private  int num;

    public Test(int num){
        this.num = num;
    }

    public static void main(String[] args) {

        Test test = new Test(15);
        test.num =16;
        System.out.println(test.num);

    }
}
