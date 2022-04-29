package service.impl;

import java.util.stream.Collectors;
import service.OutputService;
import db.Storage;

public class OutputServiceImpl implements OutputService {
    private static final String FORMAT = "fruit,quantity";

    @Override
    public String getOutput() {
        return FORMAT + System.lineSeparator() + Storage.STORAGE.keySet().stream()
                .map(key -> key + "," + Storage.STORAGE.get(key))
                .collect(Collectors.joining(System.lineSeparator()));

    }
}
