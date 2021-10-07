fun main() {
    var message = "today is 10th october"
    val toast = "opps ! Looks Like Something Went Wrong!"
//    toast = "You Are Not Authorized!"

    //in kotlin no need to define data type of the variables , program automatically detect the type of variable
    // this feature is known as TYPE INFERENCE

    //here we can define Variable by two Ways 1) Var 2) Val
    // ** val means Const as like JAVA , if we assign some value into it , we can't Change The Value Anymore
    // ** In Case of Var we can assign / reassign

    print(toast)
    println(message)

    // explicitly defining data type in kotlin

    var name : String = "Otis"

    println(name)
}