module com.example.aventurasdemarcoyluis {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.aventurasdemarcoyluis.Characters;
    opens com.example.aventurasdemarcoyluis.Characters to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.Items;
    opens com.example.aventurasdemarcoyluis.Items to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.Characters.Enemies;
    opens com.example.aventurasdemarcoyluis.Characters.Enemies to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.Characters.Players;
    opens com.example.aventurasdemarcoyluis.Characters.Players to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.Characters.States;
    opens com.example.aventurasdemarcoyluis.Characters.States to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.Game;
    opens com.example.aventurasdemarcoyluis.Game to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.Game.Battle;
    opens com.example.aventurasdemarcoyluis.Game.Battle to javafx.fxml;
    exports com.example.aventurasdemarcoyluis.Game.Battle.BattleStates;
    opens com.example.aventurasdemarcoyluis.Game.Battle.BattleStates to javafx.fxml;
    exports com.example.aventurasdemarcoyluis;
    opens com.example.aventurasdemarcoyluis to javafx.fxml;
}