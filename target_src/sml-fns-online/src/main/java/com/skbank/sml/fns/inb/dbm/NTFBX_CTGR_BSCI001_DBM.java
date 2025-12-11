/**
 * Generated 2024. 07. 09. 19:57:27
 */
package com.skbank.sml.fns.inb.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.inb.dto.NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT;
import com.skbank.sml.fns.inb.dto.NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT;
import java.util.List;

/**
 * 계정계에서 EAI로 알림함 카테고리 정보를 받아 MERGE 한다.
 *
 * @author 90190264
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="알림함카테고리기본정보", description="계정계에서 EAI로 알림함 카테고리 정보를 받아 MERGE 한다.", author="90190264")
public interface NTFBX_CTGR_BSCI001_DBM
{
	/**
	 * PUSH카테고리목록 조회
	 */
	@BxmCategory(logicalName="PUSH카테고리목록 조회", description="PUSH카테고리 목록을 조회 한다.", author="90190264")
	List<NTFBX_CTGR_BSCI001SelectPushCtgrList_DODT> selectPushCtgrList(
		NTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT nTFBX_CTGR_BSCI001SelectPushCtgrList_DIDT
		);
}
