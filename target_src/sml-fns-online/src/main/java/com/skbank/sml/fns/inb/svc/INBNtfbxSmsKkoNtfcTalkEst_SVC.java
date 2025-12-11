package com.skbank.sml.fns.inb.svc;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import com.skbank.sml.bsc.shr.com.SHRAllActInqTbk_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMInterfaceCfg_COM;
import com.skbank.sml.cmm.shr.com.SHRCMMLoginSession_COM;
import com.skbank.sml.cmm.shr.dto.BSC_ACT_INFO;
import com.skbank.sml.cmm.shr.dto.BSC_ACT_LIST;
import com.skbank.sml.cmm.shr.dto.CMM_CURRENT_CUST;
import com.skbank.sml.fns.inb.cst.cstt.INBCmmConstant;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT;
import com.skbank.sml.fns.inb.ctr.dto.INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT;
import com.skbank.sml.fxd.shr.com.SHRFgrmtArvNtc_COM;
import com.skbank.sml.fxd.shr.dto.SHRFgrmtArvNtcSrvcJnngYn_DTO;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0002398_IDT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0002398_ODT;
import com.skbank.sml.ifi.mca.eims8.dto.IBSMR0002398_REPT_FA_ODT;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0000847_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0001066_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0002398_COM;
import com.skbank.sml.ifi.shr.com.SHRIBSMR0002535_COM;
import com.skbank.sml.pds.shr.com.SHRFndGdncSrvcRgsPrtsInq_COM;
import com.skbank.sml.pds.shr.com.SHRIRPDcFunction_COM;
import com.skbank.sml.pds.shr.com.SHRTptaActInfInq_COM;
import com.skbank.sml.pds.shr.dto.SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqIDT_DTO;
import com.skbank.sml.pds.shr.dto.SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqODT_DTO;

import bxm.common.annotaion.BxmCategory;
import fwk.skbank.asis.adaptor.dto.request.WFInterfaceCfg;
import fwk.skbank.asis.adaptor.dto.response.WFInfResponse;
import fwk.skbank.asis.adaptor.exception.SFAdaptorException;
import fwk.skbank.online.context.WFApplicationContext;
import fwk.skbank.online.exception.app.WFApplicationException;
import fwk.skbank.online.exception.frm.SFAdaptorApplicationException;
import fwk.skbank.online.exception.frm.SFInterfaceSystemException;
import fwk.skbank.online.util.WFDateUtils;
import fwk.skbank.online.util.WFStringUtils;

/**
 * 1.업무명 : 금융서비스
 * 2.단위업무명 : NEWWON 중분류 통합알림함  
 * 3.프로그램명 : 알림함.SMS.카카오알림톡.설정.서비스
 * 4.설명 : 통합알림함SMS설정 서비스
 * 
 * @Class INBNtfbxSmsKkoNtfcTalkEst_SVC.java
 * @author 90190264
 * @since 2024.04.03
 * @version 1.0
 */		
