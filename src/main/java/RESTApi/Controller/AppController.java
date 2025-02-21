package RESTApi.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
    @GetMapping("/start")
    public String hello() {
        return "Hello from BridgeLabz!";
    }

    @GetMapping("/hello/query")
    public String showName(@RequestParam("q") String name) {
        return name + " from BridgeLabz";
    }

    @GetMapping("/hello/{name}")
    public String getResponse(@PathVariable String name) {
        return name + " from BridgeLabz";
    }
}
