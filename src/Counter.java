import java.util.concurrent.atomic.AtomicInteger;

class Counter<cnt> {
    private AtomicInteger cnt;

    public Counter(int init) {
        cnt = new AtomicInteger(init);
    }
    public synchronized void increment() {
        cnt.incrementAndGet();
    }
    public synchronized void decrement() {
        cnt.decrementAndGet();
    }
    public synchronized int value() {
        return cnt.get();
    }
}
