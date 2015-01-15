package spark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.before;
import static spark.Spark.get;
import static spark.Spark.halt;

/**
 * Created by Per Wendel on 2014-05-10.
 */
public class LambdaTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(LambdaTest.class);
    public static void main(String[] args) {
      
        get("/hello", new Route(){

            @Override
            public Object handle(Request request, Response response) throws Exception {
                LOGGER.info("request = " + request.pathInfo());
                return "Hello World";
            }
            
        });

    }

}
