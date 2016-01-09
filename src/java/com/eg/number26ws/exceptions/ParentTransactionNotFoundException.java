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
public class ParentTransactionNotFoundException extends RuntimeException  {

    
    private static final long serialVersionUID = 4351222365030656859L;

    public ParentTransactionNotFoundException(String message) {
        super(message);
    }
    
}
