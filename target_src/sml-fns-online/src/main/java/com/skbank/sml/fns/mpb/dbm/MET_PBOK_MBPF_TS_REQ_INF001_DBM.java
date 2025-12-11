/**
 * Generated 2024. 09. 05. 15:19:25
 */
package com.skbank.sml.fns.mpb.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001InsertTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DODT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqInf_DIDT;
import com.skbank.sml.fns.mpb.dto.MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 
 *
 * @author 90190263
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="모임통장.이체.요청.정보001.DBM", description="", author="90190263")
public interface MET_PBOK_MBPF_TS_REQ_INF001_DBM
{
	/**
	 * 전체이체요청건수
	 */
	@BxmCategory(logicalName="전체이체요청건수", description="", author="90190263")
	Integer selectAllTsReqCnt(
		MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT mET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqCnt_DIDT
		);
	/**
	 * 모임원이체요청정보조회
	 */
	@BxmCategory(logicalName="모임원이체요청정보조회", description="", author="90190263")
	List<MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DODT> selectMbhTsReqInf(
		MET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DIDT mET_PBOK_MBPF_TS_REQ_INF001SelectMbhTsReqInf_DIDT
		);
	/**
	 * 전체이체요청정보조회
	 */
	@BxmCategory(logicalName="전체이체요청정보조회", description="", author="90190263")
	List<MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DODT> selectAllTsReqInf(
		@Param("inData")MET_PBOK_MBPF_TS_REQ_INF001SelectAllTsReqInf_DIDT inData
		);
	/**
	 * 이체요청정보등록
	 */
	@BxmCategory(logicalName="이체요청정보등록", description="", author="90190263")
	int insertTsReqInf(
		MET_PBOK_MBPF_TS_REQ_INF001InsertTsReqInf_DIDT mET_PBOK_MBPF_TS_REQ_INF001InsertTsReqInf_DIDT
		);
	/**
	 * 이체요청정보수정
	 */
	@BxmCategory(logicalName="이체요청정보수정", description="", author="90190263")
	int updateTsReqInf(
		MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqInf_DIDT mET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqInf_DIDT
		);
	/**
	 * 이체요청상태수정
	 */
	@BxmCategory(logicalName="이체요청상태수정", description="", author="90190263")
	int updateTsReqStcd(
		MET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT mET_PBOK_MBPF_TS_REQ_INF001UpdateTsReqStcd_DIDT
		);
	/**
	 * 이체요청정보삭제
	 */
	@BxmCategory(logicalName="이체요청정보삭제", description="", author="90190263")
	int deleteTsReqInf(
		MET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT mET_PBOK_MBPF_TS_REQ_INF001DeleteTsReqInf_DIDT
		);
	/**
	 * 회비돌려받기정보 조회
	 */
	@BxmCategory(logicalName="회비돌려받기정보 조회", description="", author="90190263")
	MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DODT selectMbpfRtunInf(
		MET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT mET_PBOK_MBPF_TS_REQ_INF001SelectMbpfRtunInf_DIDT
		);
}
