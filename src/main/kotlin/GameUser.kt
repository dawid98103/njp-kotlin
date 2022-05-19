class GameUser(
    val firstName:String,
    val lastName:String,
    val birthday:String = "", //Zad 14 - domyślna wartość
    val userName:String,
    val registrationNumber:Int,
    val userRank:Double = 0.0 //Zad 14 - domyślna wartość
)