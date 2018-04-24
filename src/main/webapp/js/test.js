function getServer(){
	$.ajax({
		url : "http://localhost:8080/ssmDemo1/queryAllUsers" ,
	    type : 'get',
	    timeout : 20000,
	    async:false,
	    contentType:"application/json; charset=utf-8",
	    success : function(jsonData) {
	    	console.log(jsonData);
		},
	    error :function( XMLHttpRequest, textStatus, errorThrown) {
	    alert("errror");
		}
	});	
};
function postServer(){
	var data={
			"name":"王苗苗",
			"sex":"女"
	}
	$.ajax({
		url : "http://localhost:8080/ssmDemo1/queryAllUsers" ,
	    type : 'post',
	    timeout : 20000,
	    async:false,
	    data:JSON.stringify(data),
	    contentType:"application/json; charset=utf-8",
	    success : function(jsonData) {
	    alert(jsonData.toString());
		},
	    error :function( XMLHttpRequest, textStatus, errorThrown) {
	    alert("errror");
		}
	});	
};