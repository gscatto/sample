package com.github.giulioscattolin.sample;

public interface SampleVisitor {
    void visit(KeyValueSample keyValueSample);

    void visit(int value);
}