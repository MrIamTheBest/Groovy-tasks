package s23456



print "Podaj dowolne znaki "
def list = []
System.in.withReader {
    for (i in 0..9)
        list << it.readLine()
//println list
}
def c= []
def getData = {
    for(item in list){
        try {
            if (item.lenght()>3)
            c.add(item)
            println c
        } catch (e) {
            // println "Podano niewłaściwą liczbę"
        }

    }
}
getData()
def a=[]
def getDataInteger = {
    for(item in list) {
        try {
            item as Integer
            a.add(item)

        } catch (e) {
           // println "Podano niewłaściwą liczbę"
        }
    }
    println a
}
getDataInteger()
def b=[]
def getDataString = {
    for(item in list) {
        try {
            item as String
            b.add(item)

        } catch (e) {
            // println "Podano niewłaściwą liczbę"
        }
    }
    println b
}
getDataString()

