package com.cts.state.impl;

import com.cts.state.GateState;
import com.cts.state.MetroStation;

public class ClosedState implements GateState {
    private MetroStation metroStation;

    public ClosedState(MetroStation metroStation) {
        this.metroStation = metroStation;
    }

    @Override
    public void payOk() {
        metroStation.setState(metroStation.getOpenState());
    }

    @Override
    public void enter() {
        metroStation.setState(metroStation.getClosedState());
    }
}
