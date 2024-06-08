package org.example;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@State(Scope.Benchmark)
public class StreamBenchmark {

    List<Integer> list = new ArrayList<>();

    @Setup(Level.Trial)
    public void setUp() {
        int size = 10000000;
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(1, 50000));
        }
    }

    @Benchmark
    public void testSequentialStream(Blackhole bh) {
        List<Integer> res = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        bh.consume(res);
    }

    @Benchmark
    public void testParallelStream(Blackhole bh) {
        List<Integer> res = list.parallelStream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        bh.consume(res);
    }
}

