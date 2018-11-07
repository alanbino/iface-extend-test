package iface.extend.test;

import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.QueryValue;

public interface TestAPI {

    @Get("/testMethod/{testString}")
    public String testMethod(String testString, @QueryValue("otherTestString") String otherTestString);
}
