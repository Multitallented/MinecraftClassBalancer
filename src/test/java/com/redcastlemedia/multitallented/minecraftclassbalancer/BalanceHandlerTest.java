package com.redcastlemedia.multitallented.minecraftclassbalancer;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class BalanceHandlerTest {

    @InjectMocks
    private BalanceHandler balanceHandler;

    @Mock
    private ClassHandler classHandler;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void balanceAllClassesShouldLoad() {
        this.balanceHandler.balanceAllClasses();
        verify(classHandler, times(1)).loadAllClasses();
    }
}
