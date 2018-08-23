package print;

import print.impl.BoxImpl;
import print.impl.PageImpl;


/**
 * 打印机类
 * 1：墨盒接口
 * 2：纸张接口
 * 3：打印的方法
 * @author cuiyi
 *
 */
public class Print {
	private Box box;
	private Page page;
	
	public void print(){
		System.out.println("打印：【"+box.getColor()+"】的【"+page.getSize()+"】纸张！");
	}

	public void setBox(Box box) {
		this.box = box;
	}

	public void setPage(Page page) {
		this.page = page;
	}
	
}
