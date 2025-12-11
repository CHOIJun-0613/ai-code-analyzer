/**
 * Generated 2024. 07. 05. 15:18:03
 */
package com.skbank.sml.fns.mpb.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import bxmc.annotation.dbio.TestValue;
import bxmc.annotation.dbio.TestValues;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DODT;
import java.util.List;

/**
 * 모임통장메시지카드정보
 *
 * @author 90190263
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="모임통장메시지카드정보", description="모임통장메시지카드정보", author="90190263")
public interface MET_PBOK_MSG_CAD_INF001_DBM
{
	/**
	 * 모임통장메시지카드정보 - Select
	 */
	@TestValues({
		@TestValue(values="metMsgCadDscd=01")
	})
	@BxmCategory(logicalName="모임통장메시지카드정보 - Select", description="모임통장메시지카드정보 - Select ", author="90190263")
	List<MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DODT> selectMetPbokMsgCadInf(
		MET_PBOK_MSG_CAD_INF001SelectMetPbokMsgCadInf_DIDT metPbokMsgCadInf001SelectMetPbokMsgCadInf_DIDT
		);
}
