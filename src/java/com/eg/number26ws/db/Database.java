/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eg.number26ws.db;

import com.eg.number26ws.model.Transaction;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author mohamed.abdelalim
 */
public class Database {
    
    private static Map<Long,Transaction> transactions=new HashMap();

    public static Map<Long, Transaction> getTransactions() {
        transactions.put(10L, new Transaction(10,25,"car",0));
        transactions.put(11L, new Transaction(11,50,"ship",10));
        transactions.put(12L, new Transaction(12,40,"car",10));
        
        return transactions;
    }
    
    
    
    
}
