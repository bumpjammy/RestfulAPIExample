package my.bumpjam.restfulapiexample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReverseStringController {
    @GetMapping("/reverse-string")
    public ReverseString reverseString(@RequestParam(value = "string", defaultValue = "") String string) {
        return new ReverseString(new StringBuilder(string).reverse().toString());
    }
}
