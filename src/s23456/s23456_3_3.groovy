package s23456
def a
new File('C:\\Users\\Karolina\\Videos\\semestr 3\\PJP\\zadania\\src\\s23456\\resources\\text').eachLine { line ->
    a = line.find(/\d{4}\-(0[1-9]|1[012])\-(0[1-9]|[12][0-9]|3[01])/)
    if (a != null){
        println (a)
    }

}







