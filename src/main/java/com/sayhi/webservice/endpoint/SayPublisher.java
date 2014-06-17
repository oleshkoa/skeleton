package com.sayhi.webservice.endpoint;

import com.sayhi.webservice.ws.SayHiService;

import javax.xml.ws.Endpoint;

/**
 * OleshkoArtem
 * 06.06.14
 */
public class SayPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:2233/ws/sayHi", new SayHiService());
    }
}
