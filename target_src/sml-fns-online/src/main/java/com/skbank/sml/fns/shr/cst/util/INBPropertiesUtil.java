package com.skbank.sml.fns.shr.cst.util;

import fwk.skbank.online.context.WFApplicationContext;

public class INBPropertiesUtil {

	/**
     * 환경 체크
     * 환경구분 (L:로컬,D:개발,T:테스트,P:운영)
     */
	public static String checkExeEnv () {
       String env = WFApplicationContext.getEnvInfDscd(); 
       
       return env;
    }
    
	
}
