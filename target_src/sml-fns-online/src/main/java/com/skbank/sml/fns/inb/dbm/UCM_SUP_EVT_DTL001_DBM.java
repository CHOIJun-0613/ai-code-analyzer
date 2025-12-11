/**
 * Generated 2024. 08. 25. 19:12:11
 */
package com.skbank.sml.fns.inb.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.inb.dto.UCM_SUP_EVT_DTL001DeleteIvstStgNtfcagrYn_DIDT;
import com.skbank.sml.fns.inb.dto.UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT;
import com.skbank.sml.fns.inb.dto.UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DIDT;
import com.skbank.sml.fns.inb.dto.UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT;

/**
 * 
 *
 * @author 90190264
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="우리플러스지원이벤트상세001.DBM", description="", author="90190264")
public interface UCM_SUP_EVT_DTL001_DBM
{
	/**
	 * 투자전략.알림.동의여부.조회
	 */
	@BxmCategory(logicalName="투자전략.알림.동의여부.조회", description="투자전략 알림 여부 조회", author="90190264")
	UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DODT selectIvstStgNtfcagrYn(
		UCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DIDT uCM_SUP_EVT_DTL001SelectIvstStgNtfcagrYn_DIDT
		);
	/**
	 * 투자전략.알림.동의여부.등록
	 */
	@BxmCategory(logicalName="투자전략.알림.동의여부.등록", description="투자전략 알림 여부 등록", author="90190264")
	Integer insertIvstStgNtfcAgrYn(
		UCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT uCM_SUP_EVT_DTL001InsertIvstStgNtfcAgrYn_DIDT
		);
	/**
	 * 투자전략.알림.동의여부.삭제
	 */
	@BxmCategory(logicalName="투자전략.알림.동의여부.삭제", description="투자전략 알림 여부 삭제", author="90190264")
	Integer deleteIvstStgNtfcagrYn(
		UCM_SUP_EVT_DTL001DeleteIvstStgNtfcagrYn_DIDT uCM_SUP_EVT_DTL001DeleteIvstStgNtfcagrYn_DIDT
		);
}
