/**
 * Generated 2024. 07. 05. 15:20:15
 */
package com.skbank.sml.fns.mpb.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001InsertMetPbokLifecMngLdgPk_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_LIFEC_MNG_LDG001UpdateMetPbokLifecMngLdgPk_DIDT;

/**
 * 모임통장생활비관리원장
 *
 * @author 90190263
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="모임통장생활비관리원장 ", description="모임통장생활비관리원장", author="90190263")
public interface MET_PBOK_LIFEC_MNG_LDG001_DBM
{
	/**
	 * 모임통장생활비관리원장 - Select
	 */
	@BxmCategory(logicalName="모임통장생활비관리원장 - Select", description="모임통장생활비관리원장 - Select(Unique Index)\r\n", author="90190263")
	MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DODT selectMetPbokLifecMngLdgPkInfo(
		MET_PBOK_LIFEC_MNG_LDG001SelectMetPbokLifecMngLdgPkInfo_DIDT metPbokLifecMngLdg001SelectMetPbokLifecMngLdgPkInfo_DIDT
		);
	/**
	 * 모임통장생활비관리원장 - Insert
	 */
	@BxmCategory(logicalName="모임통장생활비관리원장 - Insert", description="모임통장생활비관리원장 - Insert(PK)", author="90190263")
	int insertMetPbokLifecMngLdgPk(
		MET_PBOK_LIFEC_MNG_LDG001InsertMetPbokLifecMngLdgPk_DIDT metPbokLifecMngLdg001InsertMetPbokLifecMngLdgPk_DIDT
		);
	/**
	 * 모임통장생활비관리원장 - Update
	 */
	@BxmCategory(logicalName="모임통장생활비관리원장 - Update", description="모임통장생활비관리원장 - Update(Unique Index)", author="90190263")
	int updateMetPbokLifecMngLdgPk(
		MET_PBOK_LIFEC_MNG_LDG001UpdateMetPbokLifecMngLdgPk_DIDT metPbokLifecMngLdg001UpdateMetPbokLifecMngLdgPk_DIDT
		);
}
