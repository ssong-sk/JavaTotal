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
  
  /* 인정사항 css */
  .personal {
      margin-top: 8%;
  }
  
  .form-caption {
      display: flex;
      align-items: center;
      margin-bottom: 10px;
  }
  
 .form-group {
        display: flex; /* 내용을 가로로 배치 */
        gap: 5px; /* 간격을 5px로 설정 (원하는 만큼 조절 가능) */
        align-items: center; /* 요소를 세로로 가운데 정렬 */
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
</style>
</head>
<body>
    <div class="all">
        <div id="wrap">
            <div class="center">
            
                <!-- 이력서 제목 부분 -->
                <div class="title">
                    <form action="insert1" method="post" enctype="multipart/form-data">
                        <table class="" style="width: 80%;">
                            <tr>
                                <td>
                                    <input type="text" class="form-control" placeholder="이력서 제목을 입력해주세요">
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
                        <hr style="width: 80%;">
                        <table class="" style="width: 80%;">
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
						      <input type="file" style="display: none;">
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
                        <hr style="width: 80%;">
                        <table class="" style="width: 80%;">
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
   </script>
    
</body>
</html>
