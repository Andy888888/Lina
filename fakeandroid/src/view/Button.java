package view;

/**
 * Button View
 * @author yanwenqiang
 * @date 2018-05-31
 */
public class Button extends View {
	private String text;
	private OnClickListener clickListener;
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public int getTextLength() {
		return text.length();
	}
	
	public void setOnclickListener(OnClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	// 模拟点击后，硬件传递电流信号处理click
	public void press() {
		// 触发click
		// 面向对象的一个原则：依赖倒置
		if(checkClickListener()) {
			clickListener.onClick(this);
		}
	}
	
	// 检查click接口是否有效
	protected boolean checkClickListener() {
		if(clickListener!=null) {
			return true;
		}
		return false;
	}
}
