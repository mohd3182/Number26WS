package com.eg.number26ws.exceptions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


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
public class GeneralExceptionMapper implements ExceptionMapper<Throwable>{



    @Override
    public Response toResponse(Throwable e) {
           ErrorMessage errorResponse = new ErrorMessage();
        errorResponse.setErrNo(400);
        errorResponse.setErrMessage(e.getMessage());
        return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(
                errorResponse).type(MediaType.APPLICATION_XML).build();}
    
}
