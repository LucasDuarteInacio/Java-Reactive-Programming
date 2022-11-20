package com.rp.sec02.assignment;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicInteger;

public class StockPricePublisher {


public static Flux<Integer> getPrice(){
    AtomicInteger atomicInteger = new AtomicInteger(100);
    return Flux.interval(Duration.ofSeconds(1))
            .map(i -> atomicInteger.getAndAccumulate(
                    Util.faker().random().nextInt(-5,5),
                    //(a,b)-> a+b
                    Integer::sum
            ));
}

}
