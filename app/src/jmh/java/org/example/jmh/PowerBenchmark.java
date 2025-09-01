package org.example.jmh;

import org.example.Power;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@State(Scope.Benchmark)
@Fork(value = 1, warmups = 2)
@Warmup(iterations = 2)

public class PowerBenchmark{

    private Power power;

    @Param({"2", "3", "4", "5", "6"})
    private int base;
    @Param({"3", "4", "5", "6", "7"})
    private int exponent;

    @Setup(Level.Iteration)
    public void setUp() {
        power = new Power();
    }

    @Benchmark
    public void testNaive(Blackhole bh) {
        bh.consume(power.naiveApproach(base, exponent));
    }

    @Benchmark
    public void testUnoptimized(Blackhole bh) {
        bh.consume(power.unoptimizedApproach(base, exponent));
    }

    @Benchmark
    public void testOptimized(Blackhole bh) {
        bh.consume(power.optimizedApproach(base, exponent));
    }
}