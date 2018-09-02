package com.kenny;

import java.util.List;

public interface ISaveable<T> {
    List<T> save();
    void read(List<T> list, int index);
}

