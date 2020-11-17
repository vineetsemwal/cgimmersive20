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

    var user3={"id":3,
    "name":"shivam",
    
    toString:function(){
        var text= "id is "+this.id + "name is "+this.name;
         return text;
        }
       
    };
    
    var users=[user1,user2];
    users.push(user3);

   for(var i=0;i<users.length;i++){
     var temp=users[i];  
    console.log("iterated user="+temp.id+" "+temp.name);
    var text=temp.toString();
    console.log("to string representation="+text);
   }



