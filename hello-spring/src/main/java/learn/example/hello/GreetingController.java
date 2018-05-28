package learn.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();
    private static final String template = "hello, %s";

    /**
     * @RequestMapping maps all HTTP operations by default.
     * Use @RequestMapping(method=GET) to narrow this mapping.
     * @param name
     * @return
     */
    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name){

        // 使用Jackson JSON library 自动序列化实例, 即将Greeting的实例序列化为JSON
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
