package client;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;

/**
 * @author steel
 * @date 2019/9/23
 */
@Component
@Async
public class AsyncTask {
    @Async
    public Future<String> doOne(String str){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("do one---"+str);
        return new AsyncResult<String>("this is do one==="+str);
    }
    @Async
    public Future<String> dothree(String str){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("do one---"+str);
        return new AsyncResult<String>("this is do one==="+str);
    }
    @Async
    public Future<String> dotwo(String str){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("do one---"+str);
        return new AsyncResult<String>("this is do one==="+str);
    }
}
