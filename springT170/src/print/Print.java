package print;

import print.impl.BoxImpl;
import print.impl.PageImpl;


/**
 * ��ӡ����
 * 1��ī�нӿ�
 * 2��ֽ�Žӿ�
 * 3����ӡ�ķ���
 * @author cuiyi
 *
 */
public class Print {
	private Box box;
	private Page page;
	
	public void print(){
		System.out.println("��ӡ����"+box.getColor()+"���ġ�"+page.getSize()+"��ֽ�ţ�");
	}

	public void setBox(Box box) {
		this.box = box;
	}

	public void setPage(Page page) {
		this.page = page;
	}
	
}
