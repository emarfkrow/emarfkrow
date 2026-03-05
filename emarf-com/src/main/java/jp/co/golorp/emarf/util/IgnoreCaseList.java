package jp.co.golorp.emarf.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * すべての文字列を大文字に変換して保持するリスト
 * @param <S>
 */
public final class IgnoreCaseList<S> implements List<String> {

    /** 内部で実際にデータを保持するリスト */
    private final List<String> internalList;

    /** デフォルトコンストラクタ */
    public IgnoreCaseList() {
        this.internalList = new ArrayList<>();
    }

    /**
     * 他のコレクションから生成するコンストラクタ
     * @param c
     */
    public IgnoreCaseList(final Collection<? extends String> c) {
        this.internalList = new ArrayList<>();
        this.addAll(c);
    }

    /**
     * @param o
     * @return String
     */
    private String convert(final Object o) {
        if (o == null) {
            return null;
        }
        return o.toString().toUpperCase(Locale.ROOT);
    }

    // --- 修正（書き込み）系メソッド ---

    @Override
    public boolean add(final String s) {
        return internalList.add(convert(s));
    }

    @Override
    public void add(final int index, final String element) {
        internalList.add(index, convert(element));
    }

    @Override
    public String set(final int index, final String element) {
        return internalList.set(index, convert(element));
    }

    @Override
    public boolean addAll(final Collection<? extends String> c) {
        return internalList.addAll(c.stream().map(this::convert).collect(Collectors.toList()));
    }

    @Override
    public boolean addAll(final int index, final Collection<? extends String> c) {
        return internalList.addAll(index, c.stream().map(this::convert).collect(Collectors.toList()));
    }

    // --- 読み取り・検索系メソッド (委譲) ---

    @Override
    public int size() {
        return internalList.size();
    }

    @Override
    public boolean isEmpty() {
        return internalList.isEmpty();
    }

    @Override
    public boolean contains(final Object o) {
        return internalList.contains(convert(o));
    }

    @Override
    public Iterator<String> iterator() {
        return internalList.iterator();
    }

    @Override
    public Object[] toArray() {
        return internalList.toArray();
    }

    @Override
    public <T> T[] toArray(final T[] a) {
        return internalList.toArray(a);
    }

    @Override
    public boolean remove(final Object o) {
        return internalList.remove(convert(o));
    }

    @Override
    public boolean containsAll(final Collection<?> c) {
        return internalList.containsAll(c.stream().map(this::convert).collect(Collectors.toList()));
    }

    @Override
    public boolean removeAll(final Collection<?> c) {
        return internalList.removeAll(c.stream().map(this::convert).collect(Collectors.toList()));
    }

    @Override
    public boolean retainAll(final Collection<?> c) {
        return internalList.retainAll(c.stream().map(this::convert).collect(Collectors.toList()));
    }

    @Override
    public void clear() {
        internalList.clear();
    }

    @Override
    public String get(final int index) {
        return internalList.get(index);
    }

    @Override
    public String remove(final int index) {
        return internalList.remove(index);
    }

    @Override
    public int indexOf(final Object o) {
        return internalList.indexOf(convert(o));
    }

    @Override
    public int lastIndexOf(final Object o) {
        return internalList.lastIndexOf(convert(o));
    }

    @Override
    public ListIterator<String> listIterator() {
        return internalList.listIterator();
    }

    @Override
    public ListIterator<String> listIterator(final int index) {
        return internalList.listIterator(index);
    }

    @Override
    public List<String> subList(final int fromIndex, final int toIndex) {
        return internalList.subList(fromIndex, toIndex);
    }

    @Override
    public String toString() {
        return internalList.toString();
    }
}
