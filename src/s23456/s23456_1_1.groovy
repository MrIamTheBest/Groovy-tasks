package s23456

println "helloworld"
print "Podaj numer: "
def number = System.in.newReader().readLine()
for(i = 0;i<number.length();i++) {
    int value = number[i].toInteger()
    switch(value) {
        case 1:
            print("jeden ");
            break;
        case 2:
            print("dwa ");
            break;
        case 3:
            print("trzy ");
            break;
        case 4:
            print("cztery ");
            break;
        case 5:
            print("pięć ");
            break;
        case 6:
            print("sześć ");
            break;
        case 7:
            print("siedem ");
            break;
        case 8:
            print("osiem ");
            break;
        case 9:
            print("dziewięć ");
            break;
    }
}
