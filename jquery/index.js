// ques1
// $(document).ready(function()
// 	{
// 		console.log('Hello World');
//     });

// ques2
// $(document).ready(function()
// 	{
//         $("#test").addClass("load");
// 	});

// ques3
// $(document).ready(function()
// {
// 	 $("[class$=-new]").css('color','red') 
// });

// ques4
// $(document).ready(function()
// {
// 	$('#disable').attr("disabled", 'disabled');
// });
// ques5
// $(document).ready(function()
// {
// 	 $("#main").css('font-size','500%') 
// });

// ques6
// $(document).ready(function()
// {
// 	$("div").html($("p").html())
// });

// // Ques7
// var a =$("<input>",{
// 	type: "submit",
// 	value:"click",
// 	id:"click_next"
// });
// $(document).ready(function()
// {
// 	$("#submitbutton").bind("click", function(){
// 		a.insertAfter($("#submitbutton"));
// 	});
// });

// ques8
// $(document).ready(function(){
// 	var el = $("<input>", {
// 		type: "submit",
// 		value: "Click2",
// 		class:"click_next"
// 		}).on('click',function()
// 	{
// 		console.log("hello");
// 		alert("Click button is enabled.");
// 		});
// $("#submitbtn").on('click',function(){
//     el.insertAfter($("#submitbtn"));
// 	});
// });

// ques9
// $(document).ready(function()
// {
// 	$('select').on("change",function(e)
// 	{
// 		$("#changed").text($("#on_change : selected").val());
// 	});
// });
// 

// Q11
// $(document).ready(function(){
// 	$('a').click(function(e){
// 		e.preventDefault();
// 		console.log(' Event prevented');
// 	});
// });

// 
// 
// ques12
// $(document).ready(function(){
// 			$("div").click(function(){
// 				console.log('you clicked div tag');
// 			});
// 			$("li").click(function(e){
// 				e.stopPropagation()
// 				console.log('you clicked li only');
// 			});
// 			$("p").click(function(e){
// 				console.log('you clicked p tag');
// 			});
// 		});

// 

// ques14
// $(document).ready(function(){
// 	$(".findNum").each(function(){
// 		if($(this).text() > 10) $(this).css('background-color', 'blue');	
// 	});
// });

// ques15
// $(document).ready(function(){
// 	$.ajax({
//     url: "https://jsonplaceholder.typicode.com/todos/2",
//     dataType: "json",
//     success: function(res){
//     $("#ajax").html("<b>" + JSON.stringify(res) + "</b>");
//     },
// 	});
// });

// ques16
// $(document).ready(function(){
// 	$.ajax({
// 	url: "https://jsonplaceholder.typicode.com/todos/2",
//     dataType: "json",
//     type: 'DELETE',
//     success: function(res){
//     $("button").on('click', function(){
//     $('tr').remove();
//           });
//         }
//    	});
// });

$(document).ready(function(){
	let image_arr=["tothenew.jpeg","picture.jpeg","ubuntu.jpeg"];
	let index=0;
	setInterval(function(){ 
	if(index>2)
	index=0;
	else
	index++;
	console.log(index);
	$("img").attr("src",image_arr[index]);}, 500);
});
