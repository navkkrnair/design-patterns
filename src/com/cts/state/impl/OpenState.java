package com.cts.state.impl;

import com.cts.state.GateState;
import com.cts.state.MetroStation;

public class OpenState implements GateState {
    private final MetroStation metroStation;

    public OpenState(MetroStation metroStation) {
        this.metroStation = metroStation;
    }

    @Override
    public void payOk() {
        System.out.println("Payment already made");
    }

    @Override
    public void enter() {
        metroStation.setState(metroStation.getClosedState());
    }
}