@Service
@BxmCategory(logicalName="알림함.SMS.카카오알림톡.설정.서비스", description="통합알림함SMS설정 서비스")
public class INBNtfbxSmsKkoNtfcTalkEst_SVC {
	private Logger logger= LoggerFactory.getLogger(getClass());
	/**
	 * WFInterfaceCfg 생성 컴포넌트
	 */
	private SHRCMMInterfaceCfg_COM sHRCMMInterfaceCfg_COM;
	/**
	 * SHRCMMLoginSession 생성 컴포넌트
	 */
	private SHRCMMLoginSession_COM shrCMMLoginSession_COM; 
	/**
	 * SHRIBSMR0002535_COM 생성 컴포넌트
	 */
	private SHRIBSMR0002535_COM sHRIBSMR0002535_COM; 
	/**
	 * SHRIBSMR0001066_COM 생성 컴포넌트
	 */
	private SHRIBSMR0001066_COM sHRIBSMR0001066_COM; 
	/**
	 * SHRIBSMR0000847_COM 생성 컴포넌트
	 */
	private SHRIBSMR0000847_COM sHRIBSMR0000847_COM; 
	/**
	 * SHRIBSMR0002398_COM 생성 컴포넌트
	 */
	private SHRIBSMR0002398_COM sHRIBSMR0002398_COM; 
	/**
	 * SHRIBSMR0002398_COM 생성 컴포넌트(펀드안내서비스등록내역조회)
	 */
	private SHRFndGdncSrvcRgsPrtsInq_COM shrFndGdncSrvcRgsPrtsInq_COM; 
	/**
	 * 대출안내알림서비스 COM
	 */
	private SHRAllActInqTbk_COM sHRAllActInqTbk_COM;
	/**
	 * 일임형 isa 손실률 문자 수신관리 COM
	 */
	private SHRTptaActInfInq_COM sHRTptaActInfInq_COM;
	/**
	 * 해외송금도착 통지 서비스 COM
	 */
	private SHRFgrmtArvNtc_COM sHRFgrmtArvNtc_COM;
	/**
	 * 퇴직연금 상품가입 COM  
	 */
	private SHRIRPDcFunction_COM sHRIRPDcFunction_COM;
	
