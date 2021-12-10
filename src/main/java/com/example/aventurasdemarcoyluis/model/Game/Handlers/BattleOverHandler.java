package com.example.aventurasdemarcoyluis.model.Game.Handlers;

import com.example.aventurasdemarcoyluis.model.Game.GameStates.InBattle;

import java.beans.PropertyChangeEvent;

public class BattleOverHandler implements Handler{
    private InBattle gameInBattle;
    public BattleOverHandler(InBattle gameInBattle) {
        this.gameInBattle = gameInBattle;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        gameInBattle.onBattleOver((int) evt.getNewValue());
    }
}