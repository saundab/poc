account = {
	login : function(){
		$('#userlogin').validate({
			rules : {},
			messages : {},
			submitHandler : function(form){
				alert('going to alter the target url');
				//$("#userlogin").append($('#sessionKey').val());
			
				form.submit();
			}
		});
	}
}
