package bridge.model;

import bridge.BridgeNumberGenerator;

import java.util.ArrayList;
import java.util.List;

/**
 * 다리의 길이를 입력 받아서 다리를 생성해주는 역할을 한다.
 */
public class BridgeMaker {

    private final BridgeNumberGenerator bridgeNumberGenerator;

    public BridgeMaker(BridgeNumberGenerator bridgeNumberGenerator) {
        this.bridgeNumberGenerator = bridgeNumberGenerator;
    }

    /**
     * @param size 다리의 길이
     * @return 입력받은 길이에 해당하는 다리 모양. 위 칸이면 "U", 아래 칸이면 "D"로 표현해야 한다.
     */
    public List<String> makeBridge(int size) {
        List<String> answerStr = new ArrayList<>();
        List<Integer> answers = answerRandomNums(size);

        for (int i = 0; i < answers.size(); i++) {
            if(answers.get(i) == 0) {
                answerStr.add("D");
            }
            if (answers.get(i) == 1) {
                answerStr.add("U");
            }
        }
        return answerStr;
    }

    private List<Integer> answerRandomNums(int size) {
        List<Integer> nums = new ArrayList<>();
        for(int i = 0 ; i< size; i++ ) {
            int randomNum = bridgeNumberGenerator.generate();
            nums.add(randomNum);
        }
        return nums;
    }

}
