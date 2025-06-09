package com.currency.currency.service;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicInteger;

@Service
public class RequestCounter {

    private final AtomicInteger totalCount = new AtomicInteger(0);
    private final AtomicInteger successfulCount = new AtomicInteger(0);
    private final AtomicInteger failedCount = new AtomicInteger(0);

    public void incrementTotal() {
        totalCount.incrementAndGet();
    }

    public void incrementSuccessful() {
        successfulCount.incrementAndGet();
    }

    public void incrementFailed() {
        failedCount.incrementAndGet();
    }

    public int getTotalCount() {
        return totalCount.get();
    }

    public int getSuccessfulCount() {
        return successfulCount.get();
    }

    public int getFailedCount() {
        return failedCount.get();
    }

    public void reset() {
        totalCount.set(0);
        successfulCount.set(0);
        failedCount.set(0);
    }

    @Override
    public String toString() {
        return "RequestCounter{" +
                "totalCount=" + totalCount +
                ", successfulCount=" + successfulCount +
                ", failedCount=" + failedCount +
                '}';
    }
}