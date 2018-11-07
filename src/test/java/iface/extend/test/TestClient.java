package iface.extend.test;

import io.micronaut.http.client.annotation.Client;

@Client("/test")
public interface TestClient extends TestAPI {

// *************************************************
// **** TEST WILL WORK WHEN THIS IS UNCOMMENTED ****

//    @Override
//    public String testMethod(String testString, String otherTestString);

}
