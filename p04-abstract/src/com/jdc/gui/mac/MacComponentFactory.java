package com.jdc.gui.mac;

import com.jdc.gui.Button;
import com.jdc.gui.ComopnentFactory;
import com.jdc.gui.Dialog;

public class MacComponentFactory implements ComopnentFactory {

	@Override
	public Button createButton() {

		return new MacButton();
	}

	@Override
	public Dialog createDialog() {
		return new MacDialog();
	}

}
