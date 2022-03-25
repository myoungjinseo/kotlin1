var myVar : Int = 100 //전역변수

fun main() {
    println("Hello World!")

    var var1 : Int = 10
    var var2 : Float = 10.1f
    var var3 : Double = 10.2
    var var4 : Char = '안'
    var var5 : String = "안드로이드"
    println(var1)
    println(var2)
    println(var3)
    println(var4)
    println(var5)

    var oKnull : Int? = null    //null 일경우 ?를 붙여줌
    println(oKnull)

    var ary = ArrayList<Int>(1) //1개짜리 배열 리스트
    ary!!.add(100) //값 100을 추가  ,  !!을 써주는 이유 = null 이 들어갈 경우 오류 발생=> !!를 넣어서 미리 대비한다

    println(ary)

    var test =30
    if(test == 30 ){
        println("test is $test")
    } else{
        println("test is not 30")
    }

    var testString = if(test ==30){
        "test is $test"
    } else{
        "test is not 30"
    }
    println(testString)

    var count : Int = 85
    if(count>= 90){
        println("if문: 합격 (장학생)")
    } else if(count >=60){
        println("if문: 합격")
    } else{
        println("if문: 불합격")
    }

    var jumsu : Int = (count /10)*10
    when (jumsu){
        100 -> println("when문: 합격(장학생)")
        90 -> println("when문: 합격(장학생)")
        80,70,60 -> println("when문: 합격")
        else -> println("when문: 불합격")
    }

    var jumsu1 : Int = count
    when (jumsu1){
        in 90 .. 100 -> println("when문: 합격(장학생)")
        in 60 .. 89 -> println("when문: 합격")
        else -> println("when문: 불합격")
    }

    var one = Array<Int>(4,{0})
    one[0]=10
    one[3]=20

    println(one[0])

    var two = Array<IntArray>(3,{ IntArray(4) })
    two[0][0] =100
    two[2][3] =200
    println(two[0][0])

    var arraylist = ArrayList<Int>()
    var one1 = ArrayList<Int>(4)
    arraylist.add(10)
    arraylist.add(20)
    one1.add(10)
    one1.add(20)
    val hap1 = one1.get(0) + one1.get(1)
    val hap2 = arraylist[0] +arraylist[1] //안드로이드 스튜디오에서 자동변환 권유
    println(hap1)
    println(hap2)

    var one2 : IntArray = intArrayOf(10,20,30,40)
    for (i in one2.indices){
        println(one2[i])
    }

    var one3 : IntArray = intArrayOf(10,20,30)
    for (i in one3.indices) {
        println(one3[i])
    }
    for (value in one3){
        println(value)
    }

    var two1 : Array<String> = arrayOf("하나","둘","셋")
    for (i in 0..2 step 1) {
        println(two1[i])
    }

    var k : Int = 0
    while (k<two1.size){
        println(two1[k])
        k++
    }

    // 코틀린 람다식 사용
    val temp = arrayListOf("aa","bb","cc")
    temp.forEach{
        println("temp = $it")   //it 사용 : 람다의 파라미터가 하나인 경우 컴파일러가 추론 가능
    }
    temp.forEachIndexed{
        index,it->
        println("temp = ${it.toString()}/$index")
    }       //중첩된 람다에서는 it보다는 파라미터를 명시하는 것이 좋다


    //메소드와 전역변수, 지역변수
    var myVar : Int =0 // 지역변수
    println(myVar)

    var sum : Int = addFunction(10,20)
    println(sum)


    var num1 : Int = 100
    var num2 : Int =0

    try{
        println(num1/num2)
    } catch(e : java.lang.ArithmeticException){
        println("계산이 문제가 있습니다")
    }

    val testLow ="test"
    val testUpper = "TEST"

    println("equals =${testLow==testUpper}")
    println("equals =${testLow.equals(testUpper,true)}")
}

fun addFunction(num1: Int, num2:Int) : Int{
    var hap : Int
    hap = num1 +num2 +myVar
    return hap
}

