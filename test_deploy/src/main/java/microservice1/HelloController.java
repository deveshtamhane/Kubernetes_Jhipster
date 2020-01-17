package microservice1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ping")
public class HelloController {


    @GetMapping
    public String ping(){
        return "Ping successful!!!";
    }
}
