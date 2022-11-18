package com.rp.sec02;

import com.rp.courseutil.Util;
import reactor.core.publisher.Flux;

public class Lec02MultpleSubscribers {
    public static void main(String[] args) {
        Flux<Integer> integerFlux = Flux.just(1, 2, 3, 4);

        Flux<Integer> evenFlux = integerFlux.filter(i -> i % 2 == 0);

        integerFlux.subscribe(i -> System.out.println("sub 1: " + i) );

        evenFlux.subscribe(i -> System.out.println("sub 2: " + i) );
    }
}
