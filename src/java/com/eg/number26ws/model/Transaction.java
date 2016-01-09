/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eg.number26ws.model;

import com.owlike.genson.annotation.JsonIgnore;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author mohamed.abdelalim
 */
@XmlRootElement
public class Transaction {
    
    private long transactionId;
    private double amount;
    private String type;
    private long parentId;

    public Transaction() {
    }

    public Transaction(long transactionId, double amount, String type, long parentId) {
        this.transactionId = transactionId;
        this.amount = amount;
        this.type = type;
        this.parentId = parentId;
    }

    @XmlTransient
    public long getTransactionId() {
        return transactionId;
    }
    
    
    public void setTransactionId(long transactionId) {
        this.transactionId = transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlElement(name="parent_id")
    public long getParentId() {
        return parentId;
    }

    @XmlElement(name="parent_id")
    public void setParentId(long parentId) {
        this.parentId = parentId;
    }
            

}
