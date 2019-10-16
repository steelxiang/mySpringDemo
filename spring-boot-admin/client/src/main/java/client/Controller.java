package client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Future;

/**
 * @author xiang
 * @date 2019/8/18
 */

@RestController
public class Controller {

    @Autowired
    public AsyncTask asyncTask;

    @RequestMapping("/hello")
    public String Hello(){
        Future<String> hahahhaha = asyncTask.doOne("hahahhaha");

        return "hell world";
    }
}
