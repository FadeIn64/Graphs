package com.example.graphs.graph;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileExtractor {
    File file;
    private List<String> lines = null;

    public FileExtractor(File file) {
        this.file = file;
    }

    @SneakyThrows
    public List<String> getLines(){
        if(lines != null)
            return lines;
        Scanner sc = new Scanner(file);

        lines = new ArrayList<>();

        while (sc.hasNext()){
            String line = sc.nextLine();
            line = line.trim();
            if (line.replaceAll("(' '|'\t')", "").isEmpty()) continue;
            lines.add(line);
        }

        return lines;
    }
}
