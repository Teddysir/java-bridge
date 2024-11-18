package bridge.controller;

import bridge.BridgeNumberGenerator;
import bridge.BridgeRandomNumberGenerator;
import bridge.model.BridgeChecker;
import bridge.model.BridgeMaker;
import bridge.view.InputView;

import java.util.IllegalFormatException;
import java.util.List;

/**
 * 다리 건너기 게임을 관리하는 클래스
 */
public class BridgeGame {

    private final InputView inputView = new InputView();
    private final BridgeChecker bridgeChecker = new BridgeChecker();
    private final BridgeNumberGenerator bridgeNumberGenerator = new BridgeRandomNumberGenerator();
    private final BridgeMaker bridgeMaker = new BridgeMaker(bridgeNumberGenerator);

    public void start() {
        try {
            bridgeCheck();
            retry();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void bridgeCheck() {
        inputView.guidGameStartMessage();
        String rawBridgeSizeInput = inputView.guideBridgeSizeInput();
        int bridgeSize = inputView.readBridgeSize(rawBridgeSizeInput);

        List<String> answerBridge = bridgeMaker.makeBridge(bridgeSize);

        game(answerBridge);
    }

    public void game(List<String> answerBridge) {
        System.out.println(answerBridge);
        StringBuilder answerSbUp = new StringBuilder();
        StringBuilder answerSbDown = new StringBuilder();
        answerSbUp.append("[");
        answerSbDown.append("[");
        for (int checkIndex = 0; checkIndex < answerBridge.size(); checkIndex++) {
            String movingCommand = move();
            answerSbUp.append(bridgeChecker.guessUpBridge(answerBridge, movingCommand, checkIndex));
            answerSbDown.append(bridgeChecker.guessDownBridge(answerBridge, movingCommand, checkIndex));
            System.out.println(answerSbUp);
            System.out.println(answerSbDown);
        }
    }

    /**
     * 사용자가 칸을 이동할 때 사용하는 메서드
     * <p>
     * 이동을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public String move() {
        inputView.guideMovingCommand();
        return inputView.readMoving();
    }

    /**
     * 사용자가 게임을 다시 시도할 때 사용하는 메서드
     * <p>
     * 재시작을 위해 필요한 메서드의 반환 타입(return type), 인자(parameter)는 자유롭게 추가하거나 변경할 수 있다.
     */
    public void retry() {
    }
}
