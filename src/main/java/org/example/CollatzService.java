package org.example;

import static spark.Spark.*;

public class CollatzService {

    public static void main(String... args){
        CollatzSequence collatzSequence = new CollatzSequence();
        port(getPort());
        staticFileLocation("/");
        get("/collatzsequence", (req, res) -> {
            int value = Integer.parseInt(req.queryParams("value"));
            String sequence = collatzSequence.calculateSequence(value);
            String response = "{\n" +
                    "\n" +
                    " \"operation\": \"collatzsequence\",\n" +
                    "\n" +
                    " \"input\": \"" + value + "\",\n" +
                    "\n" +
                    " \"output\":  \"" + sequence + "\"\n" +
                    "\n" +
                    "}";
            return response;
        });
        get("hello", (req,res) -> "Hello Docker!");
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
