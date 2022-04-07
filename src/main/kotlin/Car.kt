import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

open class Car {
    var color : String =""
    var speed : Int =0
    companion object {
        var carCount : Int =0
        const val MAXSPEED : Int =200
        const val MINSPEED : Int =0
        fun currentCarCount() : Int{
            return carCount
        }
    }
    constructor(color: String , speed: Int){
        this.color = color
        this.speed = speed
        carCount ++
    }

    constructor(speed: Int){
        this.speed = speed
    }
    constructor(){

    }
    open fun upSpeed(value: Int){
        if (speed+value>=200)
            speed =200
        else
            speed = speed+value
    }
    fun downSpeed(value: Int){
        if (speed-value<=0)
            speed=0
        else
            speed = speed-value
    }
}

class Automoblie : Car {
    var seatNum : Int = 0
    constructor() {
    }
    fun countSeatNum() : Int{
        return seatNum
    }

    override fun upSpeed(value: Int) {
        if(speed + value >=300)
            speed =300
        else
            speed = speed +value
    }


}

abstract class Animal{
    var name : String = ""
    abstract fun move()
}

class Tiger : Animal() {
    var age : Int = 0
    override fun move() {
        println("네 발로 이동한다.")
    }
}

class Eagle : Animal() {
    var home : String =""
    override fun move() {
        println("날개로 날아간다..")
    }
}

interface iAnimal {
    abstract fun eat()
}

class iCat : iAnimal{
    override fun eat(){
        println("생선을 좋아한다.")
    }
}

class iTiger : Animal(),iAnimal{
    override fun move() {
        println("네 발로 이동한다.")
    }
    override fun eat(){
        println("멧돼지를 잡아먹는다.")
    }
}

class iEagle : Animal(){
    var home : String = ""
    override fun move() {
        println("날개로 날아간다.")
    }
}

fun addNumber (n1:Int, n2: Int): Int {
    return n1 + n2
}

fun main(){
//    var myCar1 : Car =Car()
//    myCar1.color = "빨강"
//    myCar1.speed = 0

//    var myCar2 : Car =Car()
//    myCar1.color = "파랑"
//    myCar1.speed = 0

//    var myCar3 : Car =Car()
//    myCar1.color = "초록"
//    myCar1.speed = 0

    var myCar1 : Car = Car("빨강",0)
    var myCar2 : Car = Car("파랑",0)
    var myCar3 : Car = Car("초록",0)

    myCar1.upSpeed(50)
    println("자동차1의 색상은 " +myCar1.color
        +"이며, 속도는 "+myCar1.speed+"km입니다.")

    myCar2.upSpeed(20)
    println("자동차1의 색상은 " +myCar2.color
            +"이며, 속도는 "+myCar2.speed+"km입니다.")


    myCar3.upSpeed(220)
    println("자동차1의 색상은 " +myCar3.color
            +"이며, 속도는 "+myCar3.speed+"km입니다.")

    val testLow="test"
    val testUpper = "TEST"

    println("equals=${testLow==testUpper}")
    println("equals=${testLow.equals(testUpper,true)}")

    println("생성된 차의 대수(정적 필드) ==> " + Car.carCount)
    println("생성된 차의 대수(정적 메소드) ==> " + Car.currentCarCount())
    println("차의 최고 제한 속도 ==> " + Car.MAXSPEED)

    println("PI의 값 ==> "+ Math.PI)
    println("3의 5제곱 ==> "+ Math.pow(3.0,5.0))

    var auto : Automoblie = Automoblie()
    auto.upSpeed(250)
    println("승용차의 속도는 "+auto.speed + "km입니다.")

    var tiger1 = Tiger()
    var eagle1 = Eagle()

    tiger1.move()
    eagle1.move()

    var animal : Animal

    animal = Tiger()
    animal.move()

    animal = Eagle()
    animal.move()

    var cat = iCat()
    cat.eat()

    var tiger = iTiger()
    tiger.move()
    tiger.eat()

    val addNumber = {n1:Int, n2:Int -> n1+n2}

    var strList = ArrayList<String>(4)
    strList.add("첫 번째")
    strList.add("두 번째")
//    strList.add(3)

    var str : String ="안녕하세요"
    if(str.equals("안녕하세요")){
        //문자열이 같으면 이곳을 수행
    }

    var now = Date()
    var sFormat = SimpleDateFormat("yyyyMMdd")
    println(sFormat.format(now))
}