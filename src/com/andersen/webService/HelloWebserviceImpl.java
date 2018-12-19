package com.andersen.webService;

import javax.jws.WebService;

@WebService(endpointInterface = "com.andersen.webService.HelloWebService")
public class HelloWebserviceImpl implements HelloWebService {

    @Override
    public String getHelloString(String name) {
        return "Hello, " + name + "!";
    }
}
