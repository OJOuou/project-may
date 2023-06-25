
/** 빈 값 체 */
function isEmpty(obj){
	
	if(obj != null && obj !== undefined && obj.length > 0){
		return false;
	}
	
	return true;
}

/** string trim 적용하여 length 0 체크 */
function isTrimEmpty(str){
	
	if($.trim(str).length > 0) {
		return false;
	}
	
	return true;
}

/** 공통 ajax */
const post = (url, data) => {
	return new Promise(function(resolve, reject){
		$.ajax({
			type : "POST",
			url : url, //요청 할 URL
			data : JSON.stringify(data), //넘길 파라미터
			contentType: "application/JSON; charset=utf-8",
			dataType : "json",
			cache : false,
			beforeSend : function(jqXHR, settings ){
				
			},
			complete:function(){
	            
	        },
			success : function(response) {
				
		 		resolve(response)
			},
			error : function(request,status,error) {
				reject(request,status,error)
			}
		})
	});
	
}