package ru.patterns.behavioural.strategy;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 15.10.2020
 */

public class Hero {
    private Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public String takeAction() {
        return activity.performFeat();
    }
}
