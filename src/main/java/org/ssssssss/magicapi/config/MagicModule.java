package org.ssssssss.magicapi.config;

import org.ssssssss.script.annotation.UnableCall;

/**
 * 模块，主要用于import指令，import时根据模块名获取当前类如：import assert;
 */
public interface MagicModule {

	/**
	 * 获取模块名
	 */
	@UnableCall
	String getModuleName();
}
