/**
 * Generated 2025. 01. 07. 16:19:21
 */
package com.skbank.sml.fns.shr.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.shr.dto.SHRINBPushCtgrList_DTO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
	List<SHRINBPushCtgrList_DTO> selectPushCtgrList(
		@Param("ntfcDscd")String ntfcDscd
		);
}
