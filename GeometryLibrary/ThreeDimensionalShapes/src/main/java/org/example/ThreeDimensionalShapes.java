package org.example;

sealed public interface ThreeDimensionalShapes permits Cube, Sphere {
    Double getVolume();
}
