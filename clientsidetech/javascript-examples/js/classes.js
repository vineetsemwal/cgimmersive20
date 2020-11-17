class User{
id;
name;

constructor(id,name){
this.id=id;
this.name=name;
}

toString(){
 let text=this.id+" "+this.name;
 return text;
}
}

let user1=new User(1,'harshil');
let user2=new User(2,'jay');

console.log("user1 id ="+user1.id+" name="+user1.name);
let user1Text=user1.toString();
console.log("user1 tostring ="+user1Text)
console.log("user2 id="+user2.id+" name"+user2.name)
let user2Text=user2.toString();
console.log("user 2 text="+user2Text);

