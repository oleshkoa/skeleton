package com.sayhi.webservice.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * OleshkoArtem
 * 06.06.14
 */
// Soap endpoint interface
@WebService
public interface SayService {
    @WebMethod String getSpeechAsString(String str);
}
