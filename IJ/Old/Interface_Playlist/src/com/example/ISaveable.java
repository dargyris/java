package com.example;

import java.util.List;

public interface ISaveable {
    List<String> write();
    boolean read(List<String> savedValues);
}
