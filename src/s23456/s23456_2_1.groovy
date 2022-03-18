package s23456

def maximum(x) {
    a = x.max()
    println("Maximum: " + a)
    def indexlist=[]
    x.eachWithIndex { value, index ->
        if (value == a){
            indexlist.add(index)
        }
    }
    println "Indexes: "+indexlist
}
maximum([1, 2, 8, 3, 11, 7, 11])
maximum(["b", "b", "c", "a", "c"])






