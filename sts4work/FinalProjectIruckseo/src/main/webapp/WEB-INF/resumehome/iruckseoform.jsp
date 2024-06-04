<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://fonts.googleapis.com/css2?family=Dongle&family=IBM+Plex+Sans+KR&family=Nanum+Myeongjo&family=Noto+Sans+KR:wght@100..900&display=swap" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<script src="https://code.jquery.com/jquery-3.7.0.js"></script>
<title>Insert title here</title>
<style type="text/css">
  /* 전체 틀 레이아웃 */
  .all {
      height: 100%;
  }
  
  .center {
      margin: 0 auto;
      width: 100%;
      height: 100%;
      max-width: 980px;
  }
  
  #wrap {
      margin-top: 100px; /* 헤더 들어갈 부분 */
      font-family: 'IBM Plex Sans KR', sans-serif;
  }
  
  .form-caption {
      display: flex;
      align-items: center;
      margin-bottom: 10px;
  }
  
 .form-group {
        display: flex; /* 내용을 가로로 배치 */
        gap: 5px; /* 간격을 5px로 설정 (원하는 만큼 조절 가능) */
        margin-top: 5px;
        align-items: center; /* 요소를 세로로 가운데 정렬 */
    }
  
  /* 인정사항 css */
  .personal {
      margin-top: 8%;
  }
    
  #showimg{
    margin: 10px 10px;
    width: 130px;
    height: 160px;
    border: 0px solid gray;
    
  }  
  
  /*학력*/
  .school {
    margin-top: 8%;
  
  }
  
  /*경력*/
  .career {
    margin-top: 8%;
  }
  
  /*경험*/
  .activity {
    margin-top: 8%;
  }
  
  /*경험 활동 교육*/
  .qualification {
    margin-top: 8%;
  }
  
  /*포트폴리오*/
  .portfolio {
    margin-top: 8%;
  }
  
  /*자기소개*/
  .self {
    margin-top: 8%;
  }
  
  /*희망근무*/
  .hope  {
    margin-top: 8%;
  }
  
  /**/
  .total {
    margin-top: 15%;
  }
  
