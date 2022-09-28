fun main(args: Array<String>)
{
    val numbers = listOf(1, 55, 25, 32, 2, 67, 31, 33, 11, 25, 66, 81, 97, 43, 46, 81)





    //-----------------------------------
    println("-----------------------------------")
    println("С использованием цикла for")
    println("-----------------------------------\n\n")
    println("Нечётные числа данной последовательности: ")
    for(i in 0..numbers.size-1)
    {
        if(numbers[i]%2==1)
            print(numbers[i].toString() + " ");
    }
    println("\n\nЧисла, которые не делятся без остатка на 3: ")
    for(i in 0..numbers.size-1)
    {
        if(numbers[i]%3!=0)
            print(numbers[i].toString() + " ");
    }
    println("\n\nЧисла, которые без остатка делятся на свой порядковый номер")
    for(i in 1..numbers.size-1)
    {
        if(numbers[i]%i==0)
            print(numbers[i].toString() + " ");
    }

    println("\n\n-----------------------------------")
    //-----------------------------------





    //-----------------------------------
    println("С использованием функции forEach")
    println("-----------------------------------\n\n")
    println("Нечётные числа данной последовательности: ")
    for(number in numbers)
    {
        if(number%2==1)
            print(number.toString() + " ");
    }
    println("\n\nЧисла, которые не делятся без остатка на 3: ")
    for(number in numbers)
    {
        if(number%3!=0)
            print(number.toString() + " ");
    }
    println("\n\nЧисла, которые без остатка делятся на свой порядковый номер")
    for(number in numbers)
    {
        try {
            if(number%numbers.indexOf(number)==0)
                print(number.toString() + " ");
        }
        catch (e:Exception)
        {

        }
    }
    println("\n\n-----------------------------------")
    //-----------------------------------



    //-----------------------------------
    println("С использованием функции filter, filter")
    println("-----------------------------------\n\n")
    println("Нечётные числа данной последовательности: ")
    val oddNumbers = numbers.filter { it%2==1}
    println(oddNumbers)
    println("\nЧисла, которые не делятся без остатка на 3: ")
    val remainderDivisionThree = numbers.filter { it%3!=0}
    println(remainderDivisionThree)
    println("\nЧисла, которые без остатка делятся на свой порядковый номер")
    val remainderDivisionIndex = numbers.filter { numbers.indexOf(it)!=0 && it%numbers.indexOf(it)==0}
    println(remainderDivisionIndex)
    println("\n\n-----------------------------------")
    //-----------------------------------



    //-----------------------------------
    println("С использованием функции forEachIndexed")
    println("-----------------------------------\n\n")
    println("Нечётные числа данной последовательности: ")
    numbers.forEachIndexed { index, value ->
        if(value%2==1)  print(value.toString() + " ");
    }
    println("\n\nЧисла, которые не делятся без остатка на 3: ")
    numbers.forEachIndexed { index, value ->
        if(value%3!=0)  print(value.toString() + " ");
    }

    println("\n\nЧисла, которые без остатка делятся на свой порядковый номер")
    numbers.forEachIndexed { index, value ->
        if(index!=0 && value%index==0)  print(value.toString() + " ");
    }
    println("\n\n-----------------------------------")
    //-----------------------------------



    //-----------------------------------
    println("С использованием функции filterIndexed")
    println("-----------------------------------\n\n")

    println("Нечётные числа данной последовательности: ")
    val filteredOdd = numbers.filterIndexed { index, value -> (value%2==1)  }
    println(filteredOdd)

    println("\nЧисла, которые не делятся без остатка на 3: ")
    val filteredDivisionThree = numbers.filterIndexed { index, value -> (value%3!=0)  }
    println(filteredDivisionThree)

    println("\nЧисла, которые без остатка делятся на свой порядковый номер")
    val filteredDivisionIndex = numbers.filterIndexed { index, value -> (index!=0)&&(value%index==0)  }
    println(filteredDivisionIndex)

    println("\n\n-----------------------------------")
    //-----------------------------------

}

