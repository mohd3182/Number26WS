/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eg.number26ws.service;

import com.eg.number26ws.db.Database;
import com.eg.number26ws.dto.DtoDoubleClass;
import com.eg.number26ws.exceptions.NegativeValueException;
import com.eg.number26ws.exceptions.ParentTransactionNotFoundException;
import com.eg.number26ws.exceptions.RequiredFieldEmptyException;
import com.eg.number26ws.exceptions.TransactionNotFoundException;
import com.eg.number26ws.model.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mohamed.abdelalim
 */
public class TransactionsService {

    public TransactionsService() {
    }

    public Transaction getTransaction(long TransactionId) {
        Transaction transaction = Database.getTransactions().get(TransactionId);

        if (transaction == null && TransactionId != 0) {
            throw new TransactionNotFoundException("The provided Transaction id not found id:" + TransactionId);
        }
        return transaction;
    }

    public boolean setTransaction(long transactionId, Transaction transaction) {

        
        boolean result=false;
        /**
         * *check Parent Key is exists*
         */
        transaction.setTransactionId(transactionId);
        
        if(transaction.getTransactionId()<0){
        throw new NegativeValueException("Transaction Id is Negative Value");
        }
        
        if(transaction.getAmount()<0){
        throw new NegativeValueException("Amount is Negative Value");
        }
        
        if(transaction.getType()==null || transaction.getType().equalsIgnoreCase("")){
        throw new RequiredFieldEmptyException("Reuired Field (Type) is Empty");
        }
        
        
        long parnetId = transaction.getParentId();
        if (parnetId != 0 && !Database.getTransactions().containsKey(parnetId)) {
            throw new ParentTransactionNotFoundException("the parent key :" + parnetId + " not found");
        }
        Database.getTransactions().put(transactionId, transaction);
        result=true;
        return result;

    }

    public List<Long> getTypeTransaction(String type) {
        List<Long> transactionsFound = new ArrayList<Long>();
        Database.getTransactions().values().stream().filter(e -> e.getType().equalsIgnoreCase(type)).forEach(i -> transactionsFound.add(i.getTransactionId()));
        return transactionsFound;
    }

    public DtoDoubleClass getSum(long transactionId) {
       double sumVal=0;
        if(transactionId!=0){
            sumVal= Database.getTransactions().values().stream().filter(e -> e.getParentId() == transactionId).mapToDouble(y -> y.getAmount()).sum();
        }
         
        return new DtoDoubleClass(sumVal);
    }

}
