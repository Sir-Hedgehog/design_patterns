package ru.patterns.behavioural.chain;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 02.06.2021
 */

public abstract class Status {

    private int movementLevel;
    private Status nextStatus;

    public Status(int movementLevel) {
        this.movementLevel = movementLevel;
    }

    public void setNextStatus(Status nextStatus) {
        this.nextStatus = nextStatus;
    }

    public String notifyOperator(String message, int level) {

        var result = "";

        if (level >= movementLevel) {
            result = save(message);
        }

        if (nextStatus != null) {
            result = result + nextStatus.notifyOperator(message, level);
        }

        return result;
    }

    public abstract String save(String message);
}
