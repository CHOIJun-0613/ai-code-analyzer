/**
 * Generated 2025. 01. 08. 16:45:05
 */
package com.skbank.sml.fns.shr.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.shr.dto.SHRINBPushBscInf_DTO;

/**
 * 토큰으로 PUSH 기본정보 조회한다.
 *
 * @author 90190264
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="PUSH 기본정보조회", description="토큰으로 PUSH 기본정보 조회한다.", author="90190264")
public interface UADS_SMT_BNKG_PUSH_USER_INF001_DBM
{
	/**
	 * push 기본정보 조회
	 */
	@BxmCategory(logicalName="push 기본정보 조회", description="PUSH 기본정보를 조회한다.", author="90190264")
	SHRINBPushBscInf_DTO selectPushBscInf(
		SHRINBPushBscInf_DTO sHRINBPushBscInf_DTO
		);
	/**
	 * Push 삭제 여부 수정
	 */
	@BxmCategory(logicalName="Push 삭제 여부 수정", description="Push 삭제여부를 수정한다.", author="90190264")
	int updatePushDelYn(
		SHRINBPushBscInf_DTO sHRINBPushBscInf_DTO
		);
	/**
	 * Push 정보 수정
	 */
	@BxmCategory(logicalName="Push 정보 수정", description="알림 받는 PUSH 정보를 업데이트 한다.", author="90190264")
	int updatePushInf(
		SHRINBPushBscInf_DTO sHRINBPushBscInf_DTO
		);
	/**
	 * PUSH 기본정보 등록
	 */
	@BxmCategory(logicalName="PUSH 기본정보 등록", description="PUSH 기본정보 등록한다", author="90190264")
	int insertPushBscInf(
		SHRINBPushBscInf_DTO sHRINBPushBscInf_DTO
		);
	/**
	 * UMS 푸시사용자원장(UMS사용자정보EAI인터페이스) 디퍼드 등록
	 */
	@BxmCategory(logicalName="UMS 푸시사용자원장(UMS사용자정보EAI인터페이스) 디퍼드 등록", description="UMS 푸시사용자원장(UMS사용자정보EAI인터페이스) 디퍼드 등록", author="90190264")
	int insertUmsPushUserLdg(
		SHRINBPushBscInf_DTO sHRINBPushBscInf_DTO
		);
	/**
	 * PUSH 동의 여부 수정
	 */
	@BxmCategory(logicalName="PUSH 동의 여부 수정", description="PUSH 동의 여부 수정", author="90190264")
	int updatePushAgrYn(
		SHRINBPushBscInf_DTO sHRINBPushBscInf_DTO
		);
	/**
	 * PUSH기타정보업데이트
	 */
	@BxmCategory(logicalName="PUSH기타정보업데이트", description="PUSH기타 항목들을 업데이트 한다.", author="90190264")
	int updatePushEtcInf(
		SHRINBPushBscInf_DTO sHRINBPushBscInf_DTO
		);
	/**
	 * 미로그인 push 기본정보 조회
	 */
	@BxmCategory(logicalName="미로그인 push 기본정보 조회", description="미로그인 사용자의 push 기본정보 조회", author="90190264")
	SHRINBPushBscInf_DTO selectNlginPushBscInf(
		SHRINBPushBscInf_DTO sHRINBPushBscInf_DTO
		);
	/**
	 * 푸시기본원장MERGE
	 */
	@BxmCategory(logicalName="푸시기본원장MERGE", description="푸시기본원장MERGE", author="90190264")
	int mergePushBscInf(
		SHRINBPushBscInf_DTO sHRINBPushBscInf_DTO
		);
}
