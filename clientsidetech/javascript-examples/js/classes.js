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

class Customer extends User{
balance;

constructor(id,name,balance){
    super(id,name);
    this.balance=balance;
}
toString(){
    let text=this.id+" "+this.name+" "+this.balance;
 return text;
}

} 


class Admin extends User{
    organization;

    constructor(id, name,org){
        super(id,name);
        this.organization=org;
    }
    toString(){
        let text=this.id+" "+this.name+" "+this.organization;
     return text;
    }
    
}

let customer1=new Customer(1,'avichal',200);
let admin=new Admin(2,'shubank','capgemini');

console.log("customer ="+customer1.id+" "+customer1.name+" "+customer1.balance);
let customerText=customer1.toString();
console.log("customer1 text= "+customerText);
console.log("admin="+admin.id+" name="+admin.name+" organizatioon="+admin.organization);
let adminText=admin.toString();
console.log("admin to string="+adminText);








