/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eg.number26ws.dto;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mohamed.abdelalim
 */
@XmlRootElement
public class DtoDoubleClass {
    private double sum;

    public DtoDoubleClass(double sum) {
        this.sum = sum;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
    
    
}
