package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Poster {
    private int id;
    private String filmName;

    public Poster(int id) {
        this.id = id;
    }
}
