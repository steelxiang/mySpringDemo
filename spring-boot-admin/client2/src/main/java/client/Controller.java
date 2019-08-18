package client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiang
 * @date 2019/8/18
 */

@RestController
public class Controller {
    @RequestMapping("/hello")
    public String Hello(){
        return "hell world";
    }
}
