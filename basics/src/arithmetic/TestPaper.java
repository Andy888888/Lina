package arithmetic;

import core.MainLaunch;

import java.util.*;

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
        Option bgOption3 = new Option("上边", 12);
        Option bgOption4 = new Option("下边", 5);
        List<Option> options = new ArrayList<Option>(Arrays.asList(bgOption1, bgOption2, bgOption3, bgOption4));
        List<String> symbols = new ArrayList<String>(Arrays.asList("A", "B", "C", "D"));

        int count = symbols.size();
        for (int i = 0; i < count; i++) {
            int index = new Random().nextInt(symbols.size());
            options.get(i).symbol = symbols.get(index);
            symbols.remove(index);
        }

        options.sort(Comparator.naturalOrder());
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i));
        }

    }

    class Option implements Comparable<Option> {
        private String symbol; // A、B、C、D
        private String value; // 选项内容
        private int score; // 得分

        public Option(String value, int score) {
            this.value = value;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Option{" +
                    "symbol='" + symbol + '\'' +
                    ", value='" + value + '\'' +
                    ", score=" + score +
                    '}';
        }

        @Override
        public int compareTo(Option o) {
            char c1 = this.symbol.charAt(0);
            char c2 = o.symbol.charAt(0);
            int thisASC = Integer.valueOf(c1);
            int targetASC = Integer.valueOf(c2);
            return thisASC - targetASC;
        }
    }
}
