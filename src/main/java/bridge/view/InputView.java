package bridge.view;

import bridge.constants.InputMessageType;
import bridge.utils.GameValidator;
import camp.nextstep.edu.missionutils.Console;

/**
 * 사용자로부터 입력을 받는 역할을 한다.
 */
public class InputView {

    /**
     * 다리의 길이를 입력받는다.
     */

    public String guideBridgeSizeInput() {
        System.out.println(InputMessageType.INPUT_BRIDGE_LENGTH.getMessage());
        return Console.readLine();
    }
    public int readBridgeSize(String rawBridgeSizeInput) {
        int bridgeSize = GameValidator.checkedBridgeLengthFormat(rawBridgeSizeInput);
        GameValidator.checkedBridgeLength(bridgeSize);

        return bridgeSize;
    }

    /**
     * 사용자가 이동할 칸을 입력받는다.
     */
    public String readMoving() {
        return null;
    }

    /**
     * 사용자가 게임을 다시 시도할지 종료할지 여부를 입력받는다.
     */
    public String readGameCommand() {
        return null;
    }
}
