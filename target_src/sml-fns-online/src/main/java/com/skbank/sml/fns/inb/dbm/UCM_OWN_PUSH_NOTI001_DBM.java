/**
 * Generated 2024. 07. 17. 15:44:19
 */
package com.skbank.sml.fns.inb.dbm;

import bxm.common.annotaion.BxmCategory;
import bxmc.annotation.dbio.BxmDataAccess;
import com.skbank.sml.fns.inb.dto.INBMyNtfc_DTO;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * 나만의알림DBM
 *
 * @author 90190264
 */
@SuppressWarnings({ "all" })
@BxmDataAccess(datasource = "biz-ds")
@BxmCategory(logicalName="나만의알림DBM", description="나만의알림DBM", author="90190264")
public interface UCM_OWN_PUSH_NOTI001_DBM
{
	/**
	 * 나만의알림조회
	 */
	@BxmCategory(logicalName="나만의알림조회", description="나만의알림조회", author="90190264")
	List<INBMyNtfc_DTO> selectMyNtfcList(
		@Param("itcsno")String itcsno
		);
	/**
	 * 나만의알림수정
	 */
	@BxmCategory(logicalName="나만의알림수정", description="나만의알림 PUSH 동의여부를 수정 한다.", author="90190264")
	int updateMyNtfc(
		INBMyNtfc_DTO iNBMyNtfc_DTO
		);
	/**
	 * 나만의알림삭제
	 */
	@BxmCategory(logicalName="나만의알림삭제", description="나만의알림삭제", author="90190264")
	int deleteMyNtfc(
		INBMyNtfc_DTO iNBMyNtfc_DTO
		);
	/**
	 * 나만의알림등록
	 */
	@BxmCategory(logicalName="나만의알림등록", description="나만의알림등록", author="90190264")
	int insertMyNtfc(
		INBMyNtfc_DTO iNBMyNtfc_DTO
		);
	/**
	 * 나만의알림상세조회
	 */
	@BxmCategory(logicalName="나만의알림상세조회", description="나만의알림상세조회", author="90190264")
	INBMyNtfc_DTO selectMyNtfcDtl(
		INBMyNtfc_DTO iNBMyNtfc_DTO
		);
}
