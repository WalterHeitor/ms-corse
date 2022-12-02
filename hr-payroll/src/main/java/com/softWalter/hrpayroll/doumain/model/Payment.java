package com.softWalter.hrpayroll.doumain.model;

import java.io.Serializable;

public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;
    private String name;
    private Double dialyIncome;
    private Integer days;

    public Payment() {
    }

    public Payment(String name, Double dialyIncome, Integer days) {
        this.name = name;
        this.dialyIncome = dialyIncome;
        this.days = days;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getDialyIncome() {
        return dialyIncome;
    }

    public void setDialyIncome(Double dialyIncome) {
        this.dialyIncome = dialyIncome;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public Double getTotalPayment() {
        return days * dialyIncome;
    }
}
