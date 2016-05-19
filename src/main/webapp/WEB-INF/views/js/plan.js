var slideUp = $(".slideUp");
var button = $(".button");

slideUp.click(function(){
	$(".first_slide").addClass("prv");
	$(".second_slide").addClass("active");
	$(".second_slide").addClass("show");

})

button.click(function(){
	$(".join_newyork").attr("src","../resource/img/share/join1.png")
})
/*原始动画*/

/*document.addEventListener("touchstart",function(e){
   e.preventDefault();
   var touch = e.touches[0];
   startX = touch.pageX;
   startY = touch.pageY;
   initialPos = currentPosition;   //本次滑动前的初始位置
   viewport.style.webkitTransition = ""; //取消动画效果
   startT = new Date().getTime(); //记录手指按下的开始时间
   isMove = false; //是否产生滑动
}.bind(this),false);
document.addEventListener("touchmove",function(e){
   e.preventDefault();
   var touch = e.touches[0];
   var deltaX = touch.pageX - startX;
   var deltaY = touch.pageY - startY;
   //如果X方向上的位移大于Y方向，则认为是左右滑动
   if (Math.abs(deltaX) > Math.abs(deltaY)){
       moveLength = deltaX;
       var translate = initialPos + deltaX; //当前需要移动到的位置
       //如果translate>0 或 
       if (translate = maxWidth){
           //移动页面
           this.transform.call(viewport,translate);
           isMove = true;
       }
       direction = deltaX>0?"right":"left"; //判断手指滑动的方向
   }
}.bind(this),false);
document.addEventListener("touchend",function(e){
   e.preventDefault();
   var translate = 0;
   //计算手指在屏幕上停留的时间
   var deltaT = new Date().getTime() - startT;
   if (isMove){ //发生了左右滑动
        //使用动画过渡让页面滑动到最终的位置
        viewport.style.webkitTransition = "0.3s ease -webkit-transform";
        if(deltaT //如果停留时间小于300ms,则认为是快速滑动，无论滑动距离是多少，都停留到下一页
            translate = direction == 'left'?
            currentPosition-(pageWidth+moveLength):currentPosition+pageWidth-moveLength;
            //如果最终位置超过边界位置，则停留在边界位置
            translate = translate > 0 ? 0 : translate; //左边界
            translate = translate //右边界
        }else {
            //如果滑动距离小于屏幕的50%，则退回到上一页
            if (Math.abs(moveLength)/pageWidth moveLength;
            }else{
                //如果滑动距离大于屏幕的50%，则滑动到下一页
                translate = direction == 'left'?
                currentPosition-(pageWidth+moveLength):currentPosition+pageWidth-moveLength;
                translate = translate > 0 ? 0 : translate;
                translate = translate  maxWidth : translate;
            }
        }
        //执行滑动，让页面完整的显示到屏幕上
        this.transform.call(viewport,translate);
    }
}.bind(this),false);*/

