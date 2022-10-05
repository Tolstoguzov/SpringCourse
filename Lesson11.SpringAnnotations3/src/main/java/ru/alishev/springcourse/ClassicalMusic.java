package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class ClassicalMusic implements Music {
    @Override
    public List<String> getSong() {

        return Arrays.asList("Hungarian Rhapsody", "Moon Sonate", "Bolero");
    }
}
