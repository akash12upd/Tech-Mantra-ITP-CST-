let nCount = selector => {
    $(selector).each(function () {
      $(this)  //this keyword refers to the current object of jquery, it is same as the this keyword of java programming !!
        .animate({
          Counter: $(this).text()
        }, {
          // A string or number determining how long the animation will run.
          duration: 4000,
          // A string indicating which easing function to use for the transition.
          easing: "swing",
          /**
           * A function to be called for each animated property of each animated element. 
           * This function provides an opportunity to
           *  modify the Tween object to change the value of the property before it is set.
           */
          step: function (value) {
            $(this).text(Math.ceil(value));
          }
        });
    });
  };
  
  let a = 0;
  $(window).scroll(function () {
    // The .offset() method allows us to retrieve the current position of an element  relative to the document
    let oTop = $(".numbers").offset().top - window.innerHeight;
    if (a == 0 && $(window).scrollTop() >= oTop) {
      a++;
      nCount(".rect > h1");
    }
  });
  
  
  
  /**
   *
   *  sticky navigation
   *
   */
  
  let navbar = $(".navbar");         // calling the jquery object to store nav div functions
  
  $(window).scroll(function () {        //creating an event on window by the help of jquery using scroll property
    // get the complete hight of window
    let oTop = $(".section-1").offset().top - window.innerHeight;      // fetching the complete hieght of the window using window.innerheight and adding the section starting from which we want our sticky header .
    if ($(window).scrollTop() > oTop) {
      navbar.addClass("sticky");       //adding the navbar
    } else {
      navbar.removeClass("sticky");    //removing the navbar
    }
  });