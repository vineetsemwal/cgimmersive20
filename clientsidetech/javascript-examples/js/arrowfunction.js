let add =(num1,num2)=>num1+num2;
let output1=add(1,2);
console.log("add output="+output1);

let mul=(num1,num2)=>{
    var result=num1*num2;
    return result;
};

let output2=mul(2,3);
console.log("mul ouput="+output2);

let square=num=>num*num;
let output3=square(10);
console.log("square output="+output3);

let greet=()=>"welcome to javascript";
let output4=greet();
console.log("greet message is "+output4);