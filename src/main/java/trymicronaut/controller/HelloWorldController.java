package trymicronaut.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller
public class HelloWorldController {

    @Get("/greetings")
    public String greetings(){
        return "hello micronaut";
    }

    @Get("/hello/{value}")
    public String reverseString(@PathVariable("value") String value){
        return new StringBuilder(value).reverse().toString();
    }
}
