
숫자만 : ^[0-9]*$    // ^는 정규식의 시작 []안은 범위 *은 해당 문자열에 있는 모든 숫자 $는 문자열의 끝

		영문만 : ^[a-zA-Z]*$ // ^는 정규식의 시작 []안은 범위이며 ,는 따로 하지 않는다. *은 해당 문자열에 있는 모든 숫자 $는 문자열의 끝

		영문만, 띄어쓰기가능 : ^[a-zA-Z\s]+$ // /s는 공백을 의미한다. a~z또는 A~Z로 구성되어있으며 뒤에 공백이 붙은 문자열

		한글만 : ^[가-힣]*$      // 한글은 가~힣까지이며, *을 붙여 모든 한글을 찾는다.

		한글만,띄어쓰기가능 : ^[가-힣\s]+$

		한글 & 영문만 : ^[가-힣a-zA-Z]+$;

		영문 & 숫자만 : ^[a-zA-Z0-9]*$

		E-Mail : ^[a-zA-Z0-9]+@[a-zA-Z0-9]+$

		휴대폰 : ^01(?:0|1|[6-9]) - (?:\d{3}|\d{4}) - \d{4}$  //01 뒤에 문자가 있을수도 있고 없을수도 있으며, 0,1,6,7,8,9중의 수로 되있는 문자열
// ?:\d{3}|\d{4}는 3자리 혹은 4자리의 숫자가 들어간다   \d{4}$는 숫자 4자리가 들어간다.   

// 예시가 2가지 이상이고 들어가도 되고 안들어가도 될경우  (?:\d{3}|\d{4})
// 특정 문자열 바로 뒤에 특정 숫자가 있을 경우 01(?:0|1|[6-9])
// 시작 또는 마지막을 나타낼때 "^[.]|[.]$"
// .이 2번이상인 문자열."[.]{2,})
// "[^a-z]"  []안에 ^가 들어가면 a-z를 제외한 모든 문자열이다.