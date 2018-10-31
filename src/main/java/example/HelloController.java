package example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin")
public class HelloController {

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public String index(){
        return "welcome";
    }
}
