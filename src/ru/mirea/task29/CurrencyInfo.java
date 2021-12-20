package ru.mirea.task29;

import java.io.Serializable;

public class CurrencyInfo implements Serializable {
    private static final long serialVersionUID = 1L;
    private String currencyCode; // код валюты
    private String currencyName; // наименование валюты
    private Double currencyRate; // курс к национальной валюте (рублю)

    public CurrencyInfo(String code, String name, Double rate) {
        currencyCode = code;
        currencyName = name;
        currencyRate = rate;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public Double getCurrencyRate() {
        return currencyRate;
    }

    public void setCurrencyRate(Double rate) {
        currencyRate = rate;
    }


    @Override
    public String toString() {
        return String.format("[%s, %s, %.2f]", currencyCode, currencyName, currencyRate);
    }


}
