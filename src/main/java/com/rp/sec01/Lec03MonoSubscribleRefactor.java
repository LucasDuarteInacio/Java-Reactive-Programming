package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;

public class Lec03MonoSubscribleRefactor {
    public static void main(String[] args) {
        //PUBLISHER
        Mono<String> mono = Mono.just("Ball");


        //PUBLISHER WITH ERR
//        Mono<Integer> mono = Mono.just("Ball")
//                .map(String::length)
//                .map(l-> l/0);

        //SUBSCRIBE
        mono.subscribe(
                Util.onNext(),
                Util.onError(),
                Util.onComplete()
        );
    }
}
