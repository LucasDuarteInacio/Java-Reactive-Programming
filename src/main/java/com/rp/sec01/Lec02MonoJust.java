package com.rp.sec01;

import reactor.core.publisher.Mono;

import java.util.stream.Stream;

public class Lec02MonoJust {
    public static void main(String[] args) {
    Mono<Integer> mono = Mono.just(1);

    System.out.println(mono);


    mono.subscribe(i -> System.out.println("Received: " + i) );
    }
}
