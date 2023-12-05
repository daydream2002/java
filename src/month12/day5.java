package month12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.*;

/**
 * @author wjh
 * @date 2023/12/5 9:47
 */
public class day5 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(
                3,6,60,
                TimeUnit.SECONDS,new ArrayBlockingQueue<>(3),Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );


    }
}

