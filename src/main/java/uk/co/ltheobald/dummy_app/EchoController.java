package uk.co.ltheobald.dummy_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EchoController {

    @GetMapping("/echo")
    @ResponseBody
    public String echo(@RequestParam(name = "message", required = false, defaultValue = "Hello") String message) {
        return "Echo: " + message;
    }
}
