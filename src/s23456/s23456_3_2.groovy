package s23456

def pmap = [
        Groovy:['Asia','Jan'],
        Grails:['Asia','Jan','Stefan','Mirek'],
        Java:['Asia','Stefan','Mirek'],
        JEE:['Slawek','Stefan','Janusz']
]
pmap.each{ key, value->
    print "$key: "
   b=value.size()
    println(b)
}
println"Więcej niż dwoch pracowników: "
pmap.each{ key, value->
   if(value.size()>2){
       println " $key "
   }
}
def test(pmap){
  given:
def names = []
pmap.each { key, value ->
    value.value.each { name ->
        if (!names.contains(name as String)) {
            names.add(name as String)
        }
    }
}
    def map=[:]
//println names
    names.each{name->
        def temp=[]
        pmap.each{value->
        if(value.value.contains(name)){
            temp.add(value.key)
        }
        }
        map.put(name,temp)
    }
    println map
}
test(pmap)
