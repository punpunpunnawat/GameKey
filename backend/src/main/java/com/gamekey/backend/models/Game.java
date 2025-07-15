package com.gamekey.backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Document(collection = "games")
public class Game {
    @Id
    private String id;
    private String name;
    private List<String> genres;
    private String description;
    private Integer releaseYear;
    private String developer;
    private Double price;
    private Integer quantity;

    // constructor, getters, setters
}
