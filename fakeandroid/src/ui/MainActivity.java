package ui;

import java.util.Locale;

import core.MainLaunch;
import view.Button;
import view.View;

public class MainActivity extends MainLaunch implements View.OnClickListener {

    @Override
    public void start() {
        // 模仿一个button来讲回调的意义和本质
        Button button = new Button();
        button.setTag("this is demo");
        button.setText("Lina");
        // 把本类当作接口实现对象传递给button
        button.setOnclickListener(this);
        // 匿名类方式
        button.setOnclickListener(view -> {
            Button button1 = (Button) view;
            String outInfo = String.format(Locale.CHINA, "Text:%s", button1.getText());
            System.out.print(outInfo);
        });
        button.press();
    }

    @Override
    public void onClick(View view) {
        Button button = (Button) view;
        String outInfo = String.format(Locale.CHINA, "Text:%s\nTag :%s", button.getText(), button.getTag().toString());
        System.out.print(outInfo);
    }
}