/**
 * Generated 2024. 10. 23. 13:48:36
 */
package com.skbank.sml.fns.mnp.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.mnp.dto.MNPBscInf_DTO;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT;
import com.skbank.sml.fns.mnp.dto.MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMUpdateMnyClpExpsSeqMng_DIDT;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author 90190263
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="머니클립노출순서관리.DBM", description="", author="90190263")
public interface MNY_CLP_EXPS_SEQ_MNG001_DBM
{
	/**
	 * 머니클립노출순서관리 기본정보조회
	 */
	@BxmCategory(logicalName="머니클립노출순서관리 기본정보조회", description="", author="90190263")
	List<MNPBscInf_DTO> selectMnyClpExpsSeqMng(
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT mNY_CLP_EXPS_SEQ_MNG_LDG001_DBMSelectMnyClpExpsSeqMng_DIDT
		);
	/**
	 * 머니클립노출순서관리 기본정보등록
	 */
	@BxmCategory(logicalName="머니클립노출순서관리 기본정보등록", description="", author="90190263")
	int insertMnyClpExpsSeqMng(
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT mNY_CLP_EXPS_SEQ_MNG_LDG001_DBMInsertMnyClpExpsSeqMng_DIDT
		);
	/**
	 * 머니클립노출순서관리 기본정보수정
	 */
	@BxmCategory(logicalName="머니클립노출순서관리 기본정보수정", description="", author="90190263")
	int updateMnyClpExpsSeqMng(
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMUpdateMnyClpExpsSeqMng_DIDT mNY_CLP_EXPS_SEQ_MNG_LDG001_DBMUpdateMnyClpExpsSeqMng_DIDT
		);
	/**
	 * 머니클립노출순서관리 기본정보삭제
	 */
	@BxmCategory(logicalName="머니클립노출순서관리 기본정보삭제", description="", author="90190263")
	int deleteMnyClpExpsSeqMng(
		MNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMng_DIDT mNY_CLP_EXPS_SEQ_MNG_LDG001_DBMDeleteMnyClpExpsSeqMng_DIDT
		);
	/**
	 * 머니클립노출순서목록 삭제
	 */
	@BxmCategory(logicalName="머니클립노출순서목록 삭제", description="머니클립노출순서목록을 삭제한다.", author="90190264")
	int deleteMnyClpExpsSeqMngList(
		@Param("itcsno")String itcsno
		, @Param("mnyClpMoAcno")String mnyClpMoAcno
		);
}
