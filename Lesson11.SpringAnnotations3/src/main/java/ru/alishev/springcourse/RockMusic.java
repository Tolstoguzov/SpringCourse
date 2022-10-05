package ru.alishev.springcourse;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author Neil Alishev
 */
@Component
public class RockMusic implements Music {
    @Override
    public List<String> getSong() {

        return Arrays.asList("Wind cries Mary", "Hotel California", "Susi Q");
    }
}
