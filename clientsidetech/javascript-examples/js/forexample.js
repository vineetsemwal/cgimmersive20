function addNumbersTill(num){
    var result=0;
    for(var i=0;i<=num;i++){
        result=result+i;
    }
    return result;
}

var output=addNumbersTill(10);
console.log("output is "+output);
