package com.rp.sec01;

import reactor.core.publisher.Mono;

public class Lec03MonoSubscrible {
    public static void main(String[] args) {
        //PUBLISHER
       // Mono<String> mono = Mono.just("Ball");


        //PUBLISHER WITH ERR
        Mono<Integer> mono = Mono.just("Ball")
                .map(String::length)
                .map(l-> l/0);

        //SUBSCRIBE
        mono.subscribe(
                item -> System.out.println(item),
                err -> System.out.println(err.getMessage()),
                () -> System.out.println("Completed")
        );
    }
}
