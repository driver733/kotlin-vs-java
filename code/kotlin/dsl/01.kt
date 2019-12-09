val dslSandwich = sandwich {
    with type "toasted"
    bread = "baguette"

    filling("cheese")
    filling("ham")
    filling("tomato")

    dressings {
        +"Basil"
        +"Pepper"
    }

    sideOrders {
        side("French Fries")
    }

}

println(dslSandwich.receipt())

// https://www.kotlindays.com/2019/12/02/days-of-kotlin-a-dsl-for-everyone/index.html