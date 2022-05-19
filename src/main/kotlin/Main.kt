fun main(args: Array<String>) {

    //Zad 9

    val person1 = Person(
        "John",
        "Smith",
        "0123456789",
        "1997-10-23",
        'M'
    )

    //Zad 11 - nazwane parametry

    val person2 = Person(
        firstName = "John",
        lastName = "Smith",
        ssn = "0123456789",
        dateOfBirth = "1997-10-23",
        gender = 'M'
    )

    //Zad 12

    var gameUser = GameUser(
        firstName = "John",
        lastName = "Doe",
        birthday = "1900-01-01",
        userName = "jdoe",
        registrationNumber = 0,
        userRank = 0.0
    )

    //Zad 13

    val person3 = Person(
        firstName = "John",
        lastName = "Smith",
        dateOfBirth = "1997-10-23",
        gender = 'M'
    )

    //Zad 15 - wystąpienie za pomocą konstruktora pomocniczego

    val person4 = Person(
        firstName = "John",
        lastName = "Smith",
        ssn = "0",
        gender = 'M'
    )
}