</style>
</head>
<body>
    <div class="all">
        <div id="wrap">
            <div class="center">
              

                <!-- 이력서 제목 부분 -->
                <div class="title">
                    <form action="insert1" method="post" enctype="multipart/form-data">
                        <table class="" style="width: 100%;">
                            <tr>
                                <td>
                                    <input type="text" class="form-control" style="height: 50px;" placeholder="이력서 제목을 입력해주세요">
                                </td>
                            </tr>
                        </table>
                    </form>
                </div>
                
                <!-- 인정사항 폼 -->
                <div class="personal">
                    <form action="insert2" method="post" enctype="multipart/form-data">
                        <div class="form-caption">
                            <h4><b>인적사항</b></h4>&nbsp;&nbsp;&nbsp;
                            <span style="font-size: 0.8em;">자동입력(사진 및 경력 제외)</span>
                        </div>
                        <hr style="width: 100%;">
                        <table class="" style="width: 100%;">
                          <tr>
						    <td class="form-group">
						        <input type="text" class="form-control" style="width: 150px;" placeholder="이름">
						        <select class="form-select" style="width: 120px;">
						            <option>신입/경력</option>
						            <option>신입</option>
						            <option>경력</option>
						        </select>
						    </td>
						    <td rowspan="4">
						      <input type="file" name="myphoto" id="myphoto" style="display: none;">
						      <span id="plusphoto" style="cursor: pointer;">사진추가</span>
						      <img id="showimg">
						    </td>
						  </tr>
						  
						  
						  <tr>
						    <td class="form-group">
						      <input type="text" class="form-control" style="width: 150px;" placeholder="남/여">
						      <input type="date" class="form-control" style="width: 250px;">
						    </td>
						  </tr>
						  
						  <tr>
						    <td class="form-group">
						      <input type="text" class="form-control" style="width: 200px;" placeholder="메일">
						      <input type="text" class="form-control" style="width: 180px;" placeholder="전화번호">
						      <input type="text" class="form-control" style="width: 180px;" placeholder="핸드폰">
						    </td>
						  </tr>
						  
						  <tr>
						    <td class="form-group">
						      <input type="text" class="form-control" style="width: 350px;" placeholder="주소">
						    </td>
						  </tr>
						  
                        </table>
                    </form>
                </div>
                
                <!-- 학력 폼 -->
                <div class="school">
                    <form action="insert3" method="post" enctype="multipart/form-data">
                        <div class="form-caption">
                            <h4><b>학력</b></h4>&nbsp;&nbsp;&nbsp;
                            <span style="font-size: 0.8em;">*필수정보입력</span>
                        </div>
                        <hr style="width: 100%;">
                        <table class="" style="width: 100%;">
                          <tr>
						    <td class="form-group">
						        <select class="form-select" style="width: 200px;" id="education-select">
						            <option value="none">학력구분 선택*</option>
						            <option value="highschool">고등학교 졸업</option>
						            <option value="university">대학·대학원 이상 졸업</option>
						        </select>
						    </td>
						    
						     <!-- 고등학교 졸업을 선택했을 때 메뉴 -->
                            <tr id="highschool-options" style="display: none;">
                                <td class="form-group">
                                    <input type="checkbox">편입
                                </td>
                            </tr>
                            <tr id="highschool-options-details" style="display: none;">
                                <td class="form-group">
                                    <input type="text" class="form-control" style="width: 200px;" placeholder="학교명*">
                                    <select class="form-select" style="width: 120px;">
                                        <option>졸업여부*</option>
                                        <option>졸업</option>
                                        <option>재학중</option>
                                        <option>휴학중</option>
                                        <option>중퇴</option>
                                        <option>자퇴</option>
                                        <option>졸업예정</option>
                                    </select>
                                    <input type="date" class="form-control" style="width: 120px;">
                                    <input type="date" class="form-control" style="width: 120px;">
                                    <select class="form-select" style="width: 120px;">
                                        <option>전공계열*</option>
                                        <option>문과계열</option>
                                        <option>이과계열</option>
                                        <option>전문(실업)계</option>
                                        <option>예체능계</option>
                                        <option>특성화</option>
                                        <option>특수목적고</option>
                                    </select>
                                </td>
                            </tr>

                            <!-- 대학 대학원 폼 -->
                            <tr id="university-options" style="display: none;">
                                <td class="form-group">
                                    <select class="form-select"  style="width: 120px; display: none;" >
                                        <option>대학구분*</option>
                                        <option>대학(2,3년)</option>
                                        <option>대학(4년)</option>
                                        <option>대학원(석사)</option>
                                        <option>대학원(박사)</option>
                                    </select>
                                    <input type="text" class="form-control" style="width: 200px;" placeholder="학교명*">
                                    <input type="checkbox">편입
                                </td>
                            </tr>
                            <tr id="university-options-details" style="display: none;">
                                <td class="form-group">
                                    <input type="text" class="form-control" style="width: 180px;" placeholder="전공*">
                                    <select class="form-select" style="width: 120px;">
                                        <option>졸업여부*</option>
                                        <option>졸업</option>
                                        <option>재학중</option>
                                        <option>휴학중</option>
                                        <option>중퇴</option>
                                        <option>자퇴</option>
                                        <option>졸업예정</option>
                                    </select>
                                    <input type="date" class="form-control" style="width: 120px;">
                                    <input type="date" class="form-control" style="width: 120px;">
                                    <input type="text" class="form-control" style="width: 80px;" placeholder="학점*">
                                    <select class="form-select" style="width: 120px;">
                                        <option>기준학점*</option>
                                        <option>4.0</option>
                                        <option>4.3</option>
                                        <option>4.5</option>
                                        <option>5.0</option>
                                    </select>
                                </td>
                            </tr>
                            
                            <!-- 저장 취소 버튼 -->
                            <tr>
                              <td colspan="2" align="right">
                              <br>
                                <button type="submit" class="btn btn-outline-primary">저장</button>
                                <button type="button" class="btn btn-outline-primary">취소</button>
                              </td>
                            </tr>
                        </table>
                    </form>
                </div>
                
                
                
                <!-- 경력 -->
                <div class="career">
                    <form action="insert3" method="post" enctype="multipart/form-data">
                        <div class="form-caption">
                            <h4><b>경력</b></h4>&nbsp;&nbsp;&nbsp;
                            <span style="font-size: 0.8em;">*필수정보입력</span>
                            <span style="font-size: 0.8em; color: primary"><a onclick="careerForm">+ 추가하기</a></span>
                        </div>
                        <hr style="width: 100%;">
                        <div id="form-container">
                        <table class="career-form" style="width: 100%;">
                          <tr>
						    <td class="form-group">
						        <input type="text" class="form-control" style="width: 220px;" placeholder="회사명*">
						        <input type="date" class="form-control" style="width: 120px;">
						        <input type="date" class="form-control" style="width: 120px;">
						        <select class="form-select" style="width: 200px;">
						            <option>직무*</option>
						            <option>신입</option>
						            <option>경력</option>
						        </select>
						        <input type="text" class="form-control" style="width: 150px;" placeholder="근무부서">
						        <input type="text" class="form-control" style="width: 150px;" placeholder="직급/직책">
						    </td>
						  </tr>
						  
						  <tr>
						    <td class="form-group">
						      <textarea class="form-control" style="height: 200px;" placeholder="담당업무를 입력해주세요"></textarea>
						    </td>
						  </tr>
						  
						  <!-- 저장 취소 버튼 -->
                            <tr>
                              <td colspan="2" align="right">
                              <br>
                                <button type="submit" class="btn btn-outline-primary">저장</button>
                                <button type="button" class="btn btn-outline-primary">취소</button>
                              </td>
                            </tr>
						  
                        </table>
                        </div>
                    </form>
                </div>
                
                
                <!-- 경험, 활동, 교육 -->
                <div class="activity">
                    <form action="insert4" method="post" enctype="multipart/form-data">
                        <div class="form-caption">
                            <h4><b>경험 / 활동 / 교육</b></h4>&nbsp;&nbsp;&nbsp;
                            <span style="font-size: 0.8em;">*필수정보입력</span>
                        </div>
                        <hr style="width: 100%;">
                        <table class="" style="width: 100%;">
                          <tr>
						    <td class="form-group">
						        <select class="form-select" style="width: 200px;">
						            <option>활동구분 선택*</option>
						            <option>교내활동</option>
						            <option>인턴</option>
						            <option>자원봉사</option>
						            <option>동아리</option>
						            <option>아르바이트</option>
						            <option>사회활동</option>
						            <option>수행과제</option>
						            <option>해외연수</option>
						        </select>
						        <input type="text" class="form-control" style="width: 220px;" placeholder="기관/장소명*">
						        <input type="date" class="form-control" style="width: 120px;">
						        <input type="date" class="form-control" style="width: 120px;">
						    </td>
						  </tr>
						   <b>활동 설명</b><br>
						  <tr>
						    <td class="form-group">
						     
						      <textarea class="form-control" style="height: 200px;" placeholder="경험/활동 상세내용 입력"></textarea>
						    </td>
						  </tr>
						  
						  <!-- 저장 취소 버튼 -->
                            <tr>
                              <td colspan="2" align="right">
                              <br>
                                <button type="submit" class="btn btn-outline-primary">저장</button>
                                <button type="button" class="btn btn-outline-primary">취소</button>
                              </td>
                            </tr>
						  
                        </table>
                    </form>
                </div>
                
                
                <!-- 자격/어학/수상 -->
                <div class="qualification">
				    <form action="insert5" method="post" enctype="multipart/form-data">
				        <div class="form-caption">
				            <h4><b>자격 / 어학 / 수상</b></h4>&nbsp;&nbsp;&nbsp;
				            <span style="font-size: 0.8em;">*필수정보입력</span>
				        </div>
				        <hr style="width: 100%;">
				        <table class="" style="width: 100%;">
				            <tr>
				                <td class="form-group">
				                    <select class="form-select" style="width: 200px;" id="qualification-select">
				                        <option value="none">구분*</option>
				                        <option value="qualify">자격증·면허증</option>
				                        <option value="language">어학시험</option>
				                        <option value="award">수상내역·공모전</option>
				                    </select>
				                </td>
				            </tr>
				            
				            <!-- 자격증 폼 -->
				            <tr id="qualify-options" style="display: none;">
				                <td class="form-group">
				                    <input type="text" class="form-control" style="width: 200px;" placeholder="자격증명*">
				                    <input type="text" class="form-control" style="width: 200px;" placeholder="발행처/기관*">
				                    <select class="form-select" style="width: 120px;">
				                        <option>합격구분*</option>
				                        <option>1차합격</option>
				                        <option>2차합격</option>
				                        <option>필기합격</option>
				                        <option>실기합격</option>
				                        <option>최종합격</option>
				                    </select>
				                    <input type="date" class="form-control" style="width: 120px;">
				                </td>
				            </tr>
				
				            <!-- 어학 폼 -->
				            <tr id="language-options" style="display: none;">
				                <td class="form-group">
				                    <input type="text" class="form-control" style="width: 200px;" placeholder="어학시험명*">
				                    <input type="date" class="form-control" style="width: 120px;">
				                    <input type="text" class="form-control" style="width: 200px;" placeholder="점수*">
				                </td>
				            </tr>
				            
				            <!-- 어워드 폼 -->
				            <tr id="award-options" style="display: none;">
				                <td class="form-group">
				                    <input type="text" class="form-control" style="width: 200px;" placeholder="수상·공모전명*">
				                    <input type="date" class="form-control" style="width: 120px;">
				                    <input type="text" class="form-control" style="width: 200px;" placeholder="수여·주최기관*">
				                </td>
				            </tr>
				
				            <!-- 저장 취소 버튼 -->
				            <tr>
				                <td colspan="2" align="right">
				                    <br>
				                    <button type="submit" class="btn btn-outline-primary">저장</button>
				                    <button type="button" class="btn btn-outline-primary">취소</button>
				                </td>
				            </tr>
				        </table>
				    </form>
				</div>
                
                
                <!-- 포트폴리오/기타문서 -->
                <div class="portfolio">
				    <form action="insert6" method="post" enctype="multipart/form-data">
				        <div class="form-caption">
				            <h4><b>포트폴리오 / 기타문서</b></h4>&nbsp;&nbsp;&nbsp;
				        </div>
				        <hr style="width: 100%;">
				        <table class="" style="width: 100%;">
				            <tr>
				                <td class="form-group">
				                    <p style="font-size: 0.8em;">내 포트폴리오 및 추가로 제출할 문서를 첨부해보세요</p>
				                </td>
				            </tr>
				            
				            <tr>
				              <td class="form-group">
				                <input type="file" name="portfolioname" id="portfolioname" style="display: none;">
				                    <button type="button" id="portfoliofile" 
				                    class="btn btn-primary" style="width: 980px;">+ 포트폴리오 및 기타문서 추가</button>
				              </td>
				            </tr>
				            
				            <!-- 저장 취소 버튼 -->
				            <tr>
				                <td colspan="2" align="right">
				                    <br>
				                    <button type="submit" class="btn btn-outline-primary">저장</button>
				                    <button type="button" class="btn btn-outline-primary">취소</button>
				                </td>
				            </tr>
				        </table>
				    </form>
				</div>
				
				
				<!-- 자기소개서 -->
                <div class="self">
                    <form action="insert7" method="post">
                        <div class="form-caption">
                            <h4><b>자기소개서</b></h4>&nbsp;&nbsp;&nbsp;
                        </div>
                        <hr style="width: 100%;">
                        <table class="" style="width: 100%;">
                          <tr>
						    <td class="form-group">
						        <input type="text" class="form-control" style="width: 700px;" placeholder="자기소개서 제목">
						    </td>
						  </tr>
						  <tr>
						    <td class="form-group">
						     
						      <textarea class="form-control" style="height: 200px;" 
						      placeholder="코드커넥트인만의 특벽한 자소서 툴과 함께 차별화된 자기소개서를 완성해보세요"></textarea>
						    </td>
						  </tr>
						  
						  <!-- 저장 취소 버튼 -->
                            <tr>
                              <td colspan="2" align="right">
                              <br>
                                <button type="submit" class="btn btn-outline-primary">저장</button>
                                <button type="button" class="btn btn-outline-primary">취소</button>
                              </td>
                            </tr>
						  
                        </table>
                    </form>
                </div>
                
                
                <!-- 희망근무조건 -->
                <div class="hope">
                    <form action="insert8" method="post">
                        <div class="form-caption">
                            <h4><b>희망근무조건</b></h4>&nbsp;&nbsp;&nbsp;
                        </div>
                        <hr style="width: 100%;">
                        <table class="" style="width: 100%;">
                          <tr>
						    <td class="form-group">
						        <select class="form-select" style="width: 300px;">
				                        <option>고용형태</option>
				                        <option>정규직</option>
				                        <option>계약직</option>
				                        <option>프리랜서</option>
				                        <option>인턴직</option>
				                </select>
				                <input type="text" class="form-control" style="width: 200px;" placeholder="희망연봉">만원이상 &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
				                <input type="checkbox">면접 후 결정
						    </td>
						  </tr>
						  
						  
						  <!-- 저장 취소 버튼 -->
                            <tr>
                              <td colspan="2" align="right">
                              <br>
                                <button type="submit" class="btn btn-outline-primary">저장</button>
                                <button type="button" class="btn btn-outline-primary">취소</button>
                              </td>
                            </tr>
						  
                        </table>
                    </form>
                </div>
                
                
                <!-- 동의내역 -->
                <div class="total">
                    <form action="insert9" method="post">
                        <hr style="width: 100%;">
                        <table class="" style="width: 100%;">
                          <tr>
						    <td class="form-group">
						        <input type="checkbox" style="font-size: 1.2em;">모두 동의합니다.&nbsp;&nbsp;&nbsp;&nbsp;
						        <span style="font-size: 0.8em;">이력서 장성을 위한 개인정보 수집 및 이용 동의(필수/선택)</span>
						    </td>
						  </tr>
						  
						  <tr>
						    <td class="form-group">
						      <hr style="width: 100%;">
						    </td>
						  </tr>
						  
						  <tr>
						    <td class="form-group">
						        <span style="font-size: 0.8em;"><input type="checkbox">  필수 항목에 대한 개인정보 수집 및 이용 동의</span>
						        <span style="font-size: 0.8em;"><a href=""  style="text-decoration: none; color: gray;">상세보기 ></a></span>
						    </td>
						  </tr>
						  
						  <tr>
						    <td class="form-group">
						        <span style="font-size: 0.8em;"><input type="checkbox" >  선택 항목에 대한 개인정보 수집 및 이용 동의</span>
						        <span style="font-size: 0.8em;"><a href=""  style="text-decoration: none; color: gray;">상세보기 ></a></span>
						    </td>
						  </tr>

                        </table>
                    </form>
                </div>
                
                <!-- 최종 저장 및 미리보기 -->
                  <tr>
                    <td align="right" >
                    <br>
                    <br>
                    <br>
                      <button type="button" class="btn btn-outline-primary">미리보기</button>
                      <button type="submit" class="btn btn-primary">작성완료</button>
                     <br>
                     <br>
                    </td>
                  </tr>
                
                
            </div>
        </div>
    </div>
    
    
    <!-- script -->
    <script>
    
        // 학력 고등학교, 대학 선택하면 폼이 다르게 나타남
        document.addEventListener('DOMContentLoaded', function() {
        	
        var educationSelect = document.getElementById('education-select');
        var highschoolOptions = document.getElementById('highschool-options');
        var universityOptions = document.getElementById('university-options');
        var highschoolOptionsDetails = document.getElementById('highschool-options-details');
        var universityOptionsDetails = document.getElementById('university-options-details');

        educationSelect.addEventListener('change', function() {
            if (educationSelect.value === 'highschool') {
                highschoolOptions.style.display = 'block';
                universityOptions.style.display = 'none';
                highschoolOptionsDetails.style.display = 'table-row'; // 추가
                universityOptionsDetails.style.display = 'none';
            } else if (educationSelect.value === 'university') {
                highschoolOptions.style.display = 'none';
                universityOptions.style.display = 'block';
                highschoolOptionsDetails.style.display = 'none';
                universityOptionsDetails.style.display = 'table-row'; // 추가
            } else {
                highschoolOptions.style.display = 'none';
                universityOptions.style.display = 'none';
                highschoolOptionsDetails.style.display = 'none';
                universityOptionsDetails.style.display = 'none';
            }
        });
    });
        
        
        
        //자격 / 어학 / 수상 구분 선택하면 카테고리에 맞게 폼 나타내기
        document.addEventListener('DOMContentLoaded', function() {
		    var qualificationSelect = document.getElementById('qualification-select');
		    var qualifyOptions = document.getElementById('qualify-options');
		    var languageOptions = document.getElementById('language-options');
		    var awardOptions = document.getElementById('award-options');
		
		    qualificationSelect.addEventListener('change', function() {
		        if (qualificationSelect.value === 'qualify') {
		            qualifyOptions.style.display = 'block';
		            languageOptions.style.display = 'none';
		            awardOptions.style.display = 'none';
		        } 
		        else if (qualificationSelect.value === 'language') {
		            qualifyOptions.style.display = 'none';
		            languageOptions.style.display = 'block';
		            awardOptions.style.display = 'none';
		        } 
		        else if (qualificationSelect.value === 'award') {
		            qualifyOptions.style.display = 'none';
		            languageOptions.style.display = 'none';
		            awardOptions.style.display = 'block';
		        } 
		        else {
		            qualifyOptions.style.display = 'none';
		            languageOptions.style.display = 'none';
		            awardOptions.style.display = 'none';
		        }
		    });
		});
        
        
        
        $(function () {
      	  
        	//버튼 클릭 시 파일 열기 (증명사진넣기)
        	$("#plusphoto").click(function () {
        		
        		$("#myphoto").trigger("click");
        	});
        	
        	
        	//사진을 불러오면 증명사진 미리보기로 넣기
        	$("#myphoto").change(function () {
        		
        		if ($(this)[0].files[0]) {
        	        var reader = new FileReader();
        	        reader.onload = function (e) {
        	            $("#showimg").attr('src', e.target.result);
        	        }
        	        reader.readAsDataURL($(this)[0].files[0]);
        	    }

        	});
        	
        	
        	//버튼 클릭 시 포트폴리오 또는 기타 자료 첨부
        	$("#portfoliofile").click(function () {
        		
        		$("#portfolioname").trigger("click");
        	});
        	
        })	
        
        
        
   </script>
    
</body>
</html>
