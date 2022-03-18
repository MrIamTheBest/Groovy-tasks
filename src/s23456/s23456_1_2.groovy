package s23456


println "Podaj produkt i koszt"
def productMap = [:]
    while( true ) {
        Scanner scan = new Scanner( System.in );
        print "Podaj Produkt "
        def product = System.in.newReader().readLine()
        print "Podaj koszt "
        def price = scan.nextDouble();
        println "Produkt i koszt: $product =$price"
        println "KOntynuować dodawanie produktów? tak/nie"


        if(productMap.containsKey(product)){
            productMap[product]+=price
        }
        else {
            productMap[product] = price
        }
        String enteredByUser = scan.next();

        if (enteredByUser == "nie") {

            print productMap

            break;
        }
    }

