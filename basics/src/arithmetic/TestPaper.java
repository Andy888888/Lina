package arithmetic;

import core.MainLaunch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 描述：待描述
 * <p>
 *
 * @author yanwenqiang
 * @date 2019/4/22
 */
public class TestPaper extends MainLaunch {
    @Override
    public void start() {
        Option bgOption1 = new Option("左边", 10);
        Option bgOption2 = new Option("右边", 7);
        Option bgOption3 = new Option("上边", 2);
        Option bgOption4 = new Option("下边", 5);
        Option[] options = new Option[]{bgOption1, bgOption2, bgOption3, bgOption4};

        List<String> symbols = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));

        int count = symbols.size();
        for (int i = 0; i < count; i++) {
            int index = new Random().nextInt(symbols.size());
            System.out.println(index + " / " + symbols.get(index));
            options[i].symbol = symbols.get(index);
            symbols.remove(index);
        }

        int stop = 0;


    }

    class Option {
        private String symbol; // A、B、C、D
        private String value; // 选项内容
        private int score; // 得分

        public Option() {
        }

        public Option(String value, int score) {
            this.value = value;
            this.score = score;
        }

        public Option(String symbol, String value, int score) {
            this.symbol = symbol;
            this.value = value;
            this.score = score;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }
    }
}
