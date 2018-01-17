package com.pharmagest.exercice;

import com.pharmagest.exercice.service.ReverseStringService;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.assertTrue;

public class ReverseStringServiceTest {

    ReverseStringService reverseStringService = new ReverseStringService();

    @Test
    public void it_should_reverse_abc_to_cba() {
        //GIVEN
        String abc = "abc";

        //WHEN
        String reversedString = reverseStringService.reverse(abc);

        //THEN
        assertThat(reversedString).isEqualTo("cba");
    }

    @Test
    public void it_should_reverse_aaaaa_to_aaaaa() {
        //GIVEN
        String aaaaa = "aaaaa";

        //WHEN
        String reversedString = reverseStringService.reverse(aaaaa);

        //THEN
        assertTrue(reversedString == aaaaa);

    }

    @Test
    public void it_should_handle_null() {
        //GIVEN
        String nullString = null;

        //THEN
        assertThatThrownBy(() -> {
            reverseStringService.reverse(nullString);
        })
                .isInstanceOf(IllegalArgumentException.class);
    }
}
