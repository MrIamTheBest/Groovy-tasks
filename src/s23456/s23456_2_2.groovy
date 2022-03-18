package s23456

print "Podaj liczby całkowite "
Scanner scan=new Scanner(System.in)
def list = []
while(scan.hasNextLine()) {
    if (scan.hasNextLine()){
        try {
           // scan.nextInt() as Integer
            list.add(scan.nextInt())
            //println " is number"
            println list
        } catch (e) {
            println "Podano niewłaściwą liczbę, podaj jeszcze raz"
            scan.next();
        }
       // System.out.println(scan.nextInt());
  }
    else
        scan.next();
}





