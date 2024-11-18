package bridge;

import bridge.controller.BridgeGame;

public class Application {

    public static void main(String[] args) {

        final BridgeGame bridgeGame = new BridgeGame();

        bridgeGame.start();
    }
}
