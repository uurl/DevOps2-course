package com.baeldung.mybatis.spring;

import java.io.Serializable;

public class Article implements Serializable {
    private Long id;
    private String title;
    private String author;

    public Article() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
