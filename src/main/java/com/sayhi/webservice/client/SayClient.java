package com.sayhi.webservice.client;

import com.sayhi.webservice.ws.SayService;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * OleshkoArtem
 * 06.06.14
 */
public class SayClient {

    public static void main(String... args) throws MalformedURLException {

        URL url = new URL("http://localhost:2233/ws/sayHi?wsdl");
        QName qname = new QName("http://ws.webservice.sayhi.com/", "SayHiServiceService");

        Service service = Service.create(url, qname);

        SayService say = service.getPort(SayService.class);

        System.out.println(say.getSpeechAsString("Audi 3.0 TFSI supercharged"));
    }

}
