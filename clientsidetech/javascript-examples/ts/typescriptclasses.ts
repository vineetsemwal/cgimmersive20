class User{
    id:number;
    name:string;
    
    constructor(id:number,name:string){
    this.id=id;
    this.name=name;
    }
    
    toString(){
     let text:string=this.id+" "+this.name;
     return text;
    }
    }
    
    class Customer extends User{
    balance:number;
    
    constructor(id:number,name:string,balance:number){
        super(id,name);
        this.balance=balance;
    }
    toString(){
        let text:string=this.id+" "+this.name+" "+this.balance;
     return text;
    }
    
    } 
    
    
    class Admin extends User{
        organization:string;
    
        constructor(id:number, name:string,org:string){
            super(id,name);
            this.organization=org;
        }
        toString(){
            let text:string=this.id+" "+this.name+" "+this.organization;
         return text;
        }
        
    }
    
    let customer1:Customer=new Customer(1,'avichal',200);
    let admin:Admin=new Admin(2,'shubank','capgemini');
    
    console.log("customer ="+customer1.id+" "+customer1.name+" "+customer1.balance);
    let customerText:string=customer1.toString();
    console.log("customer1 text= "+customerText);
    console.log("admin="+admin.id+" name="+admin.name+" organizatioon="+admin.organization);
    let adminText:string=admin.toString();
    console.log("admin to string="+adminText);
    
    
    
    
    
    
    
    
    