package example;

import org.apache.http.HttpHost;
import org.apache.http.client.fluent.*;

public class Example {
    public static void main(String[] args) throws Exception {
        HttpHost entry = new HttpHost("pr.oxylabs.io", 7777);
        String query = Executor.newInstance()
            .auth(entry, "customer-USERNAME-cc-US", "PASS")
            .execute(Request.Get("http://icanhazip.com").viaProxy(entry))
            .returnContent().asString();
        System.out.println(query);
    }
}
