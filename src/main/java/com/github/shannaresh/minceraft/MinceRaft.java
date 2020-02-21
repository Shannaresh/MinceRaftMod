package com.github.shannaresh.minceraft;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(MinceRaft.MODID)
public class MinceRaft
{
    public static final String MODID = "minceraft";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public MinceRaft()
    {
        LOGGER.debug("Hello from MinceRaft!");
    }
}
