/**
 * Generated 2024. 10. 14. 11:17:06
 */
package com.skbank.sml.fns.mpb.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001InsertNtarinf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001SelectNtarinf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001SelectNtarinf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT;

/**
 * 
 *
 * @author 90190263
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="공지사항.정보.관리001.DBM", description="", author="90190263")
public interface MET_PBOK_NTAR_INF001_DBM
{
	/**
	 * 공지사항.정보.조회
	 */
	@BxmCategory(logicalName="공지사항.정보.조회", description="", author="90190263")
	MET_PBOK_NTAR_INF001SelectNtarinf_DODT selectNtarinf(
		MET_PBOK_NTAR_INF001SelectNtarinf_DIDT mET_PBOK_NTAR_INF001SelectNtarinf_DIDT
		);
	/**
	 * 공지사항.정보.등록
	 */
	@BxmCategory(logicalName="공지사항.정보.등록", description="", author="90190263")
	int insertNtarinf(
		MET_PBOK_NTAR_INF001InsertNtarinf_DIDT mET_PBOK_NTAR_INF001InsertNtarinf_DIDT
		);
	/**
	 * 공지사항.정보.수정
	 */
	@BxmCategory(logicalName="공지사항.정보.수정", description="", author="90190263")
	int updateNtarinf(
		MET_PBOK_NTAR_INF001UpdateNtarinf_DIDT mET_PBOK_NTAR_INF001UpdateNtarinf_DIDT
		);
}
