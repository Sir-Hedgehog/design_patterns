package ru.patterns.structural.bridge;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 28.10.2020
 */

public class PostTest {

    @Test
    public void checkResponsibilitiesOfLeadHrManager() {
        Post post = new Letter(new FootCourier());
        assertThat(post.getContain(), is("Foot courier delivers post! The letter will be delivered quickly!"));
    }

    @Test
    public void checkResponsibilitiesOfPersonnelOfficer() {
        Post post = new Parcel(new AutoCourier());
        assertThat(post.getContain(), is("Auto courier drives post! The parcel will be delivered very quickly!"));
    }
}
