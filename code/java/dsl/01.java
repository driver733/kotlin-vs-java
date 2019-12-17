val order = Sandwich()
    .type("toastie")
    .bread("white")
    .fillings(List.of("Cheese", "Ham"))
    .dressings(List.of("Pepper", "Worcestershire sauce"))
    .side("Crisps")
    .makeMeASandwich()

System.out.println(ooSandwich.receipt())

// https://www.kotlindays.com/2019/12/02/days-of-kotlin-a-dsl-for-everyone/index.html