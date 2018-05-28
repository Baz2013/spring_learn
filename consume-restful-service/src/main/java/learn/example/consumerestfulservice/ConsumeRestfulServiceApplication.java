package learn.example.consumerestfulservice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;


@SpringBootApplication
public class ConsumeRestfulServiceApplication {

    private static final Logger log = LoggerFactory.getLogger(ConsumeRestfulServiceApplication.class);

    // RestTemplate 实现请求
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();
        Quote quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        log.info(quote.toString());
    }
}
