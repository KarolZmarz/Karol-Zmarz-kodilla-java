package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {

    private final String taskName;
    private final String whatToBuy;
    private final double quantity;
    private boolean taskStatus;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }
    @Override
    public boolean isTaskExecuted() {
        return taskStatus;
    }
    @Override
    public void executeTask() {
        taskStatus = true;
    }

}
