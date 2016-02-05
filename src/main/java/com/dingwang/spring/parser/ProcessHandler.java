/*
 * Copyright 2016 Zhongan.com All right reserved. This software is the
 * confidential and proprietary information of Zhongan.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Zhongan.com.
 */
package com.dingwang.spring.parser;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * 类ProcessHandler.java的实现描述：TODO 类实现描述
 * 
 * @author wangding_91@163.com 2016年2月2日 下午6:04:45
 */
public class ProcessHandler extends NamespaceHandlerSupport {

    /*
     * (non-Javadoc)
     * @see org.springframework.beans.factory.xml.NamespaceHandler#init()
     */
    public void init() {
        registerBeanDefinitionParser("process", new ProcessBeanDefinitionParser());
    }

}
