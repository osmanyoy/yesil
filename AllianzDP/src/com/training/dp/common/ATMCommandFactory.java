package com.training.dp.common;

import com.training.dp.common.commands.DolarBozdur;
import com.training.dp.common.commands.ParaCek;
import com.training.dp.common.commands.ParaYatir;

public class ATMCommandFactory {

    public static ATMCommandManager createAtmCommandManager() {
        ATMCommandManager managerLoc = new ATMCommandManager();
        managerLoc.addCommand(new ParaCek());
        managerLoc.addCommand(new ParaYatir());
        managerLoc.addCommand(new DolarBozdur());

        return managerLoc;
    }
}
