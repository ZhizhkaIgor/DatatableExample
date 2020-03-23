$(document).ready(function() {
			$('#myTable').DataTable( {
				processing : true,
			    serverSide : true,
			    ajax       : {
			    	url        :"/data",
				    dataSrc    : function ( data ) {
		                return data.data;
		            },
			    },
			    columns    : [
			           { data: "name",  title: "Name" },
			           { data: "title", title: "Title" },
			           { data: "text",  title: "Text",
			        	   render: (data)=>{
			        		  console.log('data in row : ' + data)
			        		   return "<button>" + data + "</button>"}
			           },
			           { data: "path",  title: "Image",
			        	   render: (data)=>{
			        		   console.log('data path in row : ' + data)
			        		   return "<img src=\"" + data + "\" width='50px' height='50px'>"}
			           },
			        ], 
			       
			});
});



function seyHello(){
	alert('Hello')
} 

