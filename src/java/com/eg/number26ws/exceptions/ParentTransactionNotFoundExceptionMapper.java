/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eg.number26ws.exceptions;

import com.eg.number26ws.model.ErrorMessage;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

/**
 *
 * @author mohamed.abdelalim
 */
@Provider
public class ParentTransactionNotFoundExceptionMapper implements ExceptionMapper<ParentTransactionNotFoundException> {

    public ParentTransactionNotFoundExceptionMapper() {
    }


    @Override
    public Response toResponse(ParentTransactionNotFoundException e) {
        ErrorMessage errorResponse = new ErrorMessage(404,e.getMessage());

        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(
                errorResponse).type(MediaType.APPLICATION_JSON_TYPE).build();

    }
    
}
