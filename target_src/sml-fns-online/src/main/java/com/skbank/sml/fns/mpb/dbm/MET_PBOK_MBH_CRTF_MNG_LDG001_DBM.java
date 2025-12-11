/**
 * Generated 2024. 12. 26. 14:20:45
 */
package com.skbank.sml.fns.mpb.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import bxmc.annotation.dbio.TestValue;
import bxmc.annotation.dbio.TestValues;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokMbhScss_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT;
import java.util.List;

/**
 * 
 *
 * @author 90190263
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="모임통장.대기.회원001.DBM", description="", author="90190263")
public interface MET_PBOK_MBH_CRTF_MNG_LDG001_DBM
{
	/**
	 * 모임통장.대기.회원.정보.조회
	 */
	@TestValues({
		@TestValue(values="metMngNo=000000043,itcsno=78969618992")
	})
	@BxmCategory(logicalName="모임통장.대기.회원.정보.조회", description="", author="90190263")
	MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DODT selectMetPbokWaitMbhInf(
		MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT mET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhInf_DIDT
		);
	/**
	 * 모임통장.대기.회원.목록.조회
	 */
	@BxmCategory(logicalName="모임통장.대기.회원.목록.조회", description="", author="90190263")
	List<MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DODT> selectMetPbokWaitMbhList(
		MET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DIDT mET_PBOK_MBH_CRTF_MNG_LDG001SelectMetPbokWaitMbhList_DIDT
		);
	/**
	 * 모임통장.대기.회원.정보.등록
	 */
	@BxmCategory(logicalName="모임통장.대기.회원.정보.등록", description="", author="90190263")
	int insertMetPbokWaitMbhInf(
		MET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT mET_PBOK_MBH_CRTF_MNG_LDG001InsertMetPbokWaitMbhInf_DIDT
		);
	/**
	 * 모임통장.대기.회원.정보.수정
	 */
	@BxmCategory(logicalName="모임통장.대기.회원.정보.수정", description="", author="90190263")
	int updateMetPbokWaitMbhInf(
		MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhInf_DIDT mET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhInf_DIDT
		);
	/**
	 * 모임통장회원탈퇴
	 */
	@BxmCategory(logicalName="모임통장회원탈퇴", description="", author="90190263")
	int updateMetPbokMbhScss(
		MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokMbhScss_DIDT mET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokMbhScss_DIDT
		);
	/**
	 * 모임통장.대기.회원.대표자.정보.수정
	 */
	@BxmCategory(logicalName="모임통장.대기.회원.대표자.정보.수정", description="", author="90190263")
	int updateMetPbokWaitMbhRppeInf(
		MET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT mET_PBOK_MBH_CRTF_MNG_LDG001UpdateMetPbokWaitMbhRppeInf_DIDT
		);
}
