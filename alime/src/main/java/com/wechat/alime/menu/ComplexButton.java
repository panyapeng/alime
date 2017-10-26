package com.wechat.alime.menu;



/**
* 类名: ComplexButton </br>
* 描述: 父菜单项 :包含有二级菜单项的一级菜单。这类菜单项包含有二个属性：name和sub_button，而sub_button以是一个子菜单项数组 </br>
* 开发人员： pyp  </br>
* 发布版本：V1.0  </br>
 */
public class ComplexButton extends Button{
	 private Button[] sub_button;

	    public Button[] getSub_button() {
	        return sub_button;
	    }

	    public void setSub_button(Button[] sub_button) {
	        this.sub_button = sub_button;
	    }
}