	/**
	 * SMS.카카오알림톡.설정.조회 
	 * 
	 * @param input SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.입력.IO
	 * @return SMS.카카오알림톡.설정.서비스가입여부.컨트롤러.출력.IO
	 */
	@BxmCategory(logicalName="SMS.카카오알림톡.설정.조회", description="SMS.카카오알림톡.설정.조회", author="90190264")
	public INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT selectSmsKkoNtfcTalkEst(INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_IDT input)
	{
			
		/**
		* @BXMType GetBean
		*/
		shrCMMLoginSession_COM = WFApplicationContext.getBean(shrCMMLoginSession_COM, SHRCMMLoginSession_COM.class);
		sHRCMMInterfaceCfg_COM = WFApplicationContext.getBean(sHRCMMInterfaceCfg_COM, SHRCMMInterfaceCfg_COM.class);
		sHRIBSMR0002398_COM = WFApplicationContext.getBean(sHRIBSMR0002398_COM, SHRIBSMR0002398_COM.class);
		shrFndGdncSrvcRgsPrtsInq_COM = WFApplicationContext.getBean(shrFndGdncSrvcRgsPrtsInq_COM, SHRFndGdncSrvcRgsPrtsInq_COM.class);
		
		sHRAllActInqTbk_COM = WFApplicationContext.getBean(sHRAllActInqTbk_COM, SHRAllActInqTbk_COM.class);  
		sHRTptaActInfInq_COM = WFApplicationContext.getBean(sHRTptaActInfInq_COM, SHRTptaActInfInq_COM.class);  
		sHRFgrmtArvNtc_COM = WFApplicationContext.getBean(sHRFgrmtArvNtc_COM, SHRFgrmtArvNtc_COM.class);  
		sHRIRPDcFunction_COM = WFApplicationContext.getBean(sHRIRPDcFunction_COM, SHRIRPDcFunction_COM.class);  
			
		/**
		 * @BXMType VariableDeclaration
		 */
		INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT output= new INBNtfbxSmsKkoNtfcTalkEstSelectSmsKkoNtfcTalkEst_ODT();
		output.setSmsSrvcNtfcId(input.getSmsSrvcNtfcId());
		
		//세션고객정보
		CMM_CURRENT_CUST currentCust = shrCMMLoginSession_COM.getLoginSession();
		
		/**
		 * @BXMType Try
		 * sms/카카오알림톡 설정 목록 조회
		 */
		// 로그인 체크
		if (shrCMMLoginSession_COM.istLogin()) {
			/**
			 * 대출안내 알림서비스
			 * */
			if(INBCmmConstant.SMS_SRVC_LN_GDNC.equals(input.getSmsSrvcNtfcId())) {
				try {
					// 공유컴포넌트 통해서 여신계좌목록 저장 
					BSC_ACT_LIST lonlist = sHRAllActInqTbk_COM.selectSessActList("LON", true); 
					
					for(BSC_ACT_INFO bscActInfo : lonlist.getActList()) {
						String lactYn = bscActInfo.getLactYn();								// 일반대출계좌여부
						String psklActYn = bscActInfo.getPsklActYn();						// 한도대출계좌여부
						
						if("Y".equalsIgnoreCase(lactYn) || "Y".equalsIgnoreCase(psklActYn)) {
							output.setLnGdncNtfcSrvcJnngYn("Y");
							break;
						} else {
							output.setLnGdncNtfcSrvcJnngYn("N");
						}
					}
					
				} catch(WFApplicationException e){
					logger.error("대출안내 알림서비스 WFApplicationException error :: {}", e);
					logger.error("대출안내 알림서비스 WFApplicationException error :: {}", e.getCode());
					output.setLnGdncNtfcSrvcJnngYn("");
				} catch(Exception e){
					logger.error("대출안내 알림서비스 WFApplicationException error :: {}", e);
					logger.error("대출안내 알림서비스 WFApplicationException error :: {}", e.getMessage());
					output.setLnGdncNtfcSrvcJnngYn("");
				}
			}
			// 대출안내 알림서비스 종료
			
			/**
			 * ISA 일임형 계좌정보조회
			 * */
			if(INBCmmConstant.SMS_SRVC_ISAE.equals(input.getSmsSrvcNtfcId())) {
				try {
					// Bean선언 및 메소드 호출
					String tptaIsaLossRtChrDpsMnJnngYn = sHRTptaActInfInq_COM.selectTptaActInf();
					
					output.setTptaIsaLossRtChrDpsMnJnngYn(WFStringUtils.isEmpty(tptaIsaLossRtChrDpsMnJnngYn) ? "N" : "Y");
					
				} catch( SFInterfaceSystemException e) {
					logger.error("ISA 일임형 계좌정보조회 SFInterfaceSystemException!! {}", e);
					logger.error("ISA 일임형 계좌정보조회 SFInterfaceSystemException!! {}", e.getMsgId());
					// 0001 : 해당사용자의 계좌를 찾을수가 없습니다.
					if("0001".equals(e.getMsgId())) {
						output.setTptaIsaLossRtChrDpsMnJnngYn("N");
					} else {
						output.setTptaIsaLossRtChrDpsMnJnngYn("");
					}
				} catch(WFApplicationException e){
					logger.error("ISA 일임형 계좌정보조회 WFApplicationException error :: {}", e);
					logger.error("ISA 일임형 계좌정보조회 WFApplicationException error :: {}", e.getCode());
					output.setTptaIsaLossRtChrDpsMnJnngYn("");
				} catch(Exception e){
					logger.error("ISA 일임형 계좌정보조회 Exception error :: {}", e);
					logger.error("ISA 일임형 계좌정보조회 Exception error :: {}", e.getMessage());
					output.setTptaIsaLossRtChrDpsMnJnngYn("");
				}
			}
			// ISA 일임형 계좌정보조회 종료
			
			/**
			 * 해외송금도착 통지 서비스
			 * */
			if(INBCmmConstant.SMS_SRVC_FGRMT.equals(input.getSmsSrvcNtfcId())) {
				try {
					SHRFgrmtArvNtcSrvcJnngYn_DTO fgrmtArvNtcSrvcJnngYnDto = sHRFgrmtArvNtc_COM.selectSrvcJnngYn();
					
					output.setFgrmtArvNtcSrvcJnngYn(fgrmtArvNtcSrvcJnngYnDto.isJnngYn() ? "Y" : "N");
					
				} catch(SFAdaptorApplicationException e){
					logger.error("해외송금도착 통지 서비스 SFAdaptorApplicationException!! {} ", e);
					logger.error("해외송금도착 통지 서비스 SFAdaptorApplicationException!! {} ", e.getCode());
					// IFIE0001: 해당 데이타가 없습니다.
					if("IFIE0001".equals(e.getCode())) {
						output.setFgrmtArvNtcSrvcJnngYn("N");
					} else {
						output.setFgrmtArvNtcSrvcJnngYn("");
					}
				} catch( SFInterfaceSystemException e) {
					logger.error("해외송금도착 통지 서비스 SFInterfaceSystemException!! {}", e);
					logger.error("해외송금도착 통지 서비스 SFInterfaceSystemException!! {}", e.getMsgId());
					// BEFEX47834: 해당 데이타가 없습니다.
					if("BEFEX47834".equals(e.getMsgId())) {
						output.setFgrmtArvNtcSrvcJnngYn("N");
					} else {
						output.setFgrmtArvNtcSrvcJnngYn("");
					}
				} catch(WFApplicationException e){
					logger.error("해외송금도착 통지 서비스 WFApplicationException error :: {}", e);
					logger.error("해외송금도착 통지 서비스 WFApplicationException error :: {}", e.getCode());
					output.setFgrmtArvNtcSrvcJnngYn("");
				} catch(Exception e){
					logger.error("해외송금도착 통지 서비스 WFApplicationException error :: {}", e);
					logger.error("해외송금도착 통지 서비스 WFApplicationException error :: {}", e.getMessage());
					output.setFgrmtArvNtcSrvcJnngYn("");
				}
			}
			// 해외송금도착 통지 서비스 종료
			
			/**
			 * 퇴직연금 수익률 알림 서비스
			 * */
			if(INBCmmConstant.SMS_SRVC_RTPEN_PTRT.equals(input.getSmsSrvcNtfcId())) {
				try {
					// 퇴직연금 펀드 상품 가입: Y, N
//					output.setRtpenPtrtNtfcSrvcJnngYn(sHRIRPDcFunction_COM.isIRPrpsYn());
				} catch(WFApplicationException e){
					logger.error("퇴직연금 알림서비스 WFApplicationException error :: {}", e);
					logger.error("퇴직연금 알림서비스 WFApplicationException error :: {}", e.getCode());
					output.setRtpenPtrtNtfcSrvcJnngYn("");
				} catch(Exception e){
					logger.error("퇴직연금 알림서비스 WFApplicationException error :: {}", e);
					logger.error("퇴직연금 알림서비스 WFApplicationException error :: {}", e.getMessage());
					output.setRtpenPtrtNtfcSrvcJnngYn("");
				}
			}
			// 퇴직연금 수익률 알림 서비스 & 퇴직연금 DC입금 알림서비스
			
			/**
			 * 퇴직연금 DC입금 알림서비스
			 * */
			if(INBCmmConstant.SMS_SRVC_RTPEN_DC.equals(input.getSmsSrvcNtfcId())) {
				try {
					// 퇴직연금 DC 가입유무: Y, N
//					output.setRtpenDcRcvNtfcSrvcJnngYn(sHRIRPDcFunction_COM.isDcrpsYn());
				} catch(WFApplicationException e){
					logger.error("퇴직연금 DC입금 알림서비스 WFApplicationException error :: {}", e);
					logger.error("퇴직연금 DC입금 알림서비스 WFApplicationException error :: {}", e.getCode());
					output.setRtpenDcRcvNtfcSrvcJnngYn("");
				} catch(Exception e){
					logger.error("퇴직연금 DC입금 알림서비스 WFApplicationException error :: {}", e);
					logger.error("퇴직연금 DC입금 알림서비스 WFApplicationException error :: {}", e.getMessage());
					output.setRtpenDcRcvNtfcSrvcJnngYn("");
				}
			}
			// 퇴직연금 DC입금 알림서비스
			
			/**
			 * 포트폴리오 서비스 SHR
			 * */
			if(INBCmmConstant.SMS_SRVC_PRTF.equals(input.getSmsSrvcNtfcId())) {
				try {
					SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqIDT_DTO shrFndNtfcSrvcInDto = new SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqIDT_DTO();
					
					shrFndNtfcSrvcInDto.setUserId(currentCust.getUserId());    				// 사용자ID 
					shrFndNtfcSrvcInDto.setItcsno(currentCust.getItcsno());        			// 통합고객번호 
					shrFndNtfcSrvcInDto.setPrtfGdncSrvcInqYn("Y");        						// 포트폴리오안내서비스조회여부                                             
					shrFndNtfcSrvcInDto.setAtsNcmplGdncSrvcInqYn("N");    					// 자동이체미완료안내서비스조회여부                                             
					shrFndNtfcSrvcInDto.setAtsXprGdncSrvcInqYn("N");        					// 자동이체만기안내서비스조회여부                                             
					shrFndNtfcSrvcInDto.setFndGdncSrvcInqYn("N");        						// 펀드안내서비스조회여부                                     
					
				    SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqODT_DTO shrFndNtfcSrvcOutDto =  shrFndGdncSrvcRgsPrtsInq_COM.selectRgsPrtsInq(shrFndNtfcSrvcInDto);
				    if(logger.isDebugEnabled()) {
						logger.debug("shrFndGdncSrvcRgsPrtsInq_COM.selectRgsPrtsInq ====== {} ::: ", shrFndNtfcSrvcOutDto);
					}
				    
				    if(ObjectUtils.isEmpty(shrFndNtfcSrvcOutDto)) {
				    	output.setPrtfGdncSrvdJnngYn("N");																	// 포트폴리오안내서비스 가입여부
				    } else {
				    	output.setPrtfGdncSrvdJnngYn(shrFndNtfcSrvcOutDto.getPrtfGdncSrvcRgsYn());			// 포트폴리오안내서비스 가입여부
				    }
				} catch(WFApplicationException e){
		        	logger.error("포트폴리오 서비스 WFApplicationException error :: {}", e);
		        	logger.error("포트폴리오 서비스 WFApplicationException error :: {}", e.getCode());
		        	output.setPrtfGdncSrvdJnngYn("");								// 포트폴리오안내서비스 가입여부
				} catch(Exception e){
					logger.error("포트폴리오 서비스 WFApplicationException error :: {}", e);
		        	logger.error("포트폴리오 서비스 WFApplicationException error :: {}", e.getMessage());
		        	output.setPrtfGdncSrvdJnngYn("");								// 포트폴리오안내서비스 가입여부
				}
			}
			// 포트폴리오 서비스 SHR 종료
			
			/**
			 * 펀드 자동이체 서비스 SHR
			 * */
			if(INBCmmConstant.SMS_SRVC_FND_ATS.equals(input.getSmsSrvcNtfcId())) {
				try {
					SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqIDT_DTO shrFndNtfcSrvcInDto = new SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqIDT_DTO();
					
					shrFndNtfcSrvcInDto.setUserId(currentCust.getUserId());    				// 사용자ID 
					shrFndNtfcSrvcInDto.setItcsno(currentCust.getItcsno());        			// 통합고객번호 
					shrFndNtfcSrvcInDto.setPrtfGdncSrvcInqYn("N");        						// 포트폴리오안내서비스조회여부                                             
					shrFndNtfcSrvcInDto.setAtsNcmplGdncSrvcInqYn("Y");    					// 자동이체미완료안내서비스조회여부                                             
					shrFndNtfcSrvcInDto.setAtsXprGdncSrvcInqYn("Y");        					// 자동이체만기안내서비스조회여부                                             
					shrFndNtfcSrvcInDto.setFndGdncSrvcInqYn("N");        						// 펀드안내서비스조회여부                                     
					
				    SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqODT_DTO shrFndNtfcSrvcOutDto =  shrFndGdncSrvcRgsPrtsInq_COM.selectRgsPrtsInq(shrFndNtfcSrvcInDto);
				    
				    if(ObjectUtils.isEmpty(shrFndNtfcSrvcOutDto)) {
				    	output.setFndAtsXprNprcNtcSrvcJnngYn("N");	 													// 펀드자동이체만기통보서비스 가입여부
				    } else {
				    	// 자동이체 미완료, 자동이체 만기 안내 서비스 중 하나라도 가입 되어 있으면 Y
				    	if("Y".equals(shrFndNtfcSrvcOutDto.getAtsNcmplGdncSrvcRgsYn()) || "Y".equals(shrFndNtfcSrvcOutDto.getAtsXprGdncSrvcRgsYn())) {
				    		output.setFndAtsXprNprcNtcSrvcJnngYn("Y");	 												// 펀드자동이체만기통보서비스 가입여부
				    	} else {
				    		output.setFndAtsXprNprcNtcSrvcJnngYn("N");	 												// 펀드자동이체만기통보서비스 가입여부
				    	}
				    }
				} catch(WFApplicationException e){
		        	logger.error("펀드  자동이체 서비스 WFApplicationException error :: {}", e);
		        	logger.error("펀드  자동이체 서비스 WFApplicationException error :: {}", e.getCode());
			    	output.setFndAtsXprNprcNtcSrvcJnngYn("");	 				// 펀드자동이체만기통보서비스 가입여부
				} catch(Exception e){
					logger.error("펀드  자동이체 서비스 WFApplicationException error :: {}", e);
		        	logger.error("펀드  자동이체 서비스 WFApplicationException error :: {}", e.getMessage());
			    	output.setFndAtsXprNprcNtcSrvcJnngYn("");	 				// 펀드자동이체만기통보서비스 가입여부
				}
			}
			// 펀드 자동이체 서비스 SHR 종료
			
			/**
			 * 펀드 안내 서비스 SHR
			 * */
			if(INBCmmConstant.SMS_SRVC_FND_GDNC.equals(input.getSmsSrvcNtfcId())) {
				try {
					SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqIDT_DTO shrFndNtfcSrvcInDto = new SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqIDT_DTO();
					
					shrFndNtfcSrvcInDto.setUserId(currentCust.getUserId());    				// 사용자ID 
					shrFndNtfcSrvcInDto.setItcsno(currentCust.getItcsno());        			// 통합고객번호 
					shrFndNtfcSrvcInDto.setPrtfGdncSrvcInqYn("N");        						// 포트폴리오안내서비스조회여부                                             
					shrFndNtfcSrvcInDto.setAtsNcmplGdncSrvcInqYn("N");    					// 자동이체미완료안내서비스조회여부                                             
					shrFndNtfcSrvcInDto.setAtsXprGdncSrvcInqYn("N");        					// 자동이체만기안내서비스조회여부                                             
					shrFndNtfcSrvcInDto.setFndGdncSrvcInqYn("Y");        						// 펀드안내서비스조회여부                                     
					
				    SHRFndGdncSrvcRgsPrtsInqSelectRgsPrtsInqODT_DTO shrFndNtfcSrvcOutDto =  shrFndGdncSrvcRgsPrtsInq_COM.selectRgsPrtsInq(shrFndNtfcSrvcInDto);
				    
				    if(ObjectUtils.isEmpty(shrFndNtfcSrvcOutDto)) {
				    	output.setFndGdncSrvcJnngYn("N"); 																	// 펀드안내서비스 가입여부
				    } else {
				    	output.setFndGdncSrvcJnngYn(shrFndNtfcSrvcOutDto.getFndGdncSrvcRgsYn()); 		// 펀드안내서비스 가입여부
				    }
				} catch(WFApplicationException e){
		        	logger.error("펀드  자동이체 서비스 WFApplicationException error :: {}", e);
		        	logger.error("펀드  자동이체 서비스 WFApplicationException error :: {}", e.getCode());
			    	output.setFndGdncSrvcJnngYn("");	 								// 펀드안내서비스 가입여부
				} catch(Exception e){
					logger.error("펀드  자동이체 서비스 WFApplicationException error :: {}", e);
		        	logger.error("펀드  자동이체 서비스 WFApplicationException error :: {}", e.getMessage());
			    	output.setFndGdncSrvcJnngYn("");	 								// 펀드안내서비스 가입여부
				}
			}
			// 펀드 안내 서비스 SHR 종료
		} else {
			//  로그인 세션이 존재하지 않습니다.
			throw new WFApplicationException("CMME0018");
		}
		
		
		return output;
			
	}
		
}
