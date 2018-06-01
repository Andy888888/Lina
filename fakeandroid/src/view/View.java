package view;

/**
 * Base View
 * @author yanwenqiang
 *
 */
public class View {
	private Object tag;
	
	public void setTag(Object tag) {
		this.tag = tag;
	}
	
	public Object getTag() {
		return tag;
	}
	
	public interface OnClickListener {
        void onClick(View view);
    }
}
