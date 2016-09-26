package functions_and_lambdas.inline_functions.non_local_returns

inline fun inlineFunction(x:Int, argFun: (Int) -> Int) {
    argFun(x)
}

fun normalFunction(x: Int, argFun: (Int) -> Int) {
    argFun(x)
}

fun main(args: Array<String>) {
    inlineFunction(1) {
        println("in")
        return
    }
    println("out")

    // this section can't be compiled
//    normalFunction(1) {
//        println("in")
//        return
//    }
//    println("out")
}