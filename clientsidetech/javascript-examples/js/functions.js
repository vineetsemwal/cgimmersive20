function multiply(num1 ,num2){
    var result=num1*num2;
    return result;
}

var result=multiply;

var output1=result(2,3);
console.log("output1 is "+output1);

var addBy10=function(num){
  var result=num+10;
  return result;
};

var output2=addBy10(5);
console.log("output2 is "+output2);



