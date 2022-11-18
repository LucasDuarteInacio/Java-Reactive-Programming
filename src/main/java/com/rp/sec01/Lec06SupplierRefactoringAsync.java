package com.rp.sec01;

import com.rp.courseutil.Util;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;


public class Lec06SupplierRefactoringAsync {
    public static void main(String[] args) {

        getName();
        getName().subscribeOn(Schedulers.boundedElastic())
                .subscribe(Util.onNext());

//        String name = getName().subscribeOn(Schedulers.boundedElastic())
//                .block();
//        System.out.println("name is: " + name);
        getName();

        Util.sleepSeconds(4);
    }


    private static Mono<String> getName() {
        System.out.println("entered getName method");
        return Mono.fromSupplier(() -> {
            System.out.println("Generating name..");
            Util.sleepSeconds(3);
            return Util.faker().name().fullName();
        }).map(String::toUpperCase);

    }
}
