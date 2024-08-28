package org.example;

public sealed interface Shape permits Circle, Rectangle, Triangle {

    Double getArea();
    Double getPerimeter();
}
