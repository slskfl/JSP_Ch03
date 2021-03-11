function check(){
	var result=false;
	if(document.frm.id.value==""){ //아이디를 입력하지 않은 경우
		alert("아이디를 입력하세요.");
		document.frm.id.focus();
	} else if(document.frm.age.value==""){ //나이를 입력하지 않은 경우
		alert("나이를 입력하세요.")
		document.frm.age.focus();
	}else if(isNaN(document.frm.age.value)){ //나이가 숫자가 아닌 경우
		alert("나이는 숫자만 입력해주세요.");
		document.frm.age.focus();
	} else{ //정상일 경우
		result=true;
	}
	return result;
//   var input=document.frm;
//   if(!input.id.value){
//      alert("아이디를 입력하세요.");
//      input.id.focus();
//      return false;
//   }else if(!input.age.value){
//      alert("나이를 입력하세요.");
//      input.age.focus();
//      return false;
//   }else if(isNaN(input.age.value)){
//      alert("나이는 숫자만 입력해주세요.");
//      input.age.focus();
//      return false;
//   }
//   return true;
}