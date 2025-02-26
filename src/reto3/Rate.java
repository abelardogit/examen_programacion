package reto3;

import common.Appetizer;

public record Rate (
    float pricePerNight,
    Appetizer[] appetizers // Aperitivos
) {}
