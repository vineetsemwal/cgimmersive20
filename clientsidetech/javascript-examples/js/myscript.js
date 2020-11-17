
    function greet(elementId){
        var desiredText="<h3> welcome to javascript </h3>";    
        var element =document.getElementById(elementId);
        element.innerHTML=desiredText;
         console.log("element changed");
        }