fun main(){
var z=14%4
    println(z)
    var y= sentence("Charity",23)
    println(y)
    var a=takeString("codeHive")
    println(a)

    //Given a string "codehive",write a function that prints out a string composed of the  5th,6th,7th
    //and 8th characters of the string

    var coding="codeHive"
    var result=coding[4]+ String()+coding[5]+coding[6]+coding[7]
    println(result)
}
//Create and invoke a function that given two numbers returns the remainder of their division

fun division(a:Int,b:Int):Int{
    var modulus=a%b
    return modulus
}
//Write a function that takes in two parameters name and age and returns a string with this structure
//"Hi my name is p and iam z years" where p and z are your name and age respectively

fun sentence(name:String,age:Int):String{
    var stmt="Hi my name is $name and iam $age years old"
    return stmt
}
//write a function that takes in a string and returns it's length.
fun takeString(name: String):Int{
    var stmt=name.length
    return stmt
}