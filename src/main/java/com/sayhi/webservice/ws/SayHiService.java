package com.sayhi.webservice.ws;

import javax.jws.WebService;

/**
 * OleshkoArtem
 * 06.06.14
 */
@WebService(endpointInterface = "com.sayhi.webservice.ws.SayService")
public class SayHiService implements SayService{

    @Override
    public String getSpeechAsString(String str) {
        return "Do you want " + str + "?";
    }
}
