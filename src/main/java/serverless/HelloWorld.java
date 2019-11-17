package serverless;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class HelloWorld implements RequestHandler<HelloWorldInput, HelloWorldOutput> {

    @Override
    public HelloWorldOutput handleRequest(HelloWorldInput input, Context ctx) {
        HelloWorldOutput output = new HelloWorldOutput();
        output.setMessage("Witam " + input.getName() + ", w swiecie Serverless!!!");
        return output;
    }

}
