package bridge.model;

import bridge.view.OutputView;

import java.util.List;

public class BridgeChecker {


    public StringBuilder guessUpBridge(List<String> answerBridge, String movingCommand, int checkIndex) {

        String answer = answerBridge.get(checkIndex);
        StringBuilder sbUp = new StringBuilder();

        if (answer.equals("D")) {
            if (answerBridge.size() - 1 == checkIndex) {
                if (answer.equals(movingCommand)) {
                    sbUp.append("   ]");
                }
                if (!answer.equals(movingCommand)) {
                    sbUp.append("   ]");
                }
                return sbUp;
            }
            if (!answer.equals(movingCommand)){
                sbUp.append(" X ]");
                return sbUp;
            }
            sbUp.append("   |");
        }

        if (answer.equals("U")) { // 정답이 U임
            if (answerBridge.size() - 1 == checkIndex) {
                if (answer.equals(movingCommand)) {
                    sbUp.append(" O ]");
                }
                if (!answer.equals(movingCommand)) {
                    sbUp.append("   ]");
                }
                return sbUp;
            }
            if (answer.equals(movingCommand)) { // 올바른 정답을 입력할 경우
                sbUp.append(" O |");
            }
            if (!answer.equals(movingCommand)) {
                sbUp.append("   |");
            }
        }

        return sbUp;

    }

    public StringBuilder guessDownBridge(List<String> answerBridge, String movingCommand, int checkIndex) {

        String answer = answerBridge.get(checkIndex);
        StringBuilder sbDown = new StringBuilder();

        if (answer.equals("U")) {

            if (answerBridge.size() - 1 == checkIndex) {
                if (answer.equals(movingCommand)) {
                    sbDown.append("   ]");
                }
                if (!answer.equals(movingCommand)) {
                    sbDown.append("   ]");
                }
                return sbDown;
            }
            if (!answer.equals(movingCommand)){
                sbDown.append(" X ]");
                return sbDown;
            }
            sbDown.append("   |");
        }

        if (answer.equals("D")) {
            if (answerBridge.size() - 1 == checkIndex) {
                if (answer.equals(movingCommand)) {
                    sbDown.append(" O ]");
                }
                if (!answer.equals(movingCommand)) {
                    sbDown.append("   ]");
                }
                return sbDown;
            }

            if (answer.equals(movingCommand)) {
                sbDown.append(" O |");
            }
            if (!answer.equals(movingCommand)) {
                sbDown.append("   |");
            }
        }

        return sbDown;

    }


}
