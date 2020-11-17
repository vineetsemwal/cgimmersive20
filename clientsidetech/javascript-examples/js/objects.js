var user1={
"id":1,
 "name" : "harshil",
 
 toString:function(){
 var text= "id is "+this.id + "name is "+this.name;
  return text;
 }

};
var user2={"id":2,
"name":"jay",

toString:function(){
    var text= "id is "+this.id + "name is "+this.name;
     return text;
    }
   
};

console.log("user1 ="+user1.id+" "+user1.name);
var toString1=user1.toString();
console.log("tostring representation="+toString1);

console.log("user2="+user2.id+" "+user2.name);
var toString2=user2.toString();
console.log("toString representation="+toString2);