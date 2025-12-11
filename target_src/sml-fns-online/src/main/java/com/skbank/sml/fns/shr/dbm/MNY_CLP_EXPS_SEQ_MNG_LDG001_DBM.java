/**
 * Generated 2024. 10. 23. 13:23:16
 */
package com.skbank.sml.fns.shr.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.shr.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.shr.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.shr.dto.SHRMNPWallBizMNPBscInf_DTO;
import java.util.List;

/**
 * 
 *
 * @author 90190263
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="머니클립노출순서관리.DBM", description="", author="90190263")
public interface MNY_CLP_EXPS_SEQ_MNG_LDG001_DBM
{
	/**
	 * 머니클립노출순서관리 기본정보조회
	 */
	@BxmCategory(logicalName="머니클립노출순서관리 기본정보조회", description="", author="90190263")
	List<SHRMNPWallBizMNPBscInf_DTO> selectMnyClpExpsSeqMng(
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT mNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT
		);
	/**
	 * 머니클립노출순서관리 기본정보등록
	 */
	@BxmCategory(logicalName="머니클립노출순서관리 기본정보등록", description="", author="90190263")
	int insertMnyClpExpsSeqMng(
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT mNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT
		);
}
