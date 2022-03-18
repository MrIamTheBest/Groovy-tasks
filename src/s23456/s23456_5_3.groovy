package s23456

String[] words=new File('C:\\Users\\Karolina\\Videos\\semestr 3\\PJP\\zadania\\src\\s23456\\resources\\lista.txt')
def lista= words
def unique=[]
def map = [:]
lista.each {
    if(!unique.contains(it)){
        unique.add(it)
      map.put(it,1)
    }
    else
   map.put(it,map[it]+=1)
}
println unique
println map
println lista