package com.andersen.webService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public interface HelloWebService {

    @WebMethod
    public String getHelloString(String name);

}
