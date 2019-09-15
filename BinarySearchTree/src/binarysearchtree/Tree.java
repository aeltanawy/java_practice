/*
 * Copyright 2019 Abeer Eltanawy
 */
package binarysearchtree;

/**
 *
 * @author eltanawy
 */
public interface Tree<D extends Comparable> {
    public boolean isEmpty();
    public int cardinality();
    public boolean member(D elt);
    public NonEmptyBST<D> add(D elt);
}
