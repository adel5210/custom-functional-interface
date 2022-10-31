package com.adel.functionalinterface;

@FunctionalInterface
public interface MyFunction<A,Z> {
    Z test(A a);

    default <N> MyFunction<A,N> andThen(MyFunction<Z,N> to){
        return (A a) -> to.test(this.test(a));
    }

    default <N> MyFunction<N,Z> compose(MyFunction<N,A> from){
        return (N n) -> this.test(from.test(n));
    }

    static <A> MyFunction<A,A> identity() {
        return a->a;
    }

}
