package s23456

def kurs = 0.222
def a
def file = new File("MenuEur.txt")
new File('path').eachLine { line ->
    //a = line
    def pln, eur
    pln = line.find(/(\d+(?:\.\d{1,2})?)\s?(PLN)/)
    if (pln != null) {
        def money
        money = (pln.find(/(\d+(?:\.\d{1,2})?)/) as double) * kurs
        eur = money + " EUR"
       // print eur +" "
      a=  line.replace(pln,eur)
    }
    file.write(a)
}

