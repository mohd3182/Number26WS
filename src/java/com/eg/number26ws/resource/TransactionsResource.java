/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eg.number26ws.resource;

import com.eg.number26ws.dto.DtoDoubleClass;
import com.eg.number26ws.model.GenericResponse;
import com.eg.number26ws.model.Transaction;
import com.eg.number26ws.service.TransactionsService;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author mohamed.abdelalim
 */
@Path("/transactionservice")
@Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
@Consumes(MediaType.APPLICATION_JSON + ";charset=utf-8")
public class TransactionsResource {

    @PUT
    @Path("/transaction/{transaction_id}")
    public Response setTransaction(@PathParam("transaction_id") long transactionId,Transaction transaction) {
  
        boolean result = new TransactionsService().setTransaction(transactionId, transaction);

        if (result) {
            return Response.status(Response.Status.OK).entity(new GenericResponse("ok")).type(MediaType.APPLICATION_JSON).build();
        } else {
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new GenericResponse("failed")).type(MediaType.APPLICATION_JSON).build();
        }

    }

    @GET
    @Path("/transaction/{transaction_id}")
    public Transaction getTransaction(@PathParam("transaction_id") long transactionId) {
        return new TransactionsService().getTransaction(transactionId);
    }

    @GET
    @Path("/types/{type}")
    public List<Long> getTypes(@PathParam("type") String type) {
        return new TransactionsService().getTypeTransaction(type);
    }
    
    
    @GET
    @Path("/sum/{transaction_id}")
    public DtoDoubleClass getSum(@PathParam("transaction_id") long transactionId) {
        return new TransactionsService().getSum(transactionId);
    }

}
