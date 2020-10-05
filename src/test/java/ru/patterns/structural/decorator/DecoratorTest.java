package ru.patterns.structural.decorator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 05.10.2020
 */

public class DecoratorTest {
    @Test
    public void checkResponsibilitiesOfLeadHrManager() {
        HrManager hrManager = new LeadHrManager(new PersonnelOfficer(new Recruiter()));
        assertThat(hrManager.work(), is("Calls candidates. Keeps workbooks. Interviews. "));
    }

    @Test
    public void checkResponsibilitiesOfPersonnelOfficer() {
        HrManager hrManager = new PersonnelOfficer(new Recruiter());
        assertThat(hrManager.work(), is("Calls candidates. Keeps workbooks. "));
    }

    @Test
    public void checkResponsibilitiesOfRecruiter() {
        HrManager hrManager = new Recruiter();
        assertThat(hrManager.work(), is("Calls candidates. "));
    }
}
