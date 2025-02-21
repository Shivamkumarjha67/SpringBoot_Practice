package RESTApi.Controller;

import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/hello/post")
    public String sayHelloWithBody(@RequestBody User user) {
        return "Hello " + user.getFirstName() + "\n" + user.getLastName() + " from BridgeLabz";
    }

    @PutMapping("/hello/put/{firstName}")
    public String sayHello(@PathVariable String firstName, @RequestParam String lastName) {
        return "Hello " + firstName + " " + lastName + " from BridgeLabz";
    }
}
