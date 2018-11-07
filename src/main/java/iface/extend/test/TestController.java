package iface.extend.test;

import io.micronaut.http.annotation.Controller;

@Controller("/test")
public class TestController implements TestAPI {

    @Override
    public String testMethod(String testString, String otherTestString) {
        return "SUCCESS - RECEIVED "+testString+", "+otherTestString;
    }
}
