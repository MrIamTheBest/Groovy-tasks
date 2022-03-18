package s23456

    def kurs = 0.222
    def a
    new File('C:\\Users\\Karolina\\Videos\\semestr 3\\PJP\\zadania\\src\\s23456\\resources\\text').eachLine { line ->
        a = line
        def pln, eur
        pln = a.find(/(\d+(?:\.\d{1,2})?)\s?(PLN)/)
        if (pln != null) {
            def money
            money = (pln.find(/(\d+(?:\.\d{1,2})?)/) as double) * kurs
            eur = money + " EUR"
            print eur +" "
        }
    }
