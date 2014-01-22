package org.suggs.sandbox;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MapperTest {

    private final List<String> friends = Arrays.asList("Brian", "Nate", "Neal", "Raju", "Sarah", "Scott");
    private Mapper mapper = new Mapper();

    @Test
    public void shouldConvertAllToUpperCase() throws Exception {
        List<String> upperCases = mapper.toUpperCase(friends);
        assertThat(upperCases.contains("BRIAN"), is(true));
    }

    @Test
    public void shouldConvertAllToLowerCase() throws Exception {
        List<String> lowerCases = mapper.toLowerCase(friends);
        assertThat(lowerCases.contains("brian"), is(true));
    }
}
