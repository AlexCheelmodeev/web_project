package com.example.web_project;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vector2D {
    private double x;
    public double y;

    public double length() {
        return Math.sqrt(x * x + y * y);
    }
}
