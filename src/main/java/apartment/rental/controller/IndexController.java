package apartment.rental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nettanwat on 6/4/15 AD.
 */
@Controller
@RequestMapping("/")
public class IndexController {
    @RequestMapping(value="/")
    public String index(){
        return "index";
    }
}
