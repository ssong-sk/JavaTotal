function pop1() {
    window.open('../image/쇼핑몰사진/1.jpg', 'event', 'width = 500, height=500');
}

function pop2() {
    newpopup = window.open('../image/연예인사진/9.jpg', 'event', 'width=400, height=400'); //전역으로 돌려서 사용
    setTimeout('newpopup.close()',3000); //3000이면 3초뒤에 닫는 다는 의미
}