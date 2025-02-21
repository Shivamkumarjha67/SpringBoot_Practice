package RESTApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/start")
    public String hello() {
        return "Hello from BridgeLabz!";
    }
}
