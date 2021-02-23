package ru.patterns.structural.bridge;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 28.10.2020
 */

public class PostTest {

    @Test
    public void checkResponsibilitiesOfLeadHrManager() {
        Post post = new Letter(new FootCourier());
        assertEquals(post.getContain(), "Foot courier delivers post! The letter will be delivered quickly!");
    }

    @Test
    public void checkResponsibilitiesOfPersonnelOfficer() {
        Post post = new Parcel(new AutoCourier());
        assertEquals(post.getContain(), "Auto courier drives post! The parcel will be delivered very quickly!");
    }
}
