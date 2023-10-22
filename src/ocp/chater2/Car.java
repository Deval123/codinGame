package ocp.chater2;

/**
 * @author $ Devalère
 **/

import java.util.*;
import java.util.stream.*;

public record Car(String model, int year) {
    @Override
    public String toString() {
        return model;
    }

    public static void main(String[] make) {
        var cars = new ArrayList<Car>();
        cars.add(new Car("Mustang", 1967));
        cars.add(new Car("Thunderbird", 1967));
        cars.add(new Car("Escort", 1975));
        var map = cars
                .stream()
                .collect(
                        Collectors.groupingByConcurrent(Car::year));
        System.out.print(map);

    }
}
