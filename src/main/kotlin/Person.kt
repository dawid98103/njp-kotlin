class Person(
    var firstName: String,
    var lastName: String,
    var ssn: String = "", //Zad 13 - wartość domyślna
    var dateOfBirth: String,
    var gender: Char) {

    //Zad 15 - dodatkowy konstruktor

    constructor(firstName: String, lastName: String, ssn: String, gender: Char): this(
        firstName,
        lastName,
        ssn,
        dateOfBirth = "0000-00-00",
        gender
    )
}
