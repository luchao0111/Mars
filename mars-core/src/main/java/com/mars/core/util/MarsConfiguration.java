package com.mars.core.util;

import com.mars.core.base.config.MarsConfig;
import com.mars.core.constant.MarsConstant;
import com.mars.core.constant.MarsSpace;

/**
 * 配置文件工具类
 * @author yuye
 *
 */
public class MarsConfiguration {

	private static MarsSpace constants = MarsSpace.getEasySpace();


	/**
	 * 加载配置文件
	 * @param marsConfig 后缀
	 */
	public static void loadConfig(MarsConfig marsConfig) {
		constants.setAttr(MarsConstant.CONFIG_CACHE_KEY,marsConfig);
	}


	/**
	 * 获取配置信息
	 * @return json
	 */
	public static MarsConfig getConfig() {
		Object obj = constants.getAttr(MarsConstant.CONFIG_CACHE_KEY);
		if(obj == null){
			return null;
		}
		return (MarsConfig)obj;
	}
}
