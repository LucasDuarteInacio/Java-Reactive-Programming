package com.rp.sec02;

import com.rp.courseutil.Util;
import com.rp.sec02.helper.NameGenerator;
import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Lec07FluxVsList {
    public static void main(String[] args) {

       //List<String> names = NameGenerator.getNames(5);
       //System.out.println(names);

        NameGenerator.getNames(5)
                .subscribe(Util.onNext());

    }
}
