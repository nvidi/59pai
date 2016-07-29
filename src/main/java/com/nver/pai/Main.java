package com.nver.pai;

import com.nver.pai.util.ConfigUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by ywzhang on 2016/7/29.
 */
public class Main
{
	private static Logger logger = LogManager.getLogger(Main.class);

	public static void main(String[] args)
	{
		int port = ConfigUtil.getInt("port", 100);
		logger.info("port=" + port);
	}
}
