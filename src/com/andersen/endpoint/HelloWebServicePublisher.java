package com.andersen.endpoint;

import com.andersen.webService.HelloWebserviceImpl;

import javax.xml.ws.Endpoint;

public class HelloWebServicePublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:1986/wss/hello", new HelloWebserviceImpl());
    }
}
