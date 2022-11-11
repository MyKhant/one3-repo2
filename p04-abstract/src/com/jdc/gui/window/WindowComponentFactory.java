package com.jdc.gui.window;

import com.jdc.gui.Button;
import com.jdc.gui.ComopnentFactory;
import com.jdc.gui.Dialog;

public class WindowComponentFactory implements ComopnentFactory {

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	@Override
	public Dialog createDialog() {
		return new WindowDialog();
	}

}
