/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eg.number26ws.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mohamed.abdelalim
 */

@XmlRootElement
public class ErrorMessage {
    
    
    private int errNo;
    private String errMessage;

    public ErrorMessage(int errNo, String errMessage) {
        this.errNo = errNo;
        this.errMessage = errMessage;
    }

    public ErrorMessage() {
    }

    public int getErrNo() {
        return errNo;
    }

    public void setErrNo(int errNo) {
        this.errNo = errNo;
    }

    public String getErrMessage() {
        return errMessage;
    }

    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
    
    
    
    
    
}
