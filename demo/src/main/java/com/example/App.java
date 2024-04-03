package com.example;

public class App {
    public Integer count(int value) {
        int res = 0;
        if (value < 0)
            res = -1;
        else
            res = value / 6 + (value % 6 > 0 ? 1 : 0);
        return res;
    }
}
