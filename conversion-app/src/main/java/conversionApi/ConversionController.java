package conversionApi;

import conversionApi.Conversion; 
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ConversionController {

    @RequestMapping("/convert")
    public Conversion convert(@RequestParam(value="name", defaultValue="World") String name) {
        return new Conversion("kilometre", "Miles", 1);
    }
}
