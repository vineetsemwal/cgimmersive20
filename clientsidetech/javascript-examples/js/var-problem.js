function display(){
    {
        var i=10;
    }
    console.log("i="+i);// var is function scoped and not block scoped so i is available here
}


display();
