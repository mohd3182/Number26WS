/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eg.number26ws.exceptions;

/**
 *
 * @author mohamed.abdelalim
 */
public class TransactionNotFoundException extends RuntimeException {

    private static final long serialVersionUID = 4351222367030656859L;

    
    public TransactionNotFoundException(String message) {
        super(message);
    }
   
    
    
}
