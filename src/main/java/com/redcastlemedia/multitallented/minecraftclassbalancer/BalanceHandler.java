package com.redcastlemedia.multitallented.minecraftclassbalancer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class BalanceHandler {

    @Autowired
    public BalanceHandler(ClassHandler classHandler) {
        this.classHandler = classHandler;
    }

    private ClassHandler classHandler;

    @EventListener(ApplicationReadyEvent.class)
    public void balanceAllClasses() {
        classHandler.loadAllClasses();

        //TODO find balance metrics for each class

        //TODO save metrics to class files
    }
}
