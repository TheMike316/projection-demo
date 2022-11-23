package com.example.projectiondemo.entity.projection;

import org.springframework.beans.factory.annotation.Value;

public interface BookDto
{
    Long getId();

    String getName();

    @Value("#{target.author.name}")
    String getAuthorName();
}
