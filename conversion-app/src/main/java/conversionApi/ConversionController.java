package conversionApi;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ConversionController {

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